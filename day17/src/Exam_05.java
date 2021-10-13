import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NumberGame extends Frame implements ActionListener, Runnable{
	private Button du[] = new Button[9];
	private Label score_lb = new Label("점수 : 0점", Label.CENTER);
	private Label time_lb = new Label("시간 : 10초", Label.CENTER);
	private Button start = new Button("시작");
	
	private Panel center_p = new Panel();
	private Panel east_p = new Panel();
	
	private int score = 0;
	private int duPo = -1;
	private int time = 10;
	
	public void setButton(boolean bool) {
		start.setEnabled(bool);
		for(int i=0; i<du.length; ++i) {
			du[i].setEnabled(!bool);
		}
	}
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", center_p);
		center_p.setLayout(new GridLayout(3, 3));
		for(int i=0; i<du.length; ++i) {
			du[i] = new Button("");
			center_p.add(du[i]);	du[i].addActionListener(this);
		}
		this.add("East", east_p);
		east_p.setLayout(new GridLayout(3,1));
		east_p.add(time_lb);
		east_p.add(score_lb);
		east_p.add(start);	start.addActionListener(this);
		setButton(true);
	}
	public NumberGame(String title) {
		super(title);
		
		this.init();
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
	
	
	
	@Override
	public void run() {
		while(time>=0) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			--time;
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}



public class Exam_05 {
	public static void main(String[]args) {
		NumberGame mf = new NumberGame("랜덤게임");
	}
}
