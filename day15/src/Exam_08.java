import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

class MyFrame08 extends Frame implements ActionListener{
	private Button left_bt = new Button("��");
	private Button right_bt = new Button("��");
	private int year = 2021;
	private int month = 10;
	private Label lb = new Label(year+"�� "+month + "��", Label.CENTER);
	private Panel north_p = new Panel();
	
	private Panel center_p = new Panel();
	private Button[] week = new Button[7];
	private String[] str = new String[] {"��","��","ȭ","��","��","��","��"};
	private Button[] bt = new Button[42];
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", north_p);
		north_p.setLayout(new BorderLayout());
		north_p.add("West", left_bt);		left_bt.addActionListener(this);
		lb.setFont(new Font("", Font.BOLD, 25));
		north_p.add("Center", lb);
		north_p.add("East", right_bt);		right_bt.addActionListener(this);
		this.add("Center", center_p);
		center_p.setLayout(new GridLayout(7,7));
		for(int i=0; i<week.length; ++i) {
			week[i] = new Button(str[i]);
			//week[i].setEnabled(false);
			center_p.add(week[i]);
		}
		for(int i=0; i<42; ++i) {
			bt[i] = new Button("");
			center_p.add(bt[i]);
		}
		buttonSetting();
	}
	
	public void buttonSetting() {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		int week1 = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int co = 0;//�迭�� ��ġ
		for(int i=1; i<week1; ++i) {
			bt[co].setEnabled(false);//true-Ȱ��, false-��Ȱ��
			++co;
		}
		for(int i=1; i<=lastDay; ++i) {
			bt[co].setLabel(String.valueOf(i));
			++co;
		}
		for(int i=co; i<bt.length; ++i) {
			bt[i].setEnabled(false);
		}
		
	}
	
	public MyFrame08(String title) {
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
			bt[i].setLabel("");
			bt[i].setEnabled(true);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==left_bt) {
			--month;
			if(month==0) {
				month = 12;
				--year;
			}
		}else if(e.getSource()==right_bt) {
			++month;
			if(month==13) {
				month = 1;
				++year;
			}
		}
		lb.setText(year+"�� "+month + "��",);
		buttonClear();
		buttonSetting()
;	}
}
public class Exam_08 {
	public static void main(String[] args) {
		MyFrame08 mf = new MyFrame08("awt����");
	}
}
