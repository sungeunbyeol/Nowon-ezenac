import java.awt.*;
import java.awt.event.*;


class A04 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
class B04 implements MouseListener{
	@Override
	public void mouseClicked(MouseEvent e) {
		//���콺�� Ŭ��������
		System.out.println("���콺�� Ŭ���ϼ̳׿�!!");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// ���콺�� ����������
		System.out.println("���콺�� �������׿�!!");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// ���콺�� ��������
		System.out.println("���콺�� �����׿�!!");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
class C04 extends MouseAdapter{
	@Override
	public void mouseClicked(MouseEvent e) {
		//���콺�� Ŭ��������
		System.out.println("���콺�� Ŭ���ϼ̳׿�!!");
	}
}
class MyFrame04 extends Frame implements ActionListener{
	private Button bt = new Button("����");
	
	public void init() {
		//A04 ap = new A04();
		//bt.addActionListener(ap);
		//B04 bp = new B04();
		//bt.addMouseListener(bp);
		//C04 cp = new C04();
		//bt.addMouseListener(cp);//MouseAdapter�� MouseListener�� ��ӹ޾Ƽ� ����
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		
		bt.addActionListener(al);
		this.add("South", bt);
		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		this.addWindowListener(wa);
	}
	
	public MyFrame04(String title) {
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

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);		
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("awt����");
	}
}
