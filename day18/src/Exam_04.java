import java.awt.*;

class MyFrame04 extends Frame{ //Frame을 상속받아야 함
	
	//생성자
	public MyFrame04(String title) {//제목 있으면 좋으니까 문자열로 매개변수를 받음
		super(title); //부모한테 매개변수 전달
		
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
	public void paint(Graphics g) {
		g.drawLine(50, 50, 100, 100);
		//앞 두자리가 시작점, 뒤 두자리가 끝점, 이 두점을 직선으로 연결
		g.drawRect(50, 50, 100, 100);
		// 앞 두자리가 시작점, 3번째가 가로이동, 4번째가 세로이동 시켜서 직사각형을 만든다.
		g.setColor(Color.blue);
		g.fillRect(200, 50, 100, 100);
		// draw는 선을 그리는 것이고, fill은 내부를 채우는 것이다
		g.setColor(Color.red);
		g.fillOval(50, 50, 100, 100);
		
		int x[]=new int[] {60, 120, 80}; 
		int y[]=new int[] {60, 100, 140};
		g.setColor(Color.green); 
		g.drawPolygon(x,y,3); //삼각형이라서 뒤에 3이다. 4를 써주면 좌표를 하나 더 입력해줘야 함. 삼각형은 다각형으로 만들어야 한다
		//g.drawPolyline(x,y,3); //마지막 선을 안그어준다
		
		g.setColor(Color.black);
		g.setFont(new Font("", Font.BOLD, 30));
		g.drawString("그래픽클래스예제", 50, 200);
		
		Image img = Toolkit.getDefaultToolkit().getImage("woo.jpg");
		//g.drawImage(img, 0,0, this.getWidth(), this.getHeight(), this); //이건 화면 꽉채우는거
		g.drawImage(img, 50,50,100,100,this);
	}
	
	
}

public class Exam_04 {
	public static void main(String[]args) {
		MyFrame04 mf = new MyFrame04("awt예제");
	}
}
