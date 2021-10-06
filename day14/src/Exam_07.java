import java.awt.*;

//Frame�� ��� ���� ����ϱ� Ŭ������ �ϳ� �������
class MyFrame07 extends Frame{ //Frame�� ��ӹ޾ƾ� ��
	private Label lb = new Label("label Ŭ���� �Դϴ�.", Label.CENTER);
	//Label.CENTER : ��� ���ڴ�.
	//Label.LEFT : ���ʿ� ���ڴ�. - default
	//Label.RIGTH : �����ʿ� ���ڴ�.
	//lb.setText("�׽�Ʈ ���� �ٲٰڴ�.");
	//String msg = lb.getText(); - �ؽ�Ʈ�� �������ڴ�.
	
	//������
	public MyFrame07(String title) {//���� ������ �����ϱ� ���ڿ��� �Ű������� ����
		super(title); //�θ����� �Ű����� ����
		
		this.add(lb); //frame���� label��ü�� �ø��ڴ�.
		
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

public class Exam_07 {
	public static void main(String[]args) {
		MyFrame07 mf07 = new MyFrame07("awt����");
		
	}
}
