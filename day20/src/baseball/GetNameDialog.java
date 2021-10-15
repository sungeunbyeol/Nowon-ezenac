package baseball;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetNameDialog extends JDialog{
	
	private JLabel name_lb = new JLabel("이름 : ", JLabel.RIGHT);
	private JTextField name_tf = new JTextField();
	JButton bt = new JButton("확인");

	private JPanel p = new JPanel();
	
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
