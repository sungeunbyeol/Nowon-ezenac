//�α��� ��ư�� ������ �� ������ ȭ��
package project;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class LoginDialog extends JFrame implements ActionListener{
	
	private JPanel name_p= new JPanel();
	private JLabel name_lb = new JLabel("���̵� :           ");
	private JTextField name_t = new JTextField();
	private JPanel tel_p= new JPanel();
	private JLabel tel_lb = new JLabel("��й�ȣ :       ");
	private JTextField tel_t = new JTextField();
	private JPanel bt_p = new JPanel();
	private JButton check_bt = new JButton("Ȯ��");
	private JButton new_bt = new JButton("ȸ������");
	private JButton back_bt = new JButton("���");
	
	private MainDialog md = new MainDialog("��������Ʈ");
	private NewDialog nd = new NewDialog("ȸ������");
	//private SearchFrame sh = new SearchFrame("�˻�");
	
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(3,1));
		con.add(name_p);
		name_p.setLayout(new BorderLayout());
		name_p.add("West",name_lb);
		name_p.add("Center",name_t);
		con.add(tel_p);
		tel_p.setLayout(new BorderLayout());
		tel_p.add("West",tel_lb);
		tel_p.add("Center",tel_t);
		
		con.add(bt_p);
		bt_p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		bt_p.add(new_bt);
		bt_p.add(back_bt);
		bt_p.add(check_bt);
	}
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		check_bt.addActionListener(this);
		new_bt.addActionListener(this);
		back_bt.addActionListener(this);
	}
	
	LoginDialog(String title) {
		super(title);
		
		this.init();
		this.start();
		
		super.setSize(300, 200);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		//super.setVisible(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==check_bt) {
			md.setVisible(true);
			this.setVisible(false);
			//sh.setVisible(false);
		}else if(e.getSource()== new_bt) {
			nd.setVisible(true);
			//this.setVisible(false);
		}else if(e.getSource()==back_bt) {
			this.setVisible(false);
		}//else if() {
		// ������ ���̵�� �α����ϸ� ������ ȭ�� ������ ��
	//}
		
	}

}
