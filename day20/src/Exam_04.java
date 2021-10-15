import java.awt.*;
import javax.swing.*;

class MyFrame04 extends JFrame{
	// �̹����� �ȵ����� �������� ���� ���ִ�. 
	// JButton���� ��밡��
	private ImageIcon ii1 = new ImageIcon("1.gif");
	private ImageIcon ii2 = new ImageIcon("2.gif");
	private ImageIcon ii3 = new ImageIcon("3.gif");
	private ImageIcon ii4 = new ImageIcon("4.gif");
	
	
	// 1. JToggleButton�� Ƣ��ͺ��̰� �ϴ°Ŷ� �׷��� �ʿ��ϴ�.
	private JToggleButton jtb1 = new JToggleButton("1��", ii1);
	private JToggleButton jtb2 = new JToggleButton("2��", ii2);
	private JToggleButton jtb3 = new JToggleButton(ii3);
	private JToggleButton jtb4 = new JToggleButton("4��");
	// 2. �׷��� ���� �׷� ��ü�� ������ ��
	private ButtonGroup bg = new ButtonGroup();
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(1,4));
		jtb1.setSelectedIcon(ii4);
		//jtb1��ư�� ������ �� �Ű������� ������ ���������� �ٲ��ּ��� �ϴ� ��
		jtb2.setToolTipText("2����ư�Դϴ�.");
		//������ �ߵ��� �ϴ°�
		jtb3.setRolloverIcon(ii4);
		//���콺�� ���� �ø��⸸ �ص� �Ű������� �ִ� ���������� �ٲ��شٴ� ��
		jtb2.setHorizontalTextPosition(SwingConstants.CENTER);
		//��, ����, ��
		jtb2.setVerticalTextPosition(SwingConstants.BOTTOM); 
		// ��(TOP), �߰�, �Ʒ�(BOTTOM)
		//�ؽ�Ʈ ��ġ�� �̵������شٴ� �ǹ�
		jtb1.setMnemonic('1');//char�� ���� �־��ش�, int���� �������� �ƽ�Ű���� �־�ߵ�.
		jtb2.setMnemonic('2');//altŰ�� ���� ���¿��� 1�� �����ش�
		jtb3.setMnemonic('3');
		jtb4.setMnemonic('4');
		//���Ű �����ϴ� ����̴�.
		
		bg.add(jtb1);	con.add(jtb1);
		bg.add(jtb2);	con.add(jtb2);
		bg.add(jtb3);	con.add(jtb3);
		bg.add(jtb4);	con.add(jtb4);
	}
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame04(String title) {
		super(title);
		
		this.init();
		this.start();
		
		super.setSize(600, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("swing����");
	}
}
