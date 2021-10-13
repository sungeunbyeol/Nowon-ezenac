import java.awt.*;
import java.awt.event.*;

class MyFrame01 extends Frame implements MouseListener{
	private Button[][] bt = new Button[9][9];
	private Panel p = new Panel();
	
	private int[][] arr = new int[9][9];
	private boolean[][] check = new boolean[9][9];
	private int btCheck = 0;
		
	public void buttonSetting() {
		for(int i=0; i<10; ++i) {
			int x = (int)(Math.random()*9);
			int y = (int)(Math.random()*9);
			if (arr[x][y] != 0) {
				--i;
				continue;
			}
			arr[x][y] = 10;
			numSetting(x, y);
		}
	}
	public void numSetting(int i, int j) {
		int minA = i - 1;	if (minA < 0) minA = 0;
		int maxA = i + 1; 	if (maxA > 8) maxA = 8;
		int minB = j - 1; 	if (minB < 0) minB = 0;
		int maxB = j + 1; 	if (maxB > 8) maxB = 8;
		
		for(int a=minA; a<=maxA; ++a) {
			for(int b=minB; b<=maxB; ++b) {
				if (i==a && b==j)	continue;
				if (arr[a][b] == 10) continue;
				arr[a][b]++;
			}
		}
	}
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", p);
		p.setLayout(new GridLayout(9,9));
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				bt[i][j] = new Button("");
				bt[i][j].addMouseListener(this);
				p.add(bt[i][j]);
			}
		}
		buttonSetting();
	}
	
	public MyFrame01(String title) {
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

	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				if (e.getSource()==bt[i][j]) {
					if (e.getButton() == 1) {
						check[i][j] = true;
						btCheck++;
						if (arr[i][j] != 0) {
							if (arr[i][j] == 10) gameover();
							bt[i][j].setLabel(String.valueOf(arr[i][j]));
						}else {
							bt[i][j].setLabel("0");
							zeroCheck(i, j);
						}	
					}else if (e.getButton() == 3) {
						if (check[i][j]) {
							check[i][j] = false;
							btCheck--;
							bt[i][j].setLabel("");
						}else {
							check[i][j] = true;
							btCheck++;
							bt[i][j].setLabel("±ê¹ß");
						}
					}
					//boolean isCheck = checkBoomb();
					//if (isCheck) {
						//½ÇÁ¦ ÆøÅºÀÇ À§Ä¡¿Í ±ê¹ßÀÇ À§Ä¡°¡ °°ÀºÁö È®ÀÎÇÏ¿© °á°ú¸¦ ¾Ë·ÁÁØ´Ù
					//}
					if (btCheck == 81) {
						gameCheck();
					}
				}
			}
		}
	}
	
	public void gameCheck() {
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				if (!bt[i][j].getLabel().equals("±ê¹ß")) {
					continue;
				}else {
					if (arr[i][j] != 10) {
						System.out.println("[" + i + ", " + j + "]ÀÇ ÀÚ¸®´Â ÆøÅºÀÌ ¾Æ´Õ´Ï´Ù.");
						System.exit(0);
					}
				}
			}
		}
		System.out.println("ÆøÅºÁ¦°Å ¼º°ø!!");
		System.exit(0);
	}
	
	public boolean checkBoomb() {
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				if (check[i][j] == false) return false;
			}
		}
		return true;
	}
	
	public void gameover() {
		System.out.println("ÆøÅºÀ» ´­·¯¼­ °ÔÀÓ ³¡!!");
		System.exit(0);
	}
	public void zeroCheck(int i, int j) {
		int minA = i - 1;	if (minA < 0) minA = 0;
		int maxA = i + 1; 	if (maxA > 8) maxA = 8;
		int minB = j - 1; 	if (minB < 0) minB = 0;
		int maxB = j + 1; 	if (maxB > 8) maxB = 8;
		for(int a=minA; a<=maxA; ++a) {
			for(int b=minB; b<=maxB; ++b) {
				if (check[a][b] == true) continue;
				if (arr[a][b] == 0) {
					bt[a][b].setLabel("0");
					check[a][b] = true;
					btCheck++;
					zeroCheck(a, b);
				}else {
					check[a][b] = true;
					btCheck++;
					bt[a][b].setLabel(arr[a][b] == 10 ? "ÆøÅº" : String.valueOf(arr[a][b]));
				}
			}
		}
	}
	
}
public class Exam_01 {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("awt¿¹Á¦");
	}
}
