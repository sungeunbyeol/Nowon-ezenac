import java.awt.*;
import javax.swing.*;

class MyFrame02 extends JFrame{
	JFileChooser jfc = new JFileChooser(".");
	//. : ��������, .. : �θ�����, ���� �ش� ������ �����൵ �ȴ�
	public void init() {
		//Color color = JColorChooser.showDialog(this, "�������!!", Color.green);
		Container con = this.getContentPane();
		//con.setBackground(color);
	}
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame02(String title) {
		super(title);
		
		this.init();
		this.start();
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		/*
		JOptionPane.showMessageDialog(this, "�޼���â �Դϴ�.", "�˸�", 
							JOptionPane.INFORMATION_MESSAGE);
		*/
		/*
		int res = JOptionPane.showConfirmDialog(this, "������ �����Ͻðڽ��ϱ�?",
				"����", JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE);
		System.out.println("res = " + res);
		//yes, no, yes_no, yes_no_cancel
		*/
		/*
		String name = JOptionPane.showInputDialog(this, "�̸��� �Է� : ", 
				"�Է�", JOptionPane.QUESTION_MESSAGE);
		System.out.println("�Էµ� �̸� : " + name);
		*/
		int res = jfc.showOpenDialog(this);
		//res���� 0�̸� ���ϼ���, 0�� �ƴϸ� ���ϼ����� ���Ѱ̴ϴ�
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("swing����");
	}
}
