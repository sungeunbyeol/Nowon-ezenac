import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyImage06 extends Canvas{
	private Image img;
	public void setImage(Image img) {
		this.img = img;
	}
	public void paint(Graphics g) {
		g.drawImage(img, 20, 20, getWidth()-40, getHeight()-40, this);
	}
}

class MyFrame06 extends JFrame implements ActionListener{
	private JToolBar jtb = new JToolBar();
	private JButton jbt1 = new JButton("귀여워");
	private JButton jbt2 = new JButton("멋있어");
	private JButton jbt3 = new JButton("섹시해");
	private JButton jbt4 = new JButton("우시기");
	
	private MyImage06 mi = new MyImage06();
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", jtb);
		jtb.add(jbt1);
		jtb.add(jbt2);
		jtb.add(jbt3);
		jtb.add(jbt4);
		con.add("Center", mi);
		
	}
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		jbt3.addActionListener(this);
		jbt4.addActionListener(this);
	}
	
	public MyFrame06(String title) {
		super(title);
		
		this.init();
		this.start();
		
		super.setSize(800, 700);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Image img = null;
		if (e.getSource()==jbt1) {
			img = Toolkit.getDefaultToolkit().getImage("cute.jpg");
		}else if (e.getSource()==jbt2) {
			img = Toolkit.getDefaultToolkit().getImage("han.jpg");
		}else if (e.getSource()==jbt3) {
			img = Toolkit.getDefaultToolkit().getImage("sexy.png");
		}else if (e.getSource()==jbt4) {
			img = Toolkit.getDefaultToolkit().getImage("woo.jpg");
		}
		mi.setImage(img);
		mi.repaint();
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		MyFrame06 mf = new MyFrame06("swing예제");
	}
}
