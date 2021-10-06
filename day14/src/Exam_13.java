import java.awt.*;

class MyFrame13 extends Frame{
	private Label lb = new Label("계산기예제", Label.CENTER);
	private Button[] bt = new Button[16];
	private String[] str = new String[]
			{"7","8","9","+","4","5","6","-","1","2","3","*","0","=","%","/"};
	
	private BorderLayout bl = new BorderLayout();
	private Panel p = new Panel();
	private GridLayout gl = new GridLayout(4,4,2,2);
	
	private Font font = new Font("", Font.BOLD, 30 );
	private Color color = Color.gray;
		
	public void init() {
		this.setLayout(bl);
		this.add("North", lb);
		this.setBackground(color);
		this.add("Center", p);
		lb.setFont(font);
		p.setLayout(gl);
		for(int i=0; i<bt.length; ++i) {
			bt[i] = new Button(str[i]);
			p.add(bt[i]);
		}
	}
	public MyFrame13(String title) {
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
public class Exam_13 {
	public static void main(String[] args) {
		MyFrame13 mf = new MyFrame13("awt예제");
	}
}
