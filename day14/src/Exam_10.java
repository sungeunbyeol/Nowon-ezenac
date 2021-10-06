import java.awt.*;

//Frame을 계속 쓰기 힘드니까 클래스를 하나 만들어줌
class MyFrame10 extends Frame{ //Frame을 상속받아야 함
	private Button bt1 = new Button("버튼1");
	private Button bt2 = new Button("버튼2");
	private Button bt3 = new Button("버튼3");
	private Button bt4 = new Button("버튼4");
	private Button bt5 = new Button("버튼5");
	
	private BorderLayout bl = new BorderLayout(5,10);
	
	//생성자
	public MyFrame10(String title) {//제목 있으면 좋으니까 문자열로 매개변수를 받음
		super(title); //부모한테 매개변수 전달
		
		//Frame의 default Layout은 BorderLayout이다
		this.setLayout(bl);
		this.add("North", bt1);
		this.add("South", bt2);
		this.add("East", bt3);
		this.add("West", bt4);
		this.add("Center", bt5);
		
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

public class Exam_10 {
	public static void main(String[]args) {
		MyFrame10 mf10 = new MyFrame10("awt예제");
	}
}
