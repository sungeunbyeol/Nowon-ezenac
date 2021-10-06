import java.awt.*;

class MyFrame16 extends Frame{
	private Label lb = new Label("당신의 혈액형은? ");
	private Choice blood_ch = new Choice();
	
	public void init() {
		this.setLayout(new GridLayout(2,1));
		this.add(lb);
		blood_ch.add("A형");
		blood_ch.add("B형");
		blood_ch.add("AB형");
		blood_ch.add("O형");
		this.add(blood_ch);
	}
	
	public MyFrame16(String title) {
		super(title);
		
		this.init();
		
		super.setSize(200, 100);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
}
public class Exam_16 {
	public static void main(String[] args) {
		MyFrame16 mf = new MyFrame16("awt예제");
	}
}
