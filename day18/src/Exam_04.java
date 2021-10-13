import java.awt.*;

class MyFrame04 extends Frame{ //Frame�� ��ӹ޾ƾ� ��
	
	//������
	public MyFrame04(String title) {//���� ������ �����ϱ� ���ڿ��� �Ű������� ����
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
	public void paint(Graphics g) {
		g.drawLine(50, 50, 100, 100);
		//�� ���ڸ��� ������, �� ���ڸ��� ����, �� ������ �������� ����
		g.drawRect(50, 50, 100, 100);
		// �� ���ڸ��� ������, 3��°�� �����̵�, 4��°�� �����̵� ���Ѽ� ���簢���� �����.
		g.setColor(Color.blue);
		g.fillRect(200, 50, 100, 100);
		// draw�� ���� �׸��� ���̰�, fill�� ���θ� ä��� ���̴�
		g.setColor(Color.red);
		g.fillOval(50, 50, 100, 100);
		
		int x[]=new int[] {60, 120, 80}; 
		int y[]=new int[] {60, 100, 140};
		g.setColor(Color.green); 
		g.drawPolygon(x,y,3); //�ﰢ���̶� �ڿ� 3�̴�. 4�� ���ָ� ��ǥ�� �ϳ� �� �Է������ ��. �ﰢ���� �ٰ������� ������ �Ѵ�
		//g.drawPolyline(x,y,3); //������ ���� �ȱ׾��ش�
		
		g.setColor(Color.black);
		g.setFont(new Font("", Font.BOLD, 30));
		g.drawString("�׷���Ŭ��������", 50, 200);
		
		Image img = Toolkit.getDefaultToolkit().getImage("woo.jpg");
		//g.drawImage(img, 0,0, this.getWidth(), this.getHeight(), this); //�̰� ȭ�� ��ä��°�
		g.drawImage(img, 50,50,100,100,this);
	}
	
	
}

public class Exam_04 {
	public static void main(String[]args) {
		MyFrame04 mf = new MyFrame04("awt����");
	}
}
