package student;

import java.awt.*;

public class InputDialog extends Dialog{
	private Panel pl = new Panel();
	private Label name_lb = new Label("이름");
	private TextField name_txt = new TextField();
	private Label kor = new Label("국어점수");
	private TextField kor_lb = new TextField();
	private Label eng = new Label("영어점수");
	private TextField eng_lb = new TextField();
	private Label math = new Label("수학점수");
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
	//생성자
	public InputDialog(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
		
		this.init();
		
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		//만들어진 window가 가운데에 위치할 수 있도록 사이즈 계산하는 방법
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		
		super.setSize(400,300);
		super.setLocation(xpos, ypos);
		super.setResizable(false);
	}

}
