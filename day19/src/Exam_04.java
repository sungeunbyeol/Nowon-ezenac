import java.awt.*;
import java.awt.event.*;
import java.util.*;

enum Menu{
	menu1("돈가스", 7000),
	menu2("떡볶이", 3000),
	menu3("신라면", 3500),
	menu4("생우동", 6000),
	menu5("짜장면", 5000),
	menu6("맛짬뽕", 6000),
	menu7("순대국", 8000),
	menu8("햄버거", 6000),
	menu9("해장국", 8000);
	
	private String name;
	private int price;
	
	Menu(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
class Food{
	private String name;
	private int price;
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}

class MyButton04 extends Button{
	private Image img;
	public MyButton04(Image img) {
		this.img = img;
	}
	public void paint(Graphics g) {
		g.drawImage(img, 5, 5, getWidth()-10, getHeight()-10, this);
	}
}

class MyFrame04 extends Frame implements ActionListener{
	private MyButton04 bt[] = new MyButton04[9];
	private String text = "주문확인서\n";
	private TextArea ta = new TextArea(text);
	private Panel food_p = new Panel();
	private Panel ta_p = new Panel();
	
	private ArrayList<Food> list = new ArrayList<>();
	
	Menu[] menu = Menu.values();
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", food_p);
		food_p.setLayout(new GridLayout(3,3));
		for(int i=0; i<bt.length; ++i) {
			Image img = Toolkit.getDefaultToolkit().getImage("image\\image"+i+".jpg");
			bt[i] = new MyButton04(img);
			food_p.add(bt[i]);
			bt[i].addActionListener(this);
		}
		ta_p.setPreferredSize(new Dimension(150,300));
		this.add("East", ta_p);
		ta_p.setLayout(new BorderLayout());
		ta_p.add(ta);
		
	}
	
	public MyFrame04(String title) {
		super(title);
		
		this.init();
		
		super.setSize(600, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}

	public void process(int po) {
		Food food = new Food(menu[po].getName(), menu[po].getPrice());
		list.add(food);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i=0; i<bt.length; ++i) {
			if (e.getSource()==bt[i]) {
				process(i);
				int sum = 0;
				ta.setText(text);
				ta.append("----------------\n");
				java.text.DecimalFormat df 
					= new java.text.DecimalFormat("###,###");
				for(Food food : list) {
					sum += food.getPrice();
					ta.append(food.getName() + "---" + df.format(food.getPrice())+"\n");
				}
				ta.append("================\n");
				ta.append("합계금액 : " + df.format(sum)+"원");
			}
		}
		
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("awt예제");
	}
}
