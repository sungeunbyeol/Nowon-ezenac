import java.awt.*;

//Frame을 계속 쓰기 힘드니까 클래스를 하나 만들어줌
class MyFrame11 extends Frame{ //Frame을 상속받아야 함
	private Button bt1 = new Button("yes");
	private Button bt2 = new Button("no1");
	private Button bt3 = new Button("no2");
	
	private BorderLayout bl = new BorderLayout(); 
	private Panel pl = new Panel();
	private GridLayout gl = new GridLayout(1,2);
	
	private Panel pl2 = new Panel();
	private GridLayout gl2 = new GridLayout(2,1);
	
	//생성자
	public MyFrame11(String title) {//제목 있으면 좋으니까 문자열로 매개변수를 받음
		super(title); //부모한테 매개변수 전달
		
		this.setLayout(bl);
		this.add("South", pl);
		pl.setLayout(gl);
		pl.add(bt1);
		pl.add(pl2);
		pl2.setLayout(gl2);
		pl2.add(bt2);
		pl2.add(bt3);
		
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
	}
}

public class Exam_11 {
	public static void main(String[]args) {
		MyFrame11 mf11 = new MyFrame11("awt예제");
	}
}
