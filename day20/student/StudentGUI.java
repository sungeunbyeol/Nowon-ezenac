package student;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentGUI extends JFrame implements ActionListener{
	private JToolBar jtb = new JToolBar();
	private JButton input_bt = new JButton("입력");
	private JButton edit_bt = new JButton("수정");
	private JButton delete_bt = new JButton("삭제");
	private JButton exit_bt = new JButton("종료");
	
	private JTabbedPane jtp = new JTabbedPane();
	private JPanel[] jp = new JPanel[4];
	private JTextArea[] jta = new JTextArea[4];
	
	String[] name = new String[] {"이름", "국어", "영어", "총점"};
	String title = "이름\t\tKOR\t\tENG\t\tTOT\t\tRANK\n";
	
	private StudentPro pro = new StudentProImpl();
	
	private InputDialog input = new InputDialog(this,"입력", true);
	private EditDialog edit = new EditDialog(this, "수정", true);
	
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
		new StudentGUI("학생관리");
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
			String name = JOptionPane.showInputDialog(this, "삭제할 학생 이름 : ",
					"삭제", JOptionPane.QUESTION_MESSAGE);
			Student st = pro.checkName(name);
			if (st != null) {
				pro.delete(st);
				JOptionPane.showMessageDialog(null, name+"학생을 삭제하였습니다.");
				jPanelWrite();
			}else {
				JOptionPane.showMessageDialog(null, name+"학생은 저희 학생이 아닙니다.");
			}
		}else if (e.getSource()==exit_bt) {
			JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
			System.exit(0);
		}else if (e.getSource()==edit_bt) {
			String name = JOptionPane.showInputDialog(this, "수정할 학생 이름 : ",
					"수정", JOptionPane.QUESTION_MESSAGE);
			Student st = pro.checkName(name);
			if (st != null) {
				edit.editStudent(st);
				edit.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null, name+"학생은 저희 학생이 아닙니다.");
			}
		}else if (e.getSource()==edit.bt) {
			Student st = edit.getStudent();
			edit.setVisible(false);
			JOptionPane.showMessageDialog(null, st.getName()+"학생의 성적을 수정하였습니다.");
			pro.edit(st);
			jPanelWrite();
		}
	}
}
