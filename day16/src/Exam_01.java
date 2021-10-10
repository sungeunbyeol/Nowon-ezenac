import java.awt.*;
import java.awt.event.*;
import java.util.*;
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

class MyFrame01 extends Frame implements ActionListener{
	private Button bt[] = new Button[9];
	private String text = "ÁÖ¹®È®ÀÎ¼­\n";
	private TextArea ta = new TextArea(text);
	private String[] foodName = new String[]{"Â¥Àå¸é", "ÃÊ¹ä", "ÅÁ¼öÀ°",
			"Á¦À°µ¤¹ä", "Â«»Í", "±º¸¸µÎ", "ÇÇÀÚ", "¼Ò°¥ºñ", "¶±ººÀÌ"};
	private int[] foodPrice = new int[] {5000, 10000, 9000, 7000, 6000, 4000, 15000, 15000, 3000};
	private Panel food_p = new Panel();
	private Panel ta_p = new Panel();
	
	private ArrayList<Food> list = new ArrayList<>();
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", food_p);
		food_p.setLayout(new GridLayout(3,3));
		for(int i=0; i<bt.length; ++i) {
			bt[i] = new Button(foodName[i]);
			food_p.add(bt[i]);
			bt[i].addActionListener(this);
		}
		ta_p.setPreferredSize(new Dimension(200,300));
		this.add("East", ta_p);
		ta_p.setLayout(new BorderLayout());
		ta_p.add(ta);
		
	}
	
	public MyFrame01(String title) {
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
		Food food = new Food(foodName[po], foodPrice[po]);
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
				for(Food food : list) {
					sum += food.getPrice();
					ta.append(food.getName() + "---" + food.getPrice()+"\n");
				}
				ta.append("================\n");
				ta.append("ÇÕ°è±Ý¾× : " + sum+"¿ø");
			}
		}
		
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("awt¿¹Á¦");
	}
}
