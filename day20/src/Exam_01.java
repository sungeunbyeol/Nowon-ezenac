import java.awt.*;
import javax.swing.*;


//Frame�� ��� ���� ����ϱ� Ŭ������ �ϳ� �������
class MyFrame01 extends JFrame{ //JFrame�� ��ӹ޾ƾ� ��
	private JButton bt =  new JButton("Ȯ��");
	
	public void init() {
		Container con = this.getContentPane();
	}
	
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//x�� ������ ������ �ϴ°�
	}
	public MyFrame01(String title) {//���� ������ �����ϱ� ���ڿ��� �Ű������� ����
		super(title); //�θ����� �Ű����� ����
		
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

public class Exam_01 {
	public static void main(String[]args) {
		MyFrame01 mf = new MyFrame01("swing����");
	}
}
