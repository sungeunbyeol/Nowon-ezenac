import java.awt.*;

class MyFrame02 extends Frame{
	private Dialog dlg = new Dialog(this, "��â", true);
	//this�� Frame ���� �÷� �ϴ� �ǹ�, Frame�� ���� �� Null ���
	private Button dlg_bt = new Button("Ȯ��");
	
	public void init() {
		dlg.setLayout(new BorderLayout());
		dlg.add("South" , dlg_bt);
	}
	
	public MyFrame02(String title) {
		super(title);
	
		this.init();
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		dlg.setBounds(xpos, ypos, 200, 150);
		//setBounds => setLocation(���� ���ڸ�)�� setSize(���� ���ڸ�)�޼ҵ带 ��ģ��
		dlg.setResizable(false);
		dlg.setVisible(true);
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("awt����");
	}
}
