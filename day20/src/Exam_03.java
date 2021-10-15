import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class MyFrame03 extends JFrame{
	private JButton jbt1 = new JButton("��ư1");
	private JButton jbt2 = new JButton("��ư2");
	private JButton jbt3 = new JButton("��ư3");
	private JButton jbt4 = new JButton("��ư4");
	private JButton jbt5 = new JButton("��ư5");
	private JButton jbt6 = new JButton("��ư6");
	private JButton jbt7 = new JButton("��ư7");
	private JButton jbt8 = new JButton("��ư8");
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(4,2));
		jbt1.setBorder(new LineBorder(Color.red, 5));
		con.add(jbt1);
		jbt2.setBorder(new MatteBorder(10,5,10,5, Color.blue));
		//top, left, bottom, right
		con.add(jbt2);
		jbt3.setBorder(new BevelBorder(BevelBorder.RAISED));
		//��ư Ƣ��� ���̰� �ϴ� ȿ���� RAISED, �����̴°��� LOWERED
		con.add(jbt3);
		jbt4.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
		//�׵θ��� �������� ��Ÿ����, ����Ʈ�ϰ� ��Ÿ���ų� ����....
		con.add(jbt4);
		jbt5.setBorder(new EmptyBorder(4,4,4,4));
		//top, left, bottom, right 2�� �̻��ؾ� �� �� ��������. ���յȰ�ó�� ���̰� ����. 
		con.add(jbt5);
		jbt6.setBorder(new EtchedBorder(EtchedBorder.RAISED));
		// �׵θ��� Ƣ��� ���̰� �ϰų�, �����̰� �ϴ°�
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
		MyFrame03 mf = new MyFrame03("swing����");
	}
}
