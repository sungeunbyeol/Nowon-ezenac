//회원이 로그인 하고 들어왔을 때 메인화면
package project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainDialog extends JFrame implements ActionListener{

	private JButton[] bt = new JButton[4]; //도서상태, 회원탈퇴, 도서검색, 

	private JPanel p = new JPanel();
	private JTextArea jta = new JTextArea();
	private Scrollbar jts = new Scrollbar();
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North",p);
		p.setLayout(new GridLayout(1,3));
		MainName[] tabname = MainName.values();
		for(int i=0; i<bt.length; ++i) {
			bt[i] = new JButton(String.valueOf(tabname[i]));
			p.add("North",bt[i]);
			bt[i].addActionListener(this);
		}
		con.add("Center",jta);
		con.add("East",jts);
		
		
	}
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public MainDialog(String title) {
		super(title);
		
		this.init();
		this.start();
		
		super.setSize(500, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt[0]) {
			String name = JOptionPane.showInputDialog(this, "도서검색 : ",
					"검색", JOptionPane.QUESTION_MESSAGE);
		}else if(e.getSource()==bt[1]) {
			String name = JOptionPane.showInputDialog(this, "빌릴도서 : ",
					"입력", JOptionPane.QUESTION_MESSAGE);
		}else if(e.getSource()==bt[2]) {
			
		}else if(e.getSource()==bt[3]) {
			
		}
		
	}
}
