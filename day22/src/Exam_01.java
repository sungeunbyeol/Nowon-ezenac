import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class MyFrame01 extends JFrame implements ActionListener{
	private JButton left_bt = new JButton("◀");
	private JButton right_bt = new JButton("▶");
	private int year = 2021;
	private int month = 10;
	private JLabel lb = new JLabel(year+"년 "+month + "월", JLabel.CENTER);
	private JPanel north_p = new JPanel();
	
	private JPanel center_p = new JPanel();
	private JButton[] week = new JButton[7];
	private String[] str = new String[] {"일","월","화","수","목","금","토"};
	private JButton[] bt = new JButton[42];
			
	private MessageDialog message = new MessageDialog(this);
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", north_p);
		north_p.setLayout(new BorderLayout());
		north_p.add("West", left_bt);			left_bt.addActionListener(this);
		lb.setFont(new Font("", Font.BOLD, 25));
		north_p.add("Center", lb);
		north_p.add("East", right_bt);			right_bt.addActionListener(this);
		this.add("Center", center_p);
		center_p.setLayout(new GridLayout(7,7));
		for(int i=0; i<week.length; ++i) {
			week[i] = new JButton(str[i]);
			center_p.add(week[i]);
		}
		for(int i=0; i<42; ++i) {
			bt[i] = new JButton("");
			center_p.add(bt[i]);
			bt[i].addActionListener(this);
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		message.bt.addActionListener(this);
		buttonSetting();
	}
	
	public void buttonSetting() {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		int week1 = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int co = 0;//배열의 위치
		for(int i=1; i<week1; ++i) {
			bt[co].setEnabled(false);//true-활성, false-비활성
			++co;
		}
		for(int i=1; i<=lastDay; ++i) {
			bt[co].setText(String.valueOf(i));
			++co;
		}
		for(int i=co; i<bt.length; ++i) {
			bt[i].setEnabled(false);
		}
		
	}
	
	public MyFrame01(String title) {
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
	public void buttonClear() {
		for(int i=0; i<bt.length; ++i) {
			bt[i].setText("");
			bt[i].setEnabled(true);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==left_bt) {
			--month;
			if (month == 0) {
				month = 12;
				--year;
			}
			lb.setText(year+"년 "+month + "월");
			buttonClear();
			buttonSetting();
		}else if (e.getSource()==right_bt) {
			++month;
			if (month == 13) {
				month = 1;
				++year;
			}
			lb.setText(year+"년 "+month + "월");
			buttonClear();
			buttonSetting();
		}else if (message.bt == e.getSource()){
			message.saveMessage();
			message.setVisible(false);
		}else {
			for(int i=0; i<42; ++i) {
				if (bt[i] == e.getSource()) {
					String filename = String.valueOf(year);
					if (month<10) 	filename += "0" + month;
					else 			filename += month;
					String day = e.getActionCommand();
					if (Integer.parseInt(day)<10) 	filename += "0" + day;
					else 							filename += day;
					filename += ".txt";
					message.loadMessage(filename);
					message.setVisible(true);
				}
			}
		}
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("다이어리예제");
	}
}
