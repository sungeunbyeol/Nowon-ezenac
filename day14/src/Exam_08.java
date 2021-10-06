import java.awt.*;

class MyFrame08 extends Frame{ 
	private Button bt1 = new Button("Ȯ��1");
	private Button bt2 = new Button("Ȯ��2");
	
	
	private FlowLayout f1 = new FlowLayout(FlowLayout.RIGHT); //��ġ�����ڸ� ���� �����
	//FlowLAyout.CENTER : default , LEFT, RIGHT�� �����ų �� ����.
	//private FlowLayout f1 = new FlowLayout(); �̷��� �ϸ� ����� ����� 
	//��? default ���� CENTER �̱� ������ 
	
	public MyFrame08(String title) {
		super(title); 
		
		this.setLayout(f1); //��ġ������ �����ϰڴ�.
		
		this.add(bt1);
		this.add(bt2);
		
		super.setSize(400,300);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
	
		super.setLocation(xpos, ypos);
		super.setResizable(false); 
		
		super.setVisible(true); 
	}
}

public class Exam_08 {
	public static void main(String[]args) {
		MyFrame08 mf08 = new MyFrame08("awt����");
	}
}
