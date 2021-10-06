import java.awt.*;

//Frame�� ��� ���� ����ϱ� Ŭ������ �ϳ� �������
class MyFrame11 extends Frame{ //Frame�� ��ӹ޾ƾ� ��
	private Button bt1 = new Button("yes");
	private Button bt2 = new Button("no1");
	private Button bt3 = new Button("no2");
	
	private BorderLayout bl = new BorderLayout(); 
	private Panel pl = new Panel();
	private GridLayout gl = new GridLayout(1,2);
	
	private Panel pl2 = new Panel();
	private GridLayout gl2 = new GridLayout(2,1);
	
	//������
	public MyFrame11(String title) {//���� ������ �����ϱ� ���ڿ��� �Ű������� ����
		super(title); //�θ����� �Ű����� ����
		
		this.setLayout(bl);
		this.add("South", pl);
		pl.setLayout(gl);
		pl.add(bt1);
		pl.add(pl2);
		pl2.setLayout(gl2);
		pl2.add(bt2);
		pl2.add(bt3);
		
		super.setSize(400,300); // window ������ ���ϱ�
		
		//Dimension : �ܼ��ϰ� ���� ���� ���� �����ϴ� Ŭ����
		//Toolkit.getDefaultToolkit().getScreenSize()
		// - ���� ���� �ִ� ȭ���� ũ�⸦ �����Ͷ�
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		//������� window�� ����� ��ġ�� �� �ֵ��� ������ ����ϴ� ���
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
	
		super.setLocation(xpos, ypos);//��ġ����
		super.setResizable(false); //������ �����Ұ��ϰ� �����
		
		super.setVisible(true); //ȭ�鿡 window ���̰� �ϱ�
	}
}

public class Exam_11 {
	public static void main(String[]args) {
		MyFrame11 mf11 = new MyFrame11("awt����");
	}
}
