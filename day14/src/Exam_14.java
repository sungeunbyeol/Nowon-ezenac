import java.awt.*;

class MyFrame14 extends Frame{
	private Label lb = new Label("좋아하는 과일은 ? ");
	private Checkbox cb_a = new Checkbox("바나나");
	private Checkbox cb_b = new Checkbox("딸기");
	private Checkbox cb_c = new Checkbox("수박");
	private Checkbox cb_d = new Checkbox("귤");
	
	private Panel cb_p = new Panel();
	
	public void init() {
		this.setLayout(new GridLayout(2,1));
		this.add(lb);
		this.add(cb_p);
		cb_p.setLayout(new GridLayout(2,2));
		cb_p.add(cb_a);
		cb_p.add(cb_b);
		cb_p.add(cb_c);
		cb_p.add(cb_d);
	}
	

	
	public MyFrame14(String title) {
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
}
public class Exam_14 {
	public static void main(String[] args) {
		MyFrame14 mf = new MyFrame14("awt예제");
	}
}
