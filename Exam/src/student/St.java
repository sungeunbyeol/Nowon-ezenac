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


class MyFrame extends Frame implements ActionListener{ //Frame�� ��ӹ޾ƾ� ��
	private Panel F_pl = new Panel();
	private TextArea txt = new TextArea();
	
	private Panel B_pl = new Panel();

	private Dialog input_dlg  = new Dialog(this, "�л����", true);
	private Dialog edit_dlg = new Dialog(this, "����", true);
	private Dialog delete_dlg = new Dialog(this, "�л�����", true);
	
	private Button input_bt = new Button("�л����");
	private Button edit_bt = new Button("����");
	private Button delete_bt = new Button("�л�����");
	private Button exit_bt = new Button("����");
	
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private Panel p3 = new Panel();
	private Panel p4 = new Panel();
	private Label name_lb = new Label("�̸�");
	private TextField name_txt = new TextField();
	private Label kor = new Label("��������");
	private TextField kor_lb = new TextField();
	private Label eng = new Label("��������");
	private TextField eng_lb = new TextField();
	private Label math = new Label("��������");
	private TextField math_lb = new TextField();
	private Button save = new Button("����");

	private Panel p_1 = new Panel();
	private Panel p_2 = new Panel();
	private Panel p_3 = new Panel();
	private Panel p_4 = new Panel();
	private Label namelb = new Label("�̸�");
	private TextField nametxt = new TextField();
	private Label korlb = new Label("��������");
	private TextField kor_txt = new TextField();
	private Label englb= new Label("��������");
	private TextField engtxt = new TextField();
	private Label mathlb = new Label("��������");
	private TextField mathtxt = new TextField();
	private Button edit = new Button("����");

	private Panel del_p = new Panel();
	private Label name_del = new Label("�̸�");
	private TextField name_tf = new TextField();
	private Button del_bt = new Button("����");
	
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
	
	//������
	public MyFrame(String title) {//���� ������ �����ϱ� ���ڿ��� �Ű������� ����
		super(title); //�θ����� �Ű����� ����
		
		this.init();
		this.input_init();
		this.edit_init();
		this.delete_init();
		
		super.setSize(400,300); // window ������ ���ϱ�
		
		//Dimension : �ܼ��ϰ� ���� ���� ���� �����ϴ� Ŭ����
		//Toolkit.getDefaultToolkit().getScreenSize()
		// - ���� ���� �ִ� ȭ���� ũ�⸦ �����Ͷ�
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		//������� window�� ����� ��ġ�� �� �ֵ��� ������ ����ϴ� ���
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
	
		super.setLocation(xpos, ypos);//��ġ����
		super.setResizable(false); //������ �����Ұ��ϰ� �����
		
		super.setVisible(true); //ȭ�鿡 window ���̰� �ϱ�
		
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
		MyFrame mf = new MyFrame("�����������α׷�");
	}
}

