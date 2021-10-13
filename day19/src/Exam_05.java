import java.awt.*;
import java.awt.event.*;
class MyButton05 extends Button{
	private Image img;
	public void setImage(Image img) {
		this.img = img;
	}
	public void paint(Graphics g) {
		g.drawImage(img, 5, 5, getWidth()-10, getHeight()-10, this);
	}
}

class MyFrame05 extends Frame implements ActionListener, Runnable{
	private MyButton05 num[] = new MyButton05[9];
	private int[] arr = new int[9];
	private Label score_lb = new Label("점수 : 0점", Label.CENTER);
	private Label time_lb = new Label("시간 : 10초", Label.CENTER);
	private Button start = new Button("시작");
	
	private Panel center_p = new Panel();
	private Panel east_p = new Panel();
	
	private int score = 0;
	private int time = 10;
	private int po = 0;		//내가 눌러야할 버튼의 번호
	
	public void setButton(boolean bool) {
		start.setEnabled(bool);
		for(int i=0; i<num.length; ++i) {
			num[i].setEnabled(!bool);
		}
	}
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", center_p);
		center_p.setLayout(new GridLayout(3, 3));
		for(int i=0; i<num.length; ++i) {
			num[i] = new MyButton05();
			center_p.add(num[i]);	num[i].addActionListener(this);
		}
		this.add("East", east_p);
		east_p.setLayout(new GridLayout(3,1));
		east_p.add(time_lb);
		east_p.add(score_lb);
		east_p.add(start);	start.addActionListener(this);
		setButton(true);
	}
	public MyFrame05(String title) {
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
	
	public void numSetting() {
		for(int i=0; i<arr.length; ++i) {
			arr[i] = (int)(Math.random() * 9) + 1;
			for(int j=0; j<i; ++j) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<num.length; ++i) {
			Image img = Toolkit.getDefaultToolkit().getImage("number\\su"+arr[i]+".png");
			num[i].setImage(img);
			num[i].repaint();
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==start) {
			score = 0;
			score_lb.setText("점수 : 0점");
			time = 10;
			po = 1;
			Thread th = new Thread(this);
			th.start();
			setButton(false);
			numSetting();
		}else {
			for(int i=0; i<num.length; ++i) {
				if (e.getSource()==num[i]) {
					if (po == arr[i]) {
						po++;
						score++;
						score_lb.setText("점수 : "+score+"점");
					}
					if (po>9) {
						numSetting();
						po = 1;
					}
				}
			}
		}
		
	}

	@Override
	public void run() {
		while(time>=0) {
			time_lb.setText("시간 : " + time +"초");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			time--;
		}
		setButton(true);
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("awt예제");
	}
}