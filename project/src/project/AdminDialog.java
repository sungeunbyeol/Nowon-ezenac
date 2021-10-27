//관리자 아이디로 로그인하고 들어왔을 때 보이는 화면
package project;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Scrollbar;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AdminDialog extends JFrame implements ActionListener{
	private JButton[] bt = new JButton[5]; 

	private JPanel p = new JPanel();
	private JTextArea jta = new JTextArea();
	private Scrollbar jts = new Scrollbar();
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North",p);
		p.setLayout(new GridLayout(1,3));
		AdminName[] adminname = AdminName.values();
		for(int i=0; i<bt.length; ++i) {
			bt[i] = new JButton(String.valueOf(adminname[i]));
			p.add("North",bt[i]);
			bt[i].addActionListener(this);
		}
		con.add("Center",jta);
		con.add("East",jts);
	}
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public AdminDialog(String title) {
		super(title);
		
		this.init();
		this.start();
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}