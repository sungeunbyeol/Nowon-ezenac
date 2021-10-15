package baseball;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class BaseBallGUI extends JFrame implements ActionListener{
	private JButton teamBt[] = new JButton[10];
	private JButton input_bt = new JButton("입력");
	private JButton delete_bt = new JButton("삭제");
	private JButton trade_bt = new JButton("트레이드");
	private JTextArea ta = new JTextArea("");
	String title = new String("이름\t계약\t연봉\t포지션\n");
	private JPanel team_p = new JPanel();
	private JPanel order_p = new JPanel();
	
	private PlayerMg playerMg = new PlayerMgImpl();
	
	private MessageDialog msg = new MessageDialog(null);
	private InputDialog input = new InputDialog(this,"입력", true);
	private GetNameDialog getName = new GetNameDialog(this, true);
	private TradeDialog trade = new TradeDialog(this, "트레이드",true);
	
	private String selectTeam = "";
	private boolean isTeamSelect = false;
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", team_p);
		team_p.setLayout(new GridLayout(1, 10));
		TeamName[] team = TeamName.values(); 
		for(int i=0; i<10; ++i) {
			teamBt[i] = new JButton(String.valueOf(team[i]));
			team_p.add(teamBt[i]);
			teamBt[i].addActionListener(this);
		}
		ta.setFont(new Font("", Font.PLAIN, 20));
		ta.setEditable(false);	//TextArea안에 내용을 직접수정 못하도록 한다
		this.add("Center", ta);
		this.add("South", order_p);
		order_p.setLayout(new GridLayout(1, 3));
		order_p.add(input_bt);
		order_p.add(delete_bt);
		order_p.add(trade_bt);
	}
	public void start() {
		input_bt.addActionListener(this);
		delete_bt.addActionListener(this);
		trade_bt.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		msg.bt.addActionListener(this);
		input.bt.addActionListener(this);
		getName.bt.addActionListener(this);
		trade.bt.addActionListener(this);
	}
	
	public BaseBallGUI(String title) {
		super(title);
			
		this.init();
		this.start();
		
		super.setSize(800, 400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth() - this.getWidth()) / 2;
		int ypos = (int)(screen.getHeight() - this.getHeight()) / 2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
			
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==msg.bt) {
			msg.setVisible(false);
		}
		for(int i=0; i<10; ++i) {
			if (e.getSource()==teamBt[i]) {
				selectTeam = teamBt[i].getLabel();
				teamList();
				isTeamSelect = true;
			}
		}
		if (!isTeamSelect) {
			JOptionPane.showMessageDialog(this, "구단 선택 먼저 해주세요!!", "경고",
					JOptionPane.INFORMATION_MESSAGE);
		}else if (e.getSource()==input_bt) {
			input.setTeam(selectTeam);
			input.setVisible(true);
		}else if (e.getSource()==delete_bt) {
			//모양을 얻었지만 기능을 잃었습니다......................................휴
			//getName.setVisible(true);
			String name = JOptionPane.showInputDialog(this, "삭제할 이름 : ",
					"삭제", JOptionPane.QUESTION_MESSAGE);
			//Player player = playerMg.checkName(name);
		}else if (e.getSource()==trade_bt) {
			trade.setVisible(true);	
		}else if (e.getSource()==input.bt) {
			Player player = input.getPlayer();
			playerMg.input(player);
			teamList();
			input.setVisible(false);
		}else if (e.getSource()==getName.bt) {
			String name = getName.getName();
			getName.setVisible(false);
			boolean isDel = playerMg.delete(selectTeam, name);
			if (isDel) {
				JOptionPane.showMessageDialog(this, selectTeam+"팀의 " + name+"선수를 삭제하였습니다.", "알림",
						JOptionPane.INFORMATION_MESSAGE);
				teamList();
			}else {
				JOptionPane.showMessageDialog(this, selectTeam+"팀의 " + name+"선수는 없습니다.", "알림",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}else if (e.getSource()==trade.bt) {
			String name = trade.getName();
			String team = trade.getTeam();
			trade.setVisible(false);
			playerMg.trade(selectTeam, name, team);
			teamList();
		}
	}
	
	public void teamList() {
		ta.setText(selectTeam + "\n");
		Font fFont = new Font("", Font.BOLD, 20);
		ta.setFont(fFont);
		ta.setForeground(Color.blue);
		ta.append("이름\t계약\t연봉\t포지션\n");
		java.util.List<Player> list = playerMg.view(selectTeam);
		for(Player player : list) {
			ta.append(player.getName() + "\t");
			ta.append(player.getPay() + "\t");
			ta.append(player.getSalary() + "\t");
			ta.append(player.getPosition() + "\n");
		}
	}
}

