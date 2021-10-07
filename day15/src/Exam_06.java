import java.awt.*;
import java.awt.event.*;

class MyFrame06 extends Frame implements MouseListener, MouseMotionListener{
	private Button bt = new Button("확인");
	private Label lb = new Label("x = 000, y = 000");
	public void init() {
		this.add("South", bt);
		this.add("North", lb);
		bt.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	public MyFrame06(String title) {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//해당 컴포넌트에 들어갔을때
		System.out.println("마우스가 버튼안에 있네요!!");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 해당 컴포넌트 밖으로 나갔을때
		System.out.println("마우스가 버튼밖에 있네요!!");
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		//마우스를 드레그 하면서 움직일때 발생
		int x = e.getX();
		int y = e.getY();
		lb.setText("x = " + x  +" , y = " + y);
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// 마우스를 움직일때 발생
		
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		MyFrame06 mf = new MyFrame06("awt예제");
	}
}
