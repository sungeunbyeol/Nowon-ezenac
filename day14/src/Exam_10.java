import java.awt.*;

//Frame�� ��� ���� ����ϱ� Ŭ������ �ϳ� �������
class MyFrame10 extends Frame{ //Frame�� ��ӹ޾ƾ� ��
	private Button bt1 = new Button("��ư1");
	private Button bt2 = new Button("��ư2");
	private Button bt3 = new Button("��ư3");
	private Button bt4 = new Button("��ư4");
	private Button bt5 = new Button("��ư5");
	
	private BorderLayout bl = new BorderLayout(5,10);
	
	//������
	public MyFrame10(String title) {//���� ������ �����ϱ� ���ڿ��� �Ű������� ����
		super(title); //�θ����� �Ű����� ����
		
		//Frame�� default Layout�� BorderLayout�̴�
		this.setLayout(bl);
		this.add("North", bt1);
		this.add("South", bt2);
		this.add("East", bt3);
		this.add("West", bt4);
		this.add("Center", bt5);
		
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

public class Exam_10 {
	public static void main(String[]args) {
		MyFrame10 mf10 = new MyFrame10("awt����");
	}
}
