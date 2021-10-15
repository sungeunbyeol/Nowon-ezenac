package student;

import java.awt.*;
import javax.swing.*;

public class InputDialog extends JDialog{
	private JLabel name_lb = new JLabel("이름 : ", Label.RIGHT);
	private JTextField name_tf = new JTextField();
	private JLabel kor_lb = new JLabel("국어 : ", Label.RIGHT);
	private JTextField kor_tf = new JTextField();
	private JLabel eng_lb = new JLabel("영어 : ", Label.RIGHT);
	private JTextField eng_tf = new JTextField();
	JButton bt = new JButton("입력");

	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JPanel p3 = new JPanel();
	
	public void init() {
		this.setLayout(new GridLayout(4,1));
		this.add(p1);
		p1.setLayout(new BorderLayout());
		p1.add("West", name_lb);
		p1.add("Center", name_tf);
		this.add(p2);
		p2.setLayout(new BorderLayout());
		p2.add("West", kor_lb);
		p2.add("Center", kor_tf);
		this.add(p3);
		p3.setLayout(new BorderLayout());
		p3.add("West", eng_lb);
		p3.add("Center", eng_tf);
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
	
	public Student getStudent() {
		Student st = new Student(name_tf.getText(), 
		Integer.parseInt(kor_tf.getText()), Integer.parseInt(eng_tf.getText()));
		name_tf.setText("");
		kor_tf.setText("");
		eng_tf.setText("");
		return st;
	}
}
