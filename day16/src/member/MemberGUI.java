package member;

import java.awt.*;
import java.awt.event.*;

public class MemberGUI extends Frame implements ActionListener{
	private Button input_bt = new Button("입력");
	private Button delete_bt = new Button("삭제");
	private Button exit_bt = new Button("종료");
	
	String title = "이름\t\tTEL\t\t주소\n";
	private TextArea result_ta = new TextArea(title);
	
	private MemberPro pro = new MemberProImpl();
	
	private Panel p = new Panel();
	public Font font = new Font("", Font.PLAIN, 20);
	
	private InputDialog input = new InputDialog(this,"입력", true);
	private DeleteDialog delete = new DeleteDialog(this, "삭제", true);
	private MessageDialog message = new MessageDialog(null);
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", p);
		p.setLayout(new GridLayout(1, 3));
		input_bt.setFont(font);
		delete_bt.setFont(font);
		exit_bt.setFont(font);
		p.add(input_bt);
		p.add(delete_bt);
		p.add(exit_bt);
		
		result_ta.setFont(font);
		setTextArea();
		this.add("Center", result_ta);
	}
	public void setTextArea() {
		result_ta.setText(title);
		java.util.List<Member> list = pro.view();
		//TextArea의 setText() : 값을 새로 적는다.
		//TextArea의 append() : 값을 이어 써준다.
		for(Member view : list) {
			result_ta.append(view.disp()+"\n");
		}
	}
	
	public void start() {
		input_bt.addActionListener(this);
		delete_bt.addActionListener(this);
		exit_bt.addActionListener(this);
		delete.bt.addActionListener(this);
		input.bt.addActionListener(this);
		message.bt.addActionListener(this);
	}
	
	public MemberGUI(String title) {
		super(title);
		
		this.init();
		this.start();
		
		super.setSize(600, 400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MemberGUI("회원관리");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==exit_bt) {
			pro.exit();
		}else if (e.getSource()==input_bt) {
			input.setVisible(true);
		}else if (e.getSource()==delete_bt) {
			delete.setVisible(true);
		}else if (e.getSource()==delete.bt) {
			String name = delete.getName();
			delete.setVisible(false);
			boolean isDelete = pro.delete(name);
			if (isDelete) {
				message.setMessage(name+"회원님 탈퇴하셨습니다!!");
			}else {
				message.setMessage(name+"님은 저희 회원이 아닙니다!!");
			}
			message.setVisible(true);
			setTextArea();
		}else if (e.getSource()==input.bt) {
			Member member = input.getMember();
			input.setVisible(false);
			pro.input(member);
			setTextArea();
		}else if (e.getSource()==message.bt) {
			message.setVisible(false);
		}
	}
}
