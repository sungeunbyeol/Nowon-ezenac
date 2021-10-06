import java.awt.*;

class MyFrame17 extends Frame{
	private List alpha_list = new List(5, true);
	
	public void init() {
		//this.setLayout(new BorderLayout());//Frame의 기본 layout이 BorderLayout이다
		for(int i=0; i<26; ++i) {
			String s = String.valueOf((char)(65+i));
			alpha_list.add(s+s+s);
		}
		this.add(alpha_list);//center에 저장이 된다.
	}
	
	public MyFrame17(String title) {
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
}
public class Exam_17 {
	public static void main(String[] args) {
		MyFrame17 mf = new MyFrame17("awt예제");
	}
}
