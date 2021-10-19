

import java.awt.*;
import java.io.*;

public class MessageDialog extends Dialog{
	private TextArea ta = new TextArea();
	Button bt = new Button("»Æ¿Œ");
	private File dir = new File("D:\\javaAPI\\study\\day22\\data");
	private File file;
	
	MessageDialog(Frame owner){
		super(owner);
		this.setLayout(new BorderLayout());
		this.add("Center", ta);
		this.add("South", bt);
		
		super.setSize(200, 400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
	}
	
	public void loadMessage(String filename) {
		this.setTitle(filename);
		file = new File(dir, filename);
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String msg = null;
			while((msg = br.readLine()) != null) {
				ta.append(msg);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void saveMessage() {
		try{
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(ta.getText());
			pw.close();
		}catch(Exception e) {}
		ta.setText("");
	}

}
