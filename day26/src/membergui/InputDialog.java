package membergui;

import java.awt.*;

public class InputDialog extends Dialog{
	private Label name_lb = new Label("이름 : ", Label.RIGHT);
	private TextField name_tf = new TextField();
	private Label tel_lb = new Label("TEL : ", Label.RIGHT);
	private TextField tel_tf = new TextField();
	private Label address_lb = new Label("주소 : ", Label.RIGHT);
	private TextField address_tf = new TextField();
	Button bt = new Button("입력");

	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private Panel p3 = new Panel();
	
	public void init() {
		this.setLayout(new GridLayout(4,1));
		this.add(p1);
		p1.setLayout(new BorderLayout());
		p1.add("West", name_lb);
		p1.add("Center", name_tf);
		this.add(p2);
		p2.setLayout(new BorderLayout());
		p2.add("West", tel_lb);
		p2.add("Center", tel_tf);
		this.add(p3);
		p3.setLayout(new BorderLayout());
		p3.add("West", address_lb);
		p3.add("Center", address_tf);
		this.add(bt);
	}
		
	InputDialog(Frame owner, String title, boolean modal){
		super(owner, title, modal);
		
		this.init();
		
		super.setSize(200, 200);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
	}
	
	public Member getMember() {
		Member member = new Member(name_tf.getText(), 
							tel_tf.getText(), address_tf.getText());
		name_tf.setText("");
		tel_tf.setText("");
		address_tf.setText("");
		return member;
	}
}
