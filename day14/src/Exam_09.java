import java.awt.*;

//Frame을 계속 쓰기 힘드니까 클래스를 하나 만들어줌
class MyFrame09 extends Frame{ //Frame을 상속받아야 함
	private Button bt1 = new Button("버튼1");
	private Button bt2 = new Button("버튼2");
	private Button bt3 = new Button("버튼3");
	private Button bt4 = new Button("버튼4");
	private Button bt5 = new Button("버튼5");
	private Button bt6 = new Button("버튼6");
	
	//3행2열,좌우간격5,위아래간격10
	//좌우위아래 간격 안주면 다닥다닥 붙음
	private GridLayout gl = new GridLayout(3,2, 5,10);
	
	//생성자
	public MyFrame09(String title) {//제목 있으면 좋으니까 문자열로 매개변수를 받음
		super(title); //부모한테 매개변수 전달
		
		this.setLayout(gl);
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);

		
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

public class Exam_09 {
	public static void main(String[]args) {
		MyFrame09 mf09 = new MyFrame09("awt예제");
	}
}
