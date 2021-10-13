package baseball;

import java.awt.*;

public class InputDialog extends Dialog{
	private Label name_lb = new Label("이름 : ", Label.RIGHT);
	private TextField name_tf = new TextField();
	private Label pay_lb = new Label("계약금 : ", Label.RIGHT);
	private TextField pay_tf = new TextField();
	private Label salary_lb = new Label("연봉 : ", Label.RIGHT);
	private TextField salary_tf = new TextField();
	private Label position_lb = new Label("포지션 : ", Label.RIGHT);
	private TextField position_tf = new TextField();
	Button bt = new Button("입력");
	
	private String team;
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private Panel p3 = new Panel();
	private Panel p4 = new Panel();
	
	public void init() {
		this.setLayout(new GridLayout(5,1));
		this.add(p1);
		p1.setLayout(new BorderLayout());
		p1.add("West", name_lb);
		p1.add("Center", name_tf);
		this.add(p2);
		p2.setLayout(new BorderLayout());
		p2.add("West", pay_lb);
		p2.add("Center", pay_tf);
		this.add(p3);
		p3.setLayout(new BorderLayout());
		p3.add("West", salary_lb);
		p3.add("Center", salary_tf);
		this.add(p4);
		p4.setLayout(new BorderLayout());
		p4.add("West", position_lb);
		p4.add("Center", position_tf);
		this.add(bt);
	}
		
	public void setTeam(String team) {
		this.team = team;
	}
	
	InputDialog(Frame owner, boolean modal){
		super(owner, modal);
		
		this.init();
		
		super.setSize(200, 200);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
	}
	
	public Player getPlayer() {
		Player player = new Player(name_tf.getText(), team, Integer.parseInt(pay_tf.getText()), 
				Integer.parseInt(salary_tf.getText()), position_tf.getText());
		name_tf.setText("");
		pay_tf.setText("");
		salary_tf.setText("");
		position_tf.setText("");
		return player;
	}
}
