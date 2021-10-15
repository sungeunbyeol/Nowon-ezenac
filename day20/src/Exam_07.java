import java.awt.*;
import javax.swing.*;

class MyFrame07 extends JFrame{
	private JTabbedPane jtp = new JTabbedPane();
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("Center", jtp);
		jp1.setBackground(Color.red);
		jp2.setBackground(Color.blue);
		jtp.add("1번패널", jp1);
		jtp.add("2번패널", jp2);
	}
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame07(String title) {
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
public class Exam_07 {
	public static void main(String[] args) {
		MyFrame07 mf = new MyFrame07("swing예제");
	}
}
