package student;

import java.awt.*;

public class InputDialog extends Dialog{
	private Panel pl = new Panel();
	private Label name_lb = new Label("�̸�");
	private TextField name_txt = new TextField();
	private Label kor = new Label("��������");
	private TextField kor_lb = new TextField();
	private Label eng = new Label("��������");
	private TextField eng_lb = new TextField();
	private Label math = new Label("��������");
	private TextField math_lb = new TextField();
	
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add(pl);
		pl.setLayout(new GridLayout(4,2));
		pl.add(name_lb);
		pl.add(kor);
		pl.add(eng);
		pl.add(math);
		pl.add(name_txt);
		pl.add(kor_lb);
		pl.add(eng_lb);
		pl.add(math_lb);
		
		
		
	}
	//������
	public InputDialog(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
		
		this.init();
		
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		//������� window�� ����� ��ġ�� �� �ֵ��� ������ ����ϴ� ���
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		
		super.setSize(400,300);
		super.setLocation(xpos, ypos);
		super.setResizable(false);
	}

}
