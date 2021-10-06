import java.awt.*;

class MyFrame18 extends Frame{
	private Label lb = new Label("제목", Label.RIGHT);
	private TextField tf = new TextField();
	private TextArea ta = new TextArea();
	private Button bt = new Button("확인");
	
	private Panel north_p = new Panel();
	private Panel south_p = new Panel();
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", north_p);
		north_p.setLayout(new BorderLayout());
		north_p.add("West", lb);
		north_p.add("Center", tf);
		this.add("Center", ta);
		this.add("South", south_p);
		south_p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		south_p.add(bt);
	}
	
	public MyFrame18(String title) {
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
public class Exam_18 {
	public static void main(String[] args) {
		MyFrame18 mf = new MyFrame18("awt예제");
	}
}
