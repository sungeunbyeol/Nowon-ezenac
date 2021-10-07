import java.awt.*;
import java.awt.event.*;

class MyFrame09 extends Frame implements ActionListener{
	private TextField tf = new TextField();
	private Button[] bt = new Button[16];
	private String[] str = new String[]
			{"7","8","9","+","4","5","6","-","1","2","3","*","0","=","%","/"};
	
	private BorderLayout bl = new BorderLayout();
	private Panel p = new Panel();
	private GridLayout gl = new GridLayout(4,4,2,2);
		
	private char op = 0;
	private boolean isOp = false;//연산자가 입력이 되었다면 true로 바꿔준다
	private String firstSu = "";
	
	public void init() {
		this.setLayout(bl);
		tf.setFont(new Font("", Font.PLAIN, 30));
		this.add("North", tf);
		this.add("Center", p);
		p.setLayout(gl);
		for(int i=0; i<bt.length; ++i) {
			bt[i] = new Button(str[i]);
			bt[i].addActionListener(this);
			p.add(bt[i]);
		}
	}
	public MyFrame09(String title) {
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
	
	public void calculator() {
		int res = 0;
		switch(op) {
		case '+' : res = Integer.parseInt(firstSu) + Integer.parseInt(tf.getText()); break;
		case '-' : res = Integer.parseInt(firstSu) - Integer.parseInt(tf.getText()); break;
		case '*' : res = Integer.parseInt(firstSu) * Integer.parseInt(tf.getText()); break;
		case '/' : res = Integer.parseInt(firstSu) / Integer.parseInt(tf.getText()); break;
		case '%' : res = Integer.parseInt(firstSu) % Integer.parseInt(tf.getText()); break;
		default  : res = Integer.parseInt(tf.getText());
		}
		tf.setText(String.valueOf(res));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();//버튼의 text값을 꺼내온다
		//String str = ((Button)e.getSource()).getLabel();
		
		if (e.getSource()==bt[13]) {// "="
			calculator();
			isOp = true;
			op = 0;
		}else if (e.getSource()==bt[3] || e.getSource()==bt[7] 
				|| e.getSource()==bt[11] || e.getSource()==bt[14] || e.getSource()==bt[15]) {
			if (op != 0) {
				calculator();
			}
			isOp = true;
			op = str.charAt(0);
		}else {
			if (isOp) {
				firstSu = tf.getText();
				tf.setText(str);
				isOp = false;
			}else {
				tf.setText(tf.getText() + str);
			}
		}
	}
}
public class Exam_09 {
	public static void main(String[] args) {
		MyFrame09 mf = new MyFrame09("awt예제");
	}
}