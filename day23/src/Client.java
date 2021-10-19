import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;

class ClientFrame extends JFrame implements Runnable, ActionListener, KeyListener{
	private JTextArea jta = new JTextArea();
	private JScrollPane jsp = new JScrollPane(jta);
	private JPanel south_p = new JPanel();
	private JLabel msg_lb = new JLabel("�޼���", JLabel.RIGHT);
	private JTextField jtf = new JTextField();
	private JButton jbt = new JButton("����");
	
	private InetAddress ia;
	private Socket soc;
	private PrintWriter pw;
	private BufferedReader br;
	
	private String name;
	
	public void init() {
		name = JOptionPane.showInputDialog(null, "�г����� �Է� : ");
		
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		jta.setFont(new Font("", Font.PLAIN, 15));
		jta.setEditable(false);//jtextarea�ȿ� ���� ���� ���� ���Ѵ�.
		con.add("Center", jsp);
		con.add("South", south_p);
		south_p.setLayout(new BorderLayout());
		south_p.add("West", msg_lb);
		south_p.add("Center", jtf);
		south_p.add("East", jbt);
	}
	
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jbt.addActionListener(this);
		jtf.addKeyListener(this);
	}
	
	public ClientFrame() {
		this.init();
		this.setTitle(name);
		this.start();
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
		try {
			ia = InetAddress.getByName("localhost");
			soc = new Socket(ia, 12345);
			jta.setText("���� ���� ����!!" + "\n");
			pw = new PrintWriter(soc.getOutputStream(), true);
			pw.println(name + "@" + name+"���� �����ϼ̽��ϴ�.");
		}catch(Exception e) {}
		Thread th = new Thread(this);
		th.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jbt) {
			String msg = jtf.getText();
			pw.println(name + "@" + msg);
			pw.flush();
			jta.append("�� : " + msg +"\n");
			jtf.setText("");
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {	//enterŰ�� �������� 
			String msg = jtf.getText();
			pw.println(name + "@" + msg);
			pw.flush();
			jta.append("�� : " + msg +"\n");
			jtf.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			while(true) {
				String msg = br.readLine();
				jta.append(msg+"\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
		
	}
}
public class Client {
	public static void main(String[] args) {
		ClientFrame mf = new ClientFrame();
	}
}