//회원가입 버튼 눌렀을 때 나타나는 화면
package project;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NewDialog extends JFrame implements ActionListener{
	private MainDialog md = new MainDialog("도서사이트");
	
	
	private JLabel name_lb = new JLabel("이름 :                       ");
	private JLabel tel_lb = new JLabel("전화번호 :              ");
	private JLabel id_lb = new JLabel("사용할 아이디 :     ");
	private JLabel pw_lb = new JLabel("사용할 비밀번호 : ");
	
	private JTextField name_jtf = new JTextField();
	private JTextField tel_jtf = new JTextField();
	private JTextField id_jtf = new JTextField();
	private JTextField pw_jtf = new JTextField();
	
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp3 = new JPanel();
	private JPanel jp4 = new JPanel();
	private JPanel jp5 = new JPanel();
	
	private JButton input_bt = new JButton("확인");
	private JButton cencle_bt = new JButton("취소");
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(5,1));
		con.add(jp1);
		jp1.setLayout(new BorderLayout());
		jp1.add("West", name_lb);
		jp1.add("Center", name_jtf);
		con.add(jp2);
		jp2.setLayout(new BorderLayout());
		jp2.add("West", tel_lb);
		jp2.add("Center", tel_jtf);
		con.add(jp3);
		jp3.setLayout(new BorderLayout());
		jp3.add("West", id_lb);
		jp3.add("Center", id_jtf);
		con.add(jp4);
		jp4.setLayout(new BorderLayout());
		jp4.add("West", pw_lb);
		jp4.add("Center", pw_jtf);
		con.add(jp5);
		jp5.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jp5.add(cencle_bt);
		jp5.add(input_bt);
		
	}
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		input_bt.addActionListener(this);
		cencle_bt.addActionListener(this);
	}
	
	public NewDialog(String title) {
		super(title);
		
		this.init();
		this.start();
		
		super.setSize(300, 250);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//확인 버튼을 누르면 DB에 회원으로 등록되어야 함
		if(e.getSource()==input_bt) {
			//md.setVisible(true);
			this.setVisible(false);
		}else if(e.getSource()==cencle_bt) {
			this.setVisible(false);
		}
		
	}
}