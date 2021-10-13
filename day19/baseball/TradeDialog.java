package baseball;

import java.awt.*;

public class TradeDialog extends Dialog{
	private Label name_lb = new Label("이름 : ", Label.RIGHT);
	private TextField name_tf = new TextField();
	private Label team_lb = new Label("이동할팀 : ", Label.RIGHT);
	private Choice team_ch = new Choice();
	Button bt = new Button("확인");

	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	
	public void init() {
		this.setLayout(new GridLayout(3,1));
		this.add(p1);
		p1.setLayout(new BorderLayout());
		p1.add("West", name_lb);
		p1.add("Center", name_tf);
		this.add(p2);
		p2.setLayout(new BorderLayout());
		p2.add("West", team_lb);
		
		TeamName[] team = TeamName.values();
		for(int i=0; i<team.length; ++i) {
			team_ch.add(String.valueOf(team[i]));
		}
		p2.add("Center", team_ch);
		this.add(bt);
	}
		
	TradeDialog(Frame owner, boolean modal){
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
	public String getTeam() {
		String team = team_ch.getSelectedItem(); 
		//getSelectedItem() 초이스에서 선택한 값을 꺼내오겠다는 의미
		return team;
	}
}
