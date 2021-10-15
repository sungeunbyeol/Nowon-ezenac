package baseball;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.*;

public class MessageDialog extends JDialog{
	private JLabel msg_lb = new JLabel("", JLabel.CENTER);
	JButton bt = new JButton("»Æ¿Œ");

	MessageDialog(Frame owner){
		super(owner);
		this.setLayout(new GridLayout(2,1));
		this.add(msg_lb);
		this.add(bt);
		
		super.setSize(200, 100);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
	}
	
	public void setMessage(String msg) {
		msg_lb.setText(msg);
	}
	public void offDialog() {
		this.setVisible(false);
	}
}
