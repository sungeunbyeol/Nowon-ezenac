import java.awt.*;
import java.awt.event.*;

class MyButton01 extends Button{
	private Image img;
	public MyButton01(){
		img = Toolkit.getDefaultToolkit().getImage("se.jpg");
	}
	public void setImg(Image img) {
		this.img = img;
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, 10, 10 , getWidth()-20, getHeight()-20, this);
	}
}

class MyFrame01 extends Frame implements ActionListener{
	private MyButton01 mbt = new MyButton01();
	
	private Image img;
	private boolean isButton = false;
	//false일때 세정사진버턴, true일때는 유정사진버튼
	
	public MyFrame01(String title) {
		super(title);
		this.add("Center", mbt);
		mbt.addActionListener(this);
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
		if (isButton) {
			img = Toolkit.getDefaultToolkit().getImage("se.jpg");
		}else {
			img = Toolkit.getDefaultToolkit().getImage("woo.jpg");
		}
		isButton = !isButton;
		mbt.setImg(img);
		mbt.repaint();
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("awt예제");
	}
}
