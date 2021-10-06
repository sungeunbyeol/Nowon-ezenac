import java.awt.*;

public class Exam_06 {
	public static void main(String[]args) {
		Frame f1 = new Frame();//Frame은 새창 띄우는 거
		Frame f2 = new Frame("title");
		
		f1.setVisible(true);
		f2.setVisible(true);
		
		f1.setSize(300,200); //픽셀값을 적어준다
		f2.setSize(400,300);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		//Dimension : 단순하게 가로 세로 값을 저장하는 클래스
		//Toolkit.getDefaultToolkit().getScreenSize()
		// - 내가 쓰고 있는 화면의 크기를 가져와라
		int xpos = (int)(screen.getWidth() - f2.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - f2.getHeight()) / 2;
		//위에꺼는 가로, 아래꺼는 세로. 가운데에 위치할 수 있도록 사이즈 계산하는 방법
		
		f1.setLocation(200,200); //위치조절
		f2.setLocation(xpos,ypos);
		
		f1.setResizable(false); //프레임 크기 조절 못하게 하겠다
		f2.setResizable(false);
	}
}
