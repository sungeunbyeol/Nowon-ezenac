import java.awt.*;
import java.awt.event.*;

class MyButton03 extends Button{
	private Image img1;
	private Image img2;
	private Image img3;
	private Image img4;
	
	public MyButton03(){
		//img = Toolkit.getDefaultToolkit().getImage("se.jpg");
		img1 = Toolkit.getDefaultToolkit().getImage("han.jpg");
		img2 = Toolkit.getDefaultToolkit().getImage("cute.jpg");
		img3 = Toolkit.getDefaultToolkit().getImage("sexy.jpg");
		img4 = Toolkit.getDefaultToolkit().getImage("woo.jpg");
	}
	public void setImg(Image img1, Image img2,Image img3,Image img4) {
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
	}
	
	public void paint(Graphics g) {
		g.drawImage(img1, 0, 0 , getWidth(), getHeight(), this);
		g.drawImage(img2, 10, 10 , getWidth()-20, getHeight()-20, this);
		g.drawImage(img3, 10, 10 , getWidth()-20, getHeight()-20, this);
		g.drawImage(img4, 10, 10 , getWidth()-20, getHeight()-20, this);
	}
}

class MyFrame03 extends Frame implements ActionListener{
	private MyButton03 mbt = new MyButton03();
	private MyButton03[] bt = new MyButton03[4];
	
	private Panel p = new Panel();
	private Label lb = new Label("버튼을 누르세요");
	private Image img;

	public void init() {
		this.setLayout(new GridLayout(2,1));
		this.add(p);
		p.setLayout(new GridLayout(2,4));
		p.add("Noth", mbt);
		p.add("South", lb);
	}
	
	public MyFrame03(String title) {
		super(title);
		this.init();
		this.add(mbt);
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
		if(e.getSource()==img1) {
			
		}
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("awt예제");
	}
}
