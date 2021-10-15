import java.awt.*;
import javax.swing.*;

class MyFrame04 extends JFrame{
	// 이미지는 안되지만 아이콘은 넣을 수있다. 
	// JButton에도 사용가능
	private ImageIcon ii1 = new ImageIcon("1.gif");
	private ImageIcon ii2 = new ImageIcon("2.gif");
	private ImageIcon ii3 = new ImageIcon("3.gif");
	private ImageIcon ii4 = new ImageIcon("4.gif");
	
	
	// 1. JToggleButton은 튀어나와보이게 하는거라서 그룹이 필요하다.
	private JToggleButton jtb1 = new JToggleButton("1번", ii1);
	private JToggleButton jtb2 = new JToggleButton("2번", ii2);
	private JToggleButton jtb3 = new JToggleButton(ii3);
	private JToggleButton jtb4 = new JToggleButton("4번");
	// 2. 그래서 여기 그룹 객체를 만들어야 함
	private ButtonGroup bg = new ButtonGroup();
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(1,4));
		jtb1.setSelectedIcon(ii4);
		//jtb1버튼을 눌렀을 때 매개변수에 적어준 아이콘으롭 바꿔주세요 하는 뜻
		jtb2.setToolTipText("2번버튼입니다.");
		//설명이 뜨도록 하는거
		jtb3.setRolloverIcon(ii4);
		//마우스를 위에 올리기만 해도 매개변수에 있는 아이콘으로 바꿔준다는 뜻
		jtb2.setHorizontalTextPosition(SwingConstants.CENTER);
		//좌, 센터, 우
		jtb2.setVerticalTextPosition(SwingConstants.BOTTOM); 
		// 위(TOP), 중간, 아래(BOTTOM)
		//텍스트 위치를 이동시켜준다는 의미
		jtb1.setMnemonic('1');//char형 값을 넣어준다, int값을 넣으려면 아스키값을 넣어야됨.
		jtb2.setMnemonic('2');//alt키를 누른 상태에서 1을 눌러준다
		jtb3.setMnemonic('3');
		jtb4.setMnemonic('4');
		//기능키 설정하는 방법이다.
		
		bg.add(jtb1);	con.add(jtb1);
		bg.add(jtb2);	con.add(jtb2);
		bg.add(jtb3);	con.add(jtb3);
		bg.add(jtb4);	con.add(jtb4);
	}
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame04(String title) {
		super(title);
		
		this.init();
		this.start();
		
		super.setSize(600, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("swing예제");
	}
}
