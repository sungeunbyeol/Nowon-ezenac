package baseball;

import java.awt.*;

public class GetNameDialog extends Dialog{
	private Label name_lb = new Label("이름 : ", Label.RIGHT);
	private TextField name_tf = new TextField();
	Button bt = new Button("확인");

	private Panel p = new Panel();
	
	public void init() {
		this.setLayout(new GridLayout(2,1));
		this.add(p);
		p.setLayout(new BorderLayout());
		p.add("West", name_lb);
		p.add("Center", name_tf);
		this.add(bt);
	}
		
	GetNameDialog(Frame owner, boolean modal){
		super(owner, modal);
		
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
