package student;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentGUI extends JFrame implements ActionListener{
	private JToolBar jtb = new JToolBar();
	private JButton input_bt = new JButton("�Է�");
	private JButton edit_bt = new JButton("����");
	private JButton delete_bt = new JButton("����");
	private JButton exit_bt = new JButton("����");
	
	private JTabbedPane jtp = new JTabbedPane();
	private JPanel[] jp = new JPanel[4];
	private JTextArea[] jta = new JTextArea[4];
	
	String[] name = new String[] {"�̸�", "����", "����", "����"};
	String title = "�̸�\t\tKOR\t\tENG\t\tTOT\t\tRANK\n";
	
	private StudentPro pro = new StudentProImpl();
	
	private InputDialog input = new InputDialog(this,"�Է�", true);
	private EditDialog edit = new EditDialog(this, "����", true);
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", jtb);
		jtb.add(input_bt);
		jtb.add(edit_bt);
		jtb.add(delete_bt);
		jtb.add(exit_bt);
		con.add("Center", jtp);
		for(int i=0; i<4; ++i) {
			jp[i] = new JPanel();
			jtp.add(name[i], jp[i]);
			jp[i].setLayout(new BorderLayout());
			jta[i] = new JTextArea();
			jp[i].add(jta[i]);
		}
	}
	
	public void jPanelWrite() {
		for(int i=0; i<name.length; ++i) {
			ArrayList<Student> res = pro.view(name[i]);
			jta[i].setText(title);
			for(Student s : res) {
				jta[i].append(s.getName()+"\t\t");
				jta[i].append(s.getKor()+"\t\t");
				jta[i].append(s.getEng()+"\t\t");
				jta[i].append(s.getTot()+"\n");
			}
		}
	}
	
	public void start() {
		input_bt.addActionListener(this);
		edit_bt.addActionListener(this);
		delete_bt.addActionListener(this);
		exit_bt.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		input.bt.addActionListener(this);
		edit.bt.addActionListener(this);
	}
	
	public StudentGUI(String title) {
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
		new StudentGUI("�л�����");
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==input_bt) {
			input.setVisible(true);
		}else if (e.getSource()==input.bt) {
			Student st = input.getStudent();
			input.setVisible(false);
			pro.input(st);
			jPanelWrite();
		}else if (e.getSource()==delete_bt) {
			String name = JOptionPane.showInputDialog(this, "������ �л� �̸� : ",
					"����", JOptionPane.QUESTION_MESSAGE);
			Student st = pro.checkName(name);
			if (st != null) {
				pro.delete(st);
				JOptionPane.showMessageDialog(null, name+"�л��� �����Ͽ����ϴ�.");
				jPanelWrite();
			}else {
				JOptionPane.showMessageDialog(null, name+"�л��� ���� �л��� �ƴմϴ�.");
			}
		}else if (e.getSource()==exit_bt) {
			JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
			System.exit(0);
		}else if (e.getSource()==edit_bt) {
			String name = JOptionPane.showInputDialog(this, "������ �л� �̸� : ",
					"����", JOptionPane.QUESTION_MESSAGE);
			Student st = pro.checkName(name);
			if (st != null) {
				edit.editStudent(st);
				edit.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null, name+"�л��� ���� �л��� �ƴմϴ�.");
			}
		}else if (e.getSource()==edit.bt) {
			Student st = edit.getStudent();
			edit.setVisible(false);
			JOptionPane.showMessageDialog(null, st.getName()+"�л��� ������ �����Ͽ����ϴ�.");
			pro.edit(st);
			jPanelWrite();
		}
	}
}
