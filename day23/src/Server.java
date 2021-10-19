import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
	private ServerSocket ss;
	private Socket soc;
	private PrintWriter pw;
	private BufferedReader br;
	private Hashtable<String, Socket> ht;
	public Server() throws Exception {
		ss = new ServerSocket(12345);
		ht = new Hashtable<>();
		while(true) {
			soc = ss.accept();
			ChatClient cc = new ChatClient(soc);
			cc.start();
		}
	}
	
	protected void sendMessage(String name, String msg, Socket soc) throws Exception {
		if (ht.size() == 0) {
			ht.put(name, soc);
			return;
		}
		Enumeration<String> enu = ht.keys();
		if (!ht.containsKey(name)) {		//해당하는 사람이 없다면...
			while(enu.hasMoreElements()) {
				String n = enu.nextElement();
				Socket s = ht.get(n);
				pw = new PrintWriter(s.getOutputStream(), true);
				pw.println("[" + name +"]님이 입장하셨습니다.");
				pw.flush();
			}
			ht.put(name, soc);
		}else {
			while(enu.hasMoreElements()) {
				String n = enu.nextElement();
				if (n.equals(name)) continue;
				Socket s = ht.get(n);
				pw = new PrintWriter(s.getOutputStream(), true);
				pw.println(name+":"+msg);
				pw.flush();
			}
		}
		
	}
	
	class ChatClient extends Thread{
		Socket soc;
		ChatClient(Socket soc){
			this.soc = soc;
		}
		public void run() {
			while(true) {
				try {
					br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
					String msg = br.readLine();
					if (msg == null) break;
					String[] str = msg.split("@");
					sendMessage(str[0], str[1], soc);
					
				}catch(Exception e) {
					e.printStackTrace();
				}	
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		new Server();
	}
}







