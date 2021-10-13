import java.awt.*;
import java.awt.event.*;

class MyImage06 extends Canvas{
	private Image img;
	public void setImage(Image img) {
		this.img = img;
	}
	public void paint(Graphics g) {
		g.drawImage(img, 10, 10, this.getWidth()-20, this.getHeight()-20, this);
	}
}
class MyFrame06 extends Frame implements ActionListener{
	private Button bt1 = new Button("가위");
	private Button bt2 = new Button("바위");
	private Button bt3 = new Button("보");
	private Button bt4 = new Button("시작");
	private Button bt5 = new Button("종료");
	private Label msg_lb = new Label("시작버튼을 누르세요!!", Label.CENTER);
	
	private Panel p = new Panel();
	
	private MyImage06 mi = new MyImage06();
	
	Image img = null;
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", mi);
		this.add("South", msg_lb);
		this.add("East", p);
		p.setLayout(new GridLayout(5, 1));
		p.add(bt1);	bt1.addActionListener(this);
		p.add(bt2);	bt2.addActionListener(this);
		p.add(bt3);	bt3.addActionListener(this);
		p.add(bt4);	bt4.addActionListener(this);
		p.add(bt5);	bt5.addActionListener(this);
	}
	
	public MyFrame06(String title) {
		super(title);
		
		this.init();
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bt5) {
			System.exit(0);
		}else if (e.getSource()==bt4) {
			img = Toolkit.getDefaultToolkit().getImage("fastrcp.gif");
		}else if (e.getSource()==bt1) {
			process(1);
		}else if (e.getSource()==bt2) {
			process(2);
		}else if (e.getSource()==bt3) {
			process(3);
		}
		mi.setImage(img);
		mi.repaint();
	}
	public void process(int i) {
		int com = (int)(Math.random()*3) + 1;
		switch(com) {
		case 1 : img = Toolkit.getDefaultToolkit().getImage("c.jpg"); break;
		case 2 : img = Toolkit.getDefaultToolkit().getImage("r.jpg"); break;
		case 3 : img = Toolkit.getDefaultToolkit().getImage("p.jpg");
		}
		if (com == i) {
			msg_lb.setText("비겼습니다!!");
		}else if (com==3 && i==1) {
			msg_lb.setText("당신이 이겼습니다!!");
		}else if (com==1 && i==3){
			msg_lb.setText("당신이 졌습니다!!");
		}else if (com < i) {
			msg_lb.setText("당신이 이겼습니다!!");
		}else {
			msg_lb.setText("당신이 졌습니다!!");
		}
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		MyFrame06 mf = new MyFrame06("awt예제");
	}
}
