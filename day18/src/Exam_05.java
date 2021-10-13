import java.awt.*;
import java.awt.event.*;

class MyFrame05 extends Frame implements ActionListener{
	private Button bt1 = new Button("확대");
	private Button bt2 = new Button("축소");
	private Button bt3 = new Button("원본");
	private Button bt4 = new Button("종료");
	
	private Panel p = new Panel();
	
	Image img = Toolkit.getDefaultToolkit().getImage("kim.jpg");
	int x = 200, y = 200;
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("East", p);
		p.setLayout(new GridLayout(4, 1));
		p.add(bt1);	bt1.addActionListener(this);
		p.add(bt2);	bt2.addActionListener(this);
		p.add(bt3);	bt3.addActionListener(this);
		p.add(bt4);	bt4.addActionListener(this);
	}
	
	public MyFrame05(String title) {
		super(title);
		
		this.init();
		
		super.setSize(600, 500);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, 50, 50, x, y, this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bt1) {
			x += 50; y += 50;
			if (x > 400) {
				x = 400; y = 400;
			}
		}else if (e.getSource()==bt2) {
			x -= 50; y -= 50;
			if (x < 50) {
				x = 50; y = 50;
			}
		}else if (e.getSource()==bt3) {
			x = 200;
			y = 200;
		}else if (e.getSource()==bt4) {
			System.exit(0);
		}
		repaint();
		
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("awt예제");
	}
}
