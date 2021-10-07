import java.awt.*;

class MyFrame02 extends Frame{
	private Dialog dlg = new Dialog(this, "새창", true);
	//this는 Frame 위에 올려 하는 의미, Frame이 없을 땐 Null 사용
	private Button dlg_bt = new Button("확인");
	
	public void init() {
		dlg.setLayout(new BorderLayout());
		dlg.add("South" , dlg_bt);
	}
	
	public MyFrame02(String title) {
		super(title);
	
		this.init();
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		dlg.setBounds(xpos, ypos, 200, 150);
		//setBounds => setLocation(앞의 두자리)과 setSize(뒤의 두자리)메소드를 합친것
		dlg.setResizable(false);
		dlg.setVisible(true);
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("awt예제");
	}
}
