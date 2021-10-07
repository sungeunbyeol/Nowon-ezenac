import java.awt.*;
import java.awt.event.*;

class MyFrame05 extends Frame implements ActionListener{
	private Button left_bt = new Button("���ʹ�ư");
	private Button center_bt = new Button("�����ư");
	private Button right_bt = new Button("�����ʹ�ư");
	
	private Label msg_lb = new Label("�ƹ� ��ư�̳� ��������");
	private Panel p = new Panel();
	
	public void init() {
		this.setLayout(new GridLayout(2,1));//��ü���� Ʋ�� GirdLayout���� �ϰڴ�
		this.add(p);//��ü���� Frame�� Panel P�� �־��ְڴ�
		p.setLayout(new GridLayout(1,3)); //Panel�� ��ü���� Ʋ�� GridLayout���� �ϰڴ�
		p.add(left_bt);	  // Panel�� Button left_bt�� �߰��ϰڴ�.
		p.add(center_bt); // Panel�� Button center_bt�� �߰��ϰڴ�.
		p.add(right_bt); // Panel�� Button right_bt�� �߰��ϰڴ�.
		left_bt.addActionListener(this); //���ʹ�ư�� �׼��̺�Ʈ�� �߰��ϰڴ�.
		center_bt.addActionListener(this); //�����ư�� �׼��̺�Ʈ�� �߰��ϰڴ�
		right_bt.addActionListener(this); //�����ʹ�ư�� �׼��̺�Ʈ�� �߰��ϰڴ�
		msg_lb.setFont(new Font("", Font.BOLD, 25)); //Label msg_lb�� ��Ʈ�� �̷��� �������ְڴ�
		this.add(msg_lb); //��ü���� Frame�� Label msg_lb�� �־��ְڴ�
		
	}
	
	public MyFrame05(String title) {
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
		if (e.getSource()==left_bt) {
			msg_lb.setText("���ʹ�ư�� �����̽��ϴ�");
		}else if (e.getSource()==center_bt) {
			msg_lb.setText("�����ư�� �����̽��ϴ�");
		}else if (e.getSource()==right_bt) {
			msg_lb.setText("�����ʹ�ư�� �����̽��ϴ�");
		}
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("awt����");
	}
}
