import java.awt.*;

class MyFrame01 extends Frame{
	private MenuBar mb = new MenuBar();//나 메뉴 사용할꺼야
	private Menu file = new Menu("파일");//MenuBar 안에 메뉴를 넣을땐 Menu
	private Menu edit = new Menu("편집");
	private Menu help = new Menu("도움말");
	private MenuItem f_new = new MenuItem("새파일");//Menu안에 항목을 넣을땐 MenuItem
	private MenuItem f_open = new MenuItem("파일열기");
	private MenuItem f_save = new MenuItem("파일저장");
	private MenuItem f_exit = new MenuItem("종료");
	private Menu e_color = new Menu("색상선택");	//Menu안에 또 Menu를 만들땐 Menu
	private CheckboxMenuItem red = new CheckboxMenuItem("빨강");//항목을 선택할수 있게 만들때
	private CheckboxMenuItem green = new CheckboxMenuItem("녹색");
	private CheckboxMenuItem blue = new CheckboxMenuItem("파랑");
	private Menu e_size = new Menu("크기선택");
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
		MyFrame01 mf = new MyFrame01("awt예제");
	}
}
