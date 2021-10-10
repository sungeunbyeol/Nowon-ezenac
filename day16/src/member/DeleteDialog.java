package member;

import java.awt.*;

public class DeleteDialog extends Dialog{
	private Label name_lb = new Label("이름 : ", Label.RIGHT);
	private TextField name_tf = new TextField();
	Button bt = new Button("삭제");

	private Panel p = new Panel();
	
	public void init() {
		this.setLayout(new GridLayout(2,1));
		this.add(p);
		p.setLayout(new BorderLayout());
		p.add("West", name_lb);
		p.add("Center", name_tf);
		this.add(bt);
	}
		
	DeleteDialog(Frame owner, String title, boolean modal){
		super(owner, title, modal);
		
		this.init();
		
		super.setSize(200, 100);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
	}
	
	public String getName() {
		String name = name_tf.getText();
		name_tf.setText("");
		return name;
	}
}
