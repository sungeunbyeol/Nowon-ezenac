import java.awt.*;

public class Exam_06 {
	public static void main(String[]args) {
		Frame f1 = new Frame();//Frame�� ��â ���� ��
		Frame f2 = new Frame("title");
		
		f1.setVisible(true);
		f2.setVisible(true);
		
		f1.setSize(300,200); //�ȼ����� �����ش�
		f2.setSize(400,300);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		//Dimension : �ܼ��ϰ� ���� ���� ���� �����ϴ� Ŭ����
		//Toolkit.getDefaultToolkit().getScreenSize()
		// - ���� ���� �ִ� ȭ���� ũ�⸦ �����Ͷ�
		int xpos = (int)(screen.getWidth() - f2.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - f2.getHeight()) / 2;
		//�������� ����, �Ʒ����� ����. ����� ��ġ�� �� �ֵ��� ������ ����ϴ� ���
		
		f1.setLocation(200,200); //��ġ����
		f2.setLocation(xpos,ypos);
		
		f1.setResizable(false); //������ ũ�� ���� ���ϰ� �ϰڴ�
		f2.setResizable(false);
	}
}
