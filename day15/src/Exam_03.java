import java.awt.*;

//Frame�� ��� ���� ����ϱ� Ŭ������ �ϳ� �������
class MyFrame03 extends Frame{ //Frame�� ��ӹ޾ƾ� ��
	private FileDialog fdl = new FileDialog(this, "��������", FileDialog.SAVE);
	
	//������
	public MyFrame03(String title) {//���� ������ �����ϱ� ���ڿ��� �Ű������� ����
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

public class Exam_03 {
	public static void main(String[]args) {
		MyFrame03 mf = new MyFrame03("awt����");
	}
}
