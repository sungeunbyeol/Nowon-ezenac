import java.awt.*;
import java.awt.event.*;

class MyFrame05 extends Frame implements ActionListener{
	private Button left_bt = new Button("왼쪽버튼");
	private Button center_bt = new Button("가운데버튼");
	private Button right_bt = new Button("오른쪽버튼");
	
	private Label msg_lb = new Label("아무 버튼이나 누르세요");
	private Panel p = new Panel();
	
	public void init() {
		this.setLayout(new GridLayout(2,1));//전체적인 틀은 GirdLayout으로 하겠다
		this.add(p);//전체적인 Frame에 Panel P를 넣어주겠다
		p.setLayout(new GridLayout(1,3)); //Panel의 전체적인 틀은 GridLayout으로 하겠다
		p.add(left_bt);	  // Panel에 Button left_bt을 추가하겠다.
		p.add(center_bt); // Panel에 Button center_bt을 추가하겠다.
		p.add(right_bt); // Panel에 Button right_bt을 추가하겠다.
		left_bt.addActionListener(this); //왼쪽버튼에 액션이벤트를 추가하겠다.
		center_bt.addActionListener(this); //가운데버튼에 액션이벤트를 추가하겠다
		right_bt.addActionListener(this); //오른쪽버튼에 액션이벤트를 추가하겠다
		msg_lb.setFont(new Font("", Font.BOLD, 25)); //Label msg_lb의 폰트는 이렇게 지정해주겠다
		this.add(msg_lb); //전체적인 Frame에 Label msg_lb을 넣어주겠다
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==left_bt) {
			msg_lb.setText("왼쪽버튼을 누르셨습니다");
		}else if (e.getSource()==center_bt) {
			msg_lb.setText("가운데버튼을 누르셨습니다");
		}else if (e.getSource()==right_bt) {
			msg_lb.setText("오른쪽버튼을 누르셨습니다");
		}
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("awt예제");
	}
}
