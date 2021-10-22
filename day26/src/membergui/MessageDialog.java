package membergui;

import java.awt.*;

public class MessageDialog extends Dialog{
	private Label msg_lb = new Label("", Label.CENTER);
	Button bt = new Button("»Æ¿Œ");

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
}
