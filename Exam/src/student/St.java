package student;

import java.awt.*;
import java.awt.event.*;

class student01{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private int rank;
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public int getRank() {
		return rank;
	}
	public void setRank() {
		this.rank = rank;
	}
	
	public student01(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		tot = (kor+eng+math);
		rank = 1;
	}
}


class MyFrame extends Frame implements ActionListener{ //Frame을 상속받아야 함
	private Panel F_pl = new Panel();
	private TextArea txt = new TextArea();
	
	private Panel B_pl = new Panel();

	private Dialog input_dlg  = new Dialog(this, "학생등록", true);
	private Dialog edit_dlg = new Dialog(this, "수정", true);
	private Dialog delete_dlg = new Dialog(this, "학생삭제", true);
	
	private Button input_bt = new Button("학생등록");
	private Button edit_bt = new Button("수정");
	private Button delete_bt = new Button("학생삭제");
	private Button exit_bt = new Button("종료");
	
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private Panel p3 = new Panel();
	private Panel p4 = new Panel();
	private Label name_lb = new Label("이름");
	private TextField name_txt = new TextField();
	private Label kor = new Label("국어점수");
	private TextField kor_lb = new TextField();
	private Label eng = new Label("영어점수");
	private TextField eng_lb = new TextField();
	private Label math = new Label("수학점수");
	private TextField math_lb = new TextField();
	private Button save = new Button("저장");

	private Panel p_1 = new Panel();
	private Panel p_2 = new Panel();
	private Panel p_3 = new Panel();
	private Panel p_4 = new Panel();
	private Label namelb = new Label("이름");
	private TextField nametxt = new TextField();
	private Label korlb = new Label("국어점수");
	private TextField kor_txt = new TextField();
	private Label englb= new Label("영어점수");
	private TextField engtxt = new TextField();
	private Label mathlb = new Label("수학점수");
	private TextField mathtxt = new TextField();
	private Button edit = new Button("수정");

	private Panel del_p = new Panel();
	private Label name_del = new Label("이름");
	private TextField name_tf = new TextField();
	private Button del_bt = new Button("삭제");
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add(F_pl);
		F_pl.setLayout(new GridLayout(2,1));
		F_pl.add(B_pl);
		F_pl.add(txt);
		B_pl.setLayout(new GridLayout(1,1));
		B_pl.add(input_bt);		input_bt.addActionListener(this);
		B_pl.add(edit_bt);		edit_bt.addActionListener(this);
		B_pl.add(delete_bt);	delete_bt.addActionListener(this);
		B_pl.add(exit_bt);		exit_bt.addActionListener(this);
	}
	
	public void input_init() {
		input_dlg.setLayout(new GridLayout(5,1));
		input_dlg.add(p1);
		p1.setLayout(new BorderLayout());
		p1.add("West", name_lb);
		p1.add("Center", name_txt);
		input_dlg.add(p2);
		p2.setLayout(new BorderLayout());
		p2.add("West", kor);
		p2.add("Center", kor_lb);
		input_dlg.add(p3);
		p3.setLayout(new BorderLayout());
		p3.add("West", eng);
		p3.add("Center", eng_lb);
		input_dlg.add(p4);
		p4.setLayout(new BorderLayout());
		p4.add("West", math);
		p4.add("Center", math_lb);
		input_dlg.add(save);
	}
	
	public void edit_init() {
		edit_dlg.setLayout(new GridLayout(5,1));
		edit_dlg.add(p_1);
		p_1.setLayout(new BorderLayout());
		p_1.add("West", namelb);
		p_1.add("Center", nametxt);
		edit_dlg.add(p_2);
		p_2.setLayout(new BorderLayout());
		p_2.add("West", korlb);
		p_2.add("Center", kor_txt);
		edit_dlg.add(p_3);
		p_3.setLayout(new BorderLayout());
		p_3.add("West", englb);
		p_3.add("Center", engtxt);
		edit_dlg.add(p_4);
		p_4.setLayout(new BorderLayout());
		p_4.add("West", mathlb);
		p_4.add("Center", mathtxt);
		edit_dlg.add(edit);
	}
	
	public void delete_init() {
		delete_dlg.setLayout(new GridLayout(2,1));
		delete_dlg.add(del_p);
		del_p.setLayout(new BorderLayout());
		del_p.add("West",name_del);
		del_p.add("Center", name_tf);
		delete_dlg.add(del_bt);
	}
	
	//생성자
	public MyFrame(String title) {//제목 있으면 좋으니까 문자열로 매개변수를 받음
		super(title); //부모한테 매개변수 전달
		
		this.init();
		this.input_init();
		this.edit_init();
		this.delete_init();
		
		super.setSize(400,300); // window 사이즈 정하기
		
		//Dimension : 단순하게 가로 세로 값을 저장하는 클래스
		//Toolkit.getDefaultToolkit().getScreenSize()
		// - 내가 쓰고 있는 화면의 크기를 가져와라
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		//만들어진 window가 가운데에 위치할 수 있도록 사이즈 계산하는 방법
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
	
		super.setLocation(xpos, ypos);//위치조절
		super.setResizable(false); //사이즈 조절불가하게 만들기
		
		super.setVisible(true); //화면에 window 보이게 하기
		
		input_dlg.setSize(200,200);
		input_dlg.setLocation(xpos, ypos);
		input_dlg.setResizable(false);
		edit_dlg.setSize(200,200);
		edit_dlg.setLocation(xpos, ypos);
		edit_dlg.setResizable(false);
		delete_dlg.setSize(250,150);
		delete_dlg.setLocation(xpos,ypos);
		delete_dlg.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==input_bt) {
			input_dlg.setVisible(true);
		} else if(e.getSource()==edit_bt){
			edit_dlg.setVisible(true);
		} else if(e.getSource()==delete_bt) {
			delete_dlg.setVisible(true);
		} else if(e.getSource()==exit_bt) {
			System.exit(0);
		}
	}

	
	public static void main(String[]args) {
		MyFrame mf = new MyFrame("성적관리프로그램");
	}
}

