import java.awt.*;

class MyFrame08 extends Frame{ 
	private Button bt1 = new Button("확인1");
	private Button bt2 = new Button("확인2");
	
	
	private FlowLayout f1 = new FlowLayout(FlowLayout.RIGHT); //배치관리자를 먼저 만들고
	//FlowLAyout.CENTER : default , LEFT, RIGHT를 적용시킬 수 있음.
	//private FlowLayout f1 = new FlowLayout(); 이렇게 하면 가운데에 적용됨 
	//왜? default 값이 CENTER 이기 때문에 
	
	public MyFrame08(String title) {
		super(title); 
		
		this.setLayout(f1); //배치관리를 적용하겠다.
		
		this.add(bt1);
		this.add(bt2);
		
		super.setSize(400,300);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
	
		super.setLocation(xpos, ypos);
		super.setResizable(false); 
		
		super.setVisible(true); 
	}
}

public class Exam_08 {
	public static void main(String[]args) {
		MyFrame08 mf08 = new MyFrame08("awt예제");
	}
}
