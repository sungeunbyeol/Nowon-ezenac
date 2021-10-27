package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SearchFrame extends JFrame implements ActionListener{
	private JTextField jtf = new JTextField();
	private JButton searchbt = new JButton("검색");
	private JButton loginbt = new JButton("로그인");
	private JPanel login_p = new JPanel();
	//private JPanel search_p = new JPanel();
	//private JPanel jtf_p = new JPanel();
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private LoginDialog loginDi = new LoginDialog("로그인");
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(5,1));
		con.add("North",login_p);
		login_p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		login_p.add(loginbt);
		
		con.add(p2);
		con.add(p1);
		p1.setLayout(new BorderLayout());
		p1.add("Center",jtf);
		p1.add("East",searchbt);
	}
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginbt.addActionListener(this);
		searchbt.addActionListener(this);
	}
	
	public SearchFrame(String title) {
		super(title);
		
		this.init();
		this.start();
		
		super.setSize(300, 200);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loginbt) {
			loginDi.setVisible(true);
			this.setVisible(false);
		}
	}
}

public class Search {
	public static void main(String[] args) {
		SearchFrame sf = new SearchFrame("검색");
	}
}
