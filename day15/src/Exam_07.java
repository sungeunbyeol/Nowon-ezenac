import java.awt.*;
import java.awt.event.*;

class MyFrame07 extends Frame implements ActionListener{
	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("파일");
	private Menu help = new Menu("도움말");
	private MenuItem f_open = new MenuItem("파일열기");
	private MenuItem f_save = new MenuItem("파일저장");
	private MenuItem f_exit = new MenuItem("종료");
	private MenuItem h_ver = new MenuItem("버젼보기");
	
	private Dialog dlg = new Dialog(this, "버젼", true);
	private Label dlg_lb = new Label("버젼1.0입니다.", Label.CENTER);
	private Button dlg_bt = new Button("확인");
	private Panel dlg_p = new Panel();
	
	public void init() {
		dlg.setLayout(new BorderLayout());
		dlg_lb.setFont(new Font("", Font.ITALIC, 20));
		dlg.add("Center", dlg_lb);
		dlg.add("South", dlg_p);
		dlg_p.setLayout(new FlowLayout());
		dlg_p.add(dlg_bt);		dlg_bt.addActionListener(this);
		dlg.setBounds(200,200, 200, 150);
		dlg.setResizable(false);
		
		this.setMenuBar(mb);
		mb.add(file);
		mb.add(help);
		file.add(f_open);		f_open.addActionListener(this);
		file.add(f_save);		f_save.addActionListener(this);
		file.addSeparator();
		file.add(f_exit);		f_exit.addActionListener(this);
		help.add(h_ver);		h_ver.addActionListener(this);
	}
	
	public MyFrame07(String title) {
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
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==f_exit) {
			System.exit(0);
		}else if (e.getSource()==f_open) {
			FileDialog fdlg = new FileDialog(this, "파일열기", FileDialog.LOAD);
			fdlg.setVisible(true);
		}else if (e.getSource()==f_save) {
			FileDialog fdlg = new FileDialog(this, "파일저장", FileDialog.SAVE);
			fdlg.setVisible(true);
		}else if (e.getSource()==h_ver) {
			dlg.setVisible(true);
		}else if (e.getSource()==dlg_bt) {
			dlg.setVisible(false);
		}
		
	}
}
public class Exam_07 {
	public static void main(String[] args) {
		MyFrame07 mf = new MyFrame07("awt예제");
	}
}
