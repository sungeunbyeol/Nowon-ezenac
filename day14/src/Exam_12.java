import java.awt.*;

class MyFrame12 extends Frame{
	private Label lb = new Label("전화기예제", Label.CENTER);
	private Button[] bt  = new Button[12];
	private String[] str = new String[] {"*", "0", "#"};
	
	private BorderLayout bl = new BorderLayout();
	private Panel p = new Panel();
	private GridLayout gl = new GridLayout(4,3);

	private Font font = new Font("", Font.BOLD, 30);
	//private Color color = new Color(60,180,200);
	private Color color = Color.green;
	public void init() {
		this.setLayout(bl);
		this.setBackground(color);
		lb.setFont(font);
		this.add("North", lb);
		this.add("Center", p);
		p.setLayout(gl);
		for(int i=0; i<bt.length; ++i) {
			if (i<=8) bt[i] = new Button(String.valueOf(i+1));
			else bt[i] = new Button(str[i-9]);
			
			p.add(bt[i]);
		}
	}
	public MyFrame12(String title) {
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
public class Exam_12 {
	public static void main(String[] args) {
		MyFrame12 mf = new MyFrame12("awt예제");
	}
}
