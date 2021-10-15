import java.awt.*;
import javax.swing.*;

class MyFrame05 extends JFrame{
	private JDesktopPane jdp = new JDesktopPane();
	//�ϳ��� �������� �� ���� �� ����Ѵ�.
	private JInternalFrame jif1 = new JInternalFrame("1��", true, true, true, true);
	private JInternalFrame jif2 = new JInternalFrame("2��", false, true, true, true);
	private JInternalFrame jif3 = new JInternalFrame("3��", true, false, true, true);
	private JInternalFrame jif4 = new JInternalFrame("4��", true, true, false, true);
	private JInternalFrame jif5 = new JInternalFrame("5��", true, true, true, false);
	//�Ű����� 1��°�� title
	//�Ű����� 2��°�� frame�� ������ ��������
	//�Ű����� 3��°�� frame�� ���� ����
	//�Ű����� 4��°�� frame�� �ִ�ȭ ����
	//�Ű����� 5��°�� frame�� �ּ�ȭ ����
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("Center",jdp);
		jif1.setBounds(0,0,200,150); 
		//���ο� �������̱� ������ ������ ��������ߵ�
		jif1.setVisible(true);
		//���ο� �������̱� ������ ȭ�鿡 ���̱� �ؾߵ�
		jif2.setBounds(0,20,200,150); 
		jif2.setVisible(true);
		jif3.setBounds(0,40,200,150); 
		jif3.setVisible(true);
		jif4.setBounds(0,60,200,150); 
		jif4.setVisible(true);
		jif5.setBounds(0,80,200,150); 
		jif5.setVisible(true);
		jdp.add(jif1);
		jdp.add(jif2);
		jdp.add(jif3);
		jdp.add(jif4);
		jdp.add(jif5);
		
	}
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame05(String title) {
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
public class Exam_05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("swing����");
	}
}
