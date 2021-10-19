import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

class MyFrame08 extends JFrame implements Runnable, ActionListener{
	JTextPane textPane = new JTextPane();
	StyledDocument doc = textPane.getStyledDocument(); 
    SimpleAttributeSet left = new SimpleAttributeSet(); 
    SimpleAttributeSet right = new SimpleAttributeSet(); 
    
	private JScrollPane jsp = new JScrollPane(textPane); //Jtexts는 스크롤이 없기 때문에 만들어줘야됨
	private JLabel lb = new JLabel("메세지 : ", JLabel.RIGHT);
	private JTextField jtf = new JTextField();
	private JButton jbt = new JButton("전송");
	private JPanel jp = new JPanel();
	
	private ServerSocket ss;
	private Socket soc;
	private PrintWriter pw;
	private BufferedReader in;
	
	public void init(){
		StyleConstants.setAlignment(left, StyleConstants.ALIGN_LEFT); 
	    StyleConstants.setForeground(left, Color.RED);
	    
	    StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT); 
	    StyleConstants.setForeground(right, Color.BLUE);
	    
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		textPane.setFont(new Font("", Font.PLAIN, 15));
		textPane.setEditable(false);
		con.add("Center", jsp);
		con.add("South", jp);
		jp.setLayout(new BorderLayout());
		jp.add("West", lb);
		jp.add("Center", jtf);
		jp.add("East", jbt);
	}
	public void start(){
		jbt.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public MyFrame08(String title){
		super(title);
		this.init();
		this.start();
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int y = (int)(screen.getHeight()/2 - super.getHeight()/2);
		super.setLocation(x, y);
		super.setResizable(false);
		super.setVisible(true);
		try{
			ss = new ServerSocket(12345);
			soc = ss.accept();
			doc.insertString(doc.getLength(), "클라이언트 접속 성공!!", left); 
			doc.setParagraphAttributes(doc.getLength(), 1, left, false);
			pw = new PrintWriter(soc.getOutputStream(), true);
		}catch(Exception e){}
		Thread th = new Thread(this);
		th.start();
	}
	public void run(){
		try{
			in = new BufferedReader
				(new InputStreamReader(soc.getInputStream()));
			String clMsg = "";
			while(true){
				clMsg = in.readLine();
				doc.insertString(doc.getLength(), "\n"+clMsg, left); 
				doc.setParagraphAttributes(doc.getLength(), 1, left, false);
			}
		}catch(IOException e){
			e.printStackTrace();
		}catch(BadLocationException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jbt){
			pw.println(jtf.getText());
			pw.flush();
			try {
				doc.insertString(doc.getLength(), "\n"+jtf.getText(), right); 
				doc.setParagraphAttributes(doc.getLength(), 1, right, false);
			}catch(BadLocationException ee) {
				ee.printStackTrace();
			}
			jtf.setText("");
		}
	}
}

public class Exam_08 {
	public static void main(String[] args){
		MyFrame08 mf = new MyFrame08("채팅서버");
	}
}