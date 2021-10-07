import java.awt.*;

class MyFrame01 extends Frame{
	private MenuBar mb = new MenuBar();//�� �޴� ����Ҳ���
	private Menu file = new Menu("����");//MenuBar �ȿ� �޴��� ������ Menu
	private Menu edit = new Menu("����");
	private Menu help = new Menu("����");
	private MenuItem f_new = new MenuItem("������");//Menu�ȿ� �׸��� ������ MenuItem
	private MenuItem f_open = new MenuItem("���Ͽ���");
	private MenuItem f_save = new MenuItem("��������");
	private MenuItem f_exit = new MenuItem("����");
	private Menu e_color = new Menu("������");	//Menu�ȿ� �� Menu�� ���鶩 Menu
	private CheckboxMenuItem red = new CheckboxMenuItem("����");//�׸��� �����Ҽ� �ְ� ���鶧
	private CheckboxMenuItem green = new CheckboxMenuItem("���");
	private CheckboxMenuItem blue = new CheckboxMenuItem("�Ķ�");
	private Menu e_size = new Menu("ũ�⼱��");
	public void init() {
		this.setMenuBar(mb);
		mb.add(file);
		file.add(f_new);
		file.addSeparator();
		file.add(f_open);
		file.add(f_save);
		file.addSeparator();
		file.add(f_exit);
		mb.add(edit);
		edit.add(e_color);
		e_color.add(red);
		e_color.add(green);
		e_color.add(blue);
		edit.addSeparator();
		edit.add(e_size);
		mb.add(help);
	}
	
	public MyFrame01(String title) {
		super(title);
		
		this.init();
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("awt����");
	}
}
