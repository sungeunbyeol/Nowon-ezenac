import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrame02 extends Frame implements MouseListener{
	private Button bt = new Button("Ȯ��");
	private Label lb = new Label("��ư�� ��������!!");
	
	public void init() {
		this.setLayout(new GridLayout(2,1));
		this.add(bt);	bt.addMouseListener(this);
		this.add(lb);
	}
	public MyFrame02(String title) {
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
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getButton() == 1) {
			lb.setText("���ʹ�ư�� �����̽��ϴ�.");
		}else if (e.getButton() == 2) {
			lb.setText("�����ư�� �����̽��ϴ�.");
		}else if (e.getButton() == 3) {
			lb.setText("�����ʹ�ư�� �����̽��ϴ�.");
		}
		
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
public class Exam_02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("awt����");
	}
}
