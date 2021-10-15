import java.awt.*;
import javax.swing.*;

class MyFrame05 extends JFrame{
	private JDesktopPane jdp = new JDesktopPane();
	//하나의 프레임을 더 만들 때 사용한다.
	private JInternalFrame jif1 = new JInternalFrame("1번", true, true, true, true);
	private JInternalFrame jif2 = new JInternalFrame("2번", false, true, true, true);
	private JInternalFrame jif3 = new JInternalFrame("3번", true, false, true, true);
	private JInternalFrame jif4 = new JInternalFrame("4번", true, true, false, true);
	private JInternalFrame jif5 = new JInternalFrame("5번", true, true, true, false);
	//매개변수 1번째는 title
	//매개변수 2번째는 frame의 사이즈 조절유무
	//매개변수 3번째는 frame의 종료 유무
	//매개변수 4번째는 frame의 최대화 유무
	//매개변수 5번째는 frame의 최소화 유무
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("Center",jdp);
		jif1.setBounds(0,0,200,150); 
		//새로운 프레임이기 때문에 사이즈 지정해줘야됨
		jif1.setVisible(true);
		//새로운 프레임이기 때문에 화면에 보이기 해야됨
		jif2.setBounds(0,20,200,150); 
		jif2.setVisible(true);
		jif3.setBounds(0,40,200,150); 
		jif3.setVisible(true);
		jif4.setBounds(0,60,200,150); 
		jif4.setVisible(true);
		jif5.setBounds(0,80,200,150); 
		jif5.setVisible(true);
		jdp.add(jif1);
		jdp.add(jif2);
		jdp.add(jif3);
		jdp.add(jif4);
		jdp.add(jif5);
		
	}
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame05(String title) {
		super(title);
		
		this.init();
		this.start();
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("swing예제");
	}
}
