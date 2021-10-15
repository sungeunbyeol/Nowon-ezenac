package student;

import java.awt.*;

public class EditDialog  extends Dialog{
	private Label kor_lb = new Label("국어 : ", Label.RIGHT);
	private TextField kor_tf = new TextField();
	private Label eng_lb = new Label("영어 : ", Label.RIGHT);
	private TextField eng_tf = new TextField();
	Button bt = new Button("수정");

	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	
	private Student st;
	
	public void init() {
		this.setLayout(new GridLayout(3,1));
		this.add(p1);
		p1.setLayout(new BorderLayout());
		p1.add("West", kor_lb);
		p1.add("Center", kor_tf);
		this.add(p2);
		p2.setLayout(new BorderLayout());
		p2.add("West", eng_lb);
		p2.add("Center", eng_tf);
		this.add(bt);
	}
		
	EditDialog(Frame owner, String title, boolean modal){
		super(owner, title, modal);
		
		this.init();
		
		super.setSize(200, 200);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
	}
	
	public void editStudent(Student st) {
		this.st = st;
		kor_tf.setText(String.valueOf(st.getKor()));
		eng_tf.setText(String.valueOf(st.getEng()));
	}
	public Student getStudent() {
		st.setKor(Integer.parseInt(kor_tf.getText()));
		st.setEng(Integer.parseInt(eng_tf.getText()));
		st.setTot();
		return st;
	}
}
