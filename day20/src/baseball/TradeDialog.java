package baseball;

import java.awt.*;
import javax.swing.*;


public class TradeDialog extends JDialog{
	private JLabel name_lb = new JLabel("�̸� : ", JLabel.RIGHT);
	private JTextField name_tf = new JTextField();
	private JLabel team_lb = new JLabel("�̵����� : ", JLabel.RIGHT);
	private Choice team_ch = new Choice();
	JButton bt = new JButton("Ȯ��");

	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	
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
		
	TradeDialog(Frame owner, String name, boolean modal){
		super(owner, name, modal);
		
		this.init();
		
		super.setSize(200, 150);
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
		//getSelectedItem() ���̽����� ������ ���� �������ڴٴ� �ǹ�
		return team;
	}
}
