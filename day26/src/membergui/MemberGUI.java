package membergui;

import java.awt.*;
import java.awt.event.*;

public class MemberGUI extends Frame implements ActionListener{
	private Button input_bt = new Button("�Է�");
	private Button delete_bt = new Button("����");
	private Button exit_bt = new Button("����");
	
	String title = "�̸�\t\tTEL\t\t�ּ�\n";
	private TextArea result_ta = new TextArea(title);
	
	private MemberPro pro = new MemberProImpl();
	
	private Panel p = new Panel();
	public Font font = new Font("", Font.PLAIN, 20);
	
	private InputDialog input = new InputDialog(this,"�Է�", true);
	private DeleteDialog delete = new DeleteDialog(this, "����", true);
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
		//TextArea�� setText() : ���� ���� ���´�.
		//TextArea�� append() : ���� �̾� ���ش�.
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
		new MemberGUI("ȸ������");
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
				message.setMessage(name+"ȸ���� Ż���ϼ̽��ϴ�!!");
			}else {
				message.setMessage(name+"���� ���� ȸ���� �ƴմϴ�!!");
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
