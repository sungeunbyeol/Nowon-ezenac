import java.awt.*;
import javax.swing.*;

class MyFrame02 extends JFrame{
	JFileChooser jfc = new JFileChooser(".");
	//. : 현재폴더, .. : 부모폴더, 직접 해당 폴더를 적어줘도 된다
	public void init() {
		//Color color = JColorChooser.showDialog(this, "색상골라봐!!", Color.green);
		Container con = this.getContentPane();
		//con.setBackground(color);
	}
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame02(String title) {
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
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		/*
		JOptionPane.showMessageDialog(this, "메세지창 입니다.", "알림", 
							JOptionPane.INFORMATION_MESSAGE);
		*/
		/*
		int res = JOptionPane.showConfirmDialog(this, "정말로 삭제하시겠습니까?",
				"삭제", JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE);
		System.out.println("res = " + res);
		//yes, no, yes_no, yes_no_cancel
		*/
		/*
		String name = JOptionPane.showInputDialog(this, "이름을 입력 : ", 
				"입력", JOptionPane.QUESTION_MESSAGE);
		System.out.println("입력된 이름 : " + name);
		*/
		int res = jfc.showOpenDialog(this);
		//res값이 0이면 파일선택, 0이 아니면 파일선택을 안한겁니다
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("swing예제");
	}
}
