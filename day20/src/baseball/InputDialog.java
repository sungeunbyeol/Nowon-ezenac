package baseball;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.*;


public class InputDialog extends JDialog{
	private JLabel name_lb = new JLabel("이름 : ", Label.RIGHT);
	private JTextField name_tf = new JTextField();
	private JLabel pay_lb = new JLabel("계약금 : ", Label.RIGHT);
	private JTextField pay_tf = new JTextField();
	private JLabel salary_lb = new JLabel("연봉 : ", Label.RIGHT);
	private JTextField salary_tf = new JTextField();
	private JLabel position_lb = new JLabel("포지션 : ", Label.RIGHT);
	private JTextField position_tf = new JTextField();
	JButton bt = new JButton("입력");
	
	private String team;
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JPanel p3 = new JPanel();
	private JPanel p4 = new JPanel();
	
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
