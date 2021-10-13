import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyImage02 extends Button{
	private Image img;
	
	public MyImage02() {
		img = Toolkit.getDefaultToolkit().getImage("du1.png");
	}
	public void setImage(Image img) {
		this.img = img;
	}
	public void paint(Graphics g) {
		g.drawImage(img, 5, 5 , getWidth()-10, getHeight()-10, this);
	}
}

class MyFrame02 extends Frame implements ActionListener{
	private MyImage02 mig = new MyImage02();
	
	private Image img;
	
	private MyImage02 du[] = new MyImage02[9];
	private Label score_lb = new Label("점수 : 0점", Label.CENTER);
	private Button start = new Button("시작");
	
	private Panel center_p = new Panel();
	private Panel east_p = new Panel();
	
	private int score = 0;
	private int duPo = -1;
	
	private Image img1 = Toolkit.getDefaultToolkit().getImage("du1.png");
	private Image img2 = Toolkit.getDefaultToolkit().getImage("du.png");
	public void setButton(boolean bool) {
		start.setEnabled(bool);
		for(int i=0; i<du.length; ++i) {
			du[i].setEnabled(!bool);
		}
	}
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add(mig);
		mig.addActionListener(this);
		this.add("Center", center_p);
		center_p.setLayout(new GridLayout(3, 3));
		for(int i=0; i<du.length; ++i) {
			du[i] = new MyImage02();
			center_p.add(du[i]);	du[i].addActionListener(this);
		}
		this.add("East", east_p);
		east_p.setLayout(new GridLayout(3,1));
		east_p.add(score_lb);
		east_p.add(start);	start.addActionListener(this);
		setButton(true);
	}
	public MyFrame02(String title) {
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
	
	public void gameStart() {
		if (duPo != -1) {
			du[duPo].setImage(img1);
			du[duPo].repaint();
		}
		
		int ransu;
		do{
			ransu = (int)(Math.random() * 9);
		}while(ransu==duPo);
		
		du[ransu].setImage(img2);
		duPo = ransu;
		du[duPo].repaint();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==start) {
			setButton(false);
			gameStart();
		}else {
			for(int i=0; i<du.length; ++i) {
				if (e.getSource()==du[i]) {
					if (i==duPo) {
						score++;
						score_lb.setText("점수 : " + score +"점");
						gameStart();
					}
				}
			}
		}
		
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("awt예제");
	}
}
