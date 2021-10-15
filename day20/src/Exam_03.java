import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class MyFrame03 extends JFrame{
	private JButton jbt1 = new JButton("버튼1");
	private JButton jbt2 = new JButton("버튼2");
	private JButton jbt3 = new JButton("버튼3");
	private JButton jbt4 = new JButton("버튼4");
	private JButton jbt5 = new JButton("버튼5");
	private JButton jbt6 = new JButton("버튼6");
	private JButton jbt7 = new JButton("버튼7");
	private JButton jbt8 = new JButton("버튼8");
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(4,2));
		jbt1.setBorder(new LineBorder(Color.red, 5));
		con.add(jbt1);
		jbt2.setBorder(new MatteBorder(10,5,10,5, Color.blue));
		//top, left, bottom, right
		con.add(jbt2);
		jbt3.setBorder(new BevelBorder(BevelBorder.RAISED));
		//버튼 튀어나와 보이게 하는 효과는 RAISED, 들어가보이는것은 LOWERED
		con.add(jbt3);
		jbt4.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
		//테두리가 직각으로 나타나냐, 소프트하게 나타날거냐 차이....
		con.add(jbt4);
		jbt5.setBorder(new EmptyBorder(4,4,4,4));
		//top, left, bottom, right 2개 이상해야 더 잘 볼수있음. 병합된것처럼 보이게 만듦. 
		con.add(jbt5);
		jbt6.setBorder(new EtchedBorder(EtchedBorder.RAISED));
		// 테두리도 튀어나와 보이게 하거나, 들어가보이게 하는거
		con.add(jbt6);
		jbt7.setBorder(new TitledBorder("title"));
		con.add(jbt7);
		jbt8.setBorder(new CompoundBorder
				(new BevelBorder(BevelBorder.RAISED), new TitledBorder("title")));
			//outside, inside
		con.add(jbt8);
	}
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame03(String title) {
		super(title);
		
		this.init();
		this.start();
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("swing예제");
	}
}
