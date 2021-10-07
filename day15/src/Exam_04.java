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
		//마우스를 클릭했을때
		System.out.println("마우스를 클릭하셨네요!!");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// 마우스가 눌러졌을때
		System.out.println("마우스가 눌러졌네요!!");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// 마우스가 떼었을때
		System.out.println("마우스를 떼었네요!!");
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
		//마우스를 클릭했을때
		System.out.println("마우스를 클릭하셨네요!!");
	}
}
class MyFrame04 extends Frame implements ActionListener{
	private Button bt = new Button("종료");
	
	public void init() {
		//A04 ap = new A04();
		//bt.addActionListener(ap);
		//B04 bp = new B04();
		//bt.addMouseListener(bp);
		//C04 cp = new C04();
		//bt.addMouseListener(cp);//MouseAdapter가 MouseListener를 상속받아서 가능
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
		MyFrame04 mf = new MyFrame04("awt예제");
	}
}
