package baseball;
import java.awt.*;
import java.awt.event.*;

public class BaseBallGUI extends Frame implements ActionListener{
	private Button teamBt[] = new Button[10];
	private Button input_bt = new Button("입력");
	private Button delete_bt = new Button("삭제");
	private Button trade_bt = new Button("트레이드");
	private TextArea ta = new TextArea("");
	String title = new String("이름\t\t계약\t\t연봉\t\t포지션\n");
	private Panel team_p = new Panel();
	private Panel order_p = new Panel();
	
	private PlayerMg playerMg = new PlayerMgImpl();
	
	private MessageDialog msg = new MessageDialog(null);
	private InputDialog input = new InputDialog(this, true);
	private GetNameDialog getName = new GetNameDialog(this, true);
	private TradeDialog trade = new TradeDialog(this, true);
	
	private String selectTeam = "";
	private boolean isTeamSelect = false;
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", team_p);
		team_p.setLayout(new GridLayout(1, 10));
		TeamName[] team = TeamName.values(); 
		for(int i=0; i<10; ++i) {
			teamBt[i] = new Button(String.valueOf(team[i]));
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
			msg.setMessage("먼저 버튼을 누르셔야 합니다!!");
			msg.setVisible(true);
		}else if (e.getSource()==input_bt) {
			input.setTeam(selectTeam);
			input.setVisible(true);
		}else if (e.getSource()==delete_bt) {
			getName.setVisible(true);
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
				msg.setMessage(selectTeam+"팀의 " + name+"선수를 삭제하였습니다.");
				msg.setVisible(true);
				teamList();
			}else {
				msg.setMessage(selectTeam+"팀의 " + name+"선수는 없습니다.");
				msg.setVisible(true);
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
		ta.append("이름\t\t계약\t\t연봉\t\t포지션\n");
		java.util.List<Player> list = playerMg.view(selectTeam);
		for(Player player : list) {
			ta.append(player.getName() + "\t");
			ta.append(player.getPay() + "\t");
			ta.append(player.getSalary() + "\t");
			ta.append(player.getPosition() + "\n");
		}
	}
}

