package member;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.*;

public class MemberClient extends JFrame implements ActionListener{
	private JToolBar jtb = new JToolBar();
	private JButton jbt1 = new JButton("입력");
	private JButton jbt2 = new JButton("삭제");
	private JButton jbt3 = new JButton("보기");
	private JButton jbt4 = new JButton("종료");
	
	private JTextArea jta = new JTextArea();
	
	ByteArrayOutputStream baos;
	BufferedOutputStream bos;
	ObjectOutputStream oos;
	
	DatagramPacket dp1, dp2;
	DatagramSocket ds;
	InetAddress ia;
	
	Member mb;
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", jtb);
		jtb.add(jbt1);
		jtb.add(jbt2);
		jtb.add(jbt3);
		jtb.addSeparator();
		jtb.add(jbt4);
		jta.setEditable(false);
		con.add("Center", jta);
	}
	
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		jbt3.addActionListener(this);
		jbt4.addActionListener(this);
	}
	
	public MemberClient(String title) {
		super(title);
		
		this.init();
		this.start();
		
		try {
			ds = new DatagramSocket(12346);
			ia = InetAddress.getByName("localhost");
		}catch(IOException e) {}
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MemberClient("member");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jbt1) {
			String name = JOptionPane.showInputDialog("이름을 입력 : ");
			String tel = JOptionPane.showInputDialog("전화번호를 입력 : ");
			mb = new Member(name, tel, "input");
			//Member 생성자 확인해보면 name, tel, select가 있는데 "input"은 select에 넣어서 이게 뭔지 컴퓨터가 알 수 있도록 해주는 구별자 역할
		}else if (e.getSource()==jbt2) {
			String name = JOptionPane.showInputDialog("삭제할 회원의 이름을 입력 : ");
			mb = new Member(name, "delete");
		}else if (e.getSource()==jbt3) {
			mb = new Member("view");
		}else if (e.getSource()==jbt4) {
			mb = new Member("exit");
		}
		sendData(mb);
	}
	
	public void sendData(Member mb) {
		try {
			baos = new ByteArrayOutputStream();
			bos = new BufferedOutputStream(baos);
			oos = new ObjectOutputStream(bos);
			
			oos.writeObject(mb);
			oos.flush();
			byte[] data = baos.toByteArray();
			dp1 = new DatagramPacket(data, data.length, ia, 12345);
			ds.send(dp1);
			dp2 = new DatagramPacket(new byte[65508], 65508);
			ds.receive(dp2);
			
			ByteArrayInputStream bais = new ByteArrayInputStream(dp2.getData());
			BufferedInputStream bis = new BufferedInputStream(bais);
			ObjectInputStream ois = new ObjectInputStream(bis);
			Object obj = ois.readObject();
			
			if (obj instanceof String) {
			 	JOptionPane.showMessageDialog(null, obj);
			}else {
				java.util.List<Member> list = (java.util.List)obj;
				jta.setText("");
				for(Member mem : list) {
					jta.append(mem.getName() +"\t\t" + mem.getTel() + "\n");
				}
			}
		}catch(Exception ee) {}
	}
}
