package baseball;

import java.util.*;

public class PlayerMgImpl implements PlayerMg{
	Scanner in;
	Hashtable set;
	
	public PlayerMgImpl() {
		in = new Scanner(System.in);
		set = new Hashtable();
		
		//�߱����� ���� �ִ��� �˾ƾ� ������ �� �����ϱ�
		//�̸� ������ �־���� ��
		String[] team = new String[] {
				"kt","LG","�Ｚ","�λ�","�ؼ�","NC","SSG","�Ե�","KIA","��ȭ"};
		for(int i=0; i<team.length; ++i) {
			Hashtable ht = new Hashtable();
			set.put(team[i], ht);
		}
	}
	
	//input�̶� view, trade���� ��� ������ �������
	//���ϰ� �����ϱ� ���ؼ� ���Ӱ� �޼��带 ����.
	public String inputTeam() {
		while(true) {
			System.out.print("���� �Է� : ");
			String team = in.next();
			if(set.containsKey(team)) {
				return team;
			}
			System.out.println("���� �����Դϴ�. �ٽ� �Է� ���");
		}
	}
	
	@Override
	public void input() { //�Է� �޴� input�޼��� ����
		String team = inputTeam(); //team�� inputTeam �޼��带 ����ϰڴ� 
		System.out.print("�̸� : "); //�̸��� ���
		String name = in.next();//�̸��� ���� Ű����� �Է�
		System.out.print("���� : ");
		int pay = in.nextInt();
		System.out.print("���� : ");
		int salary = in.nextInt();
		System.out.print("������ : ");
		String position = in.next();
		//input�� player Ŭ������ ��ü ������ �ϴµ�
		//player �����ڸ� ���� �����ϰڴٴ� �ǹ�
		Player input = new Player(name,team,pay,salary,position);
		//ht�� Hashtable�� �ڷ������� ����
		//set�ȿ� �ִ� get�� Hashtable�� ����ȯ �����ְ� (key��)�� �־���
		Hashtable ht = (Hashtable)set.get(team);
		//Hashtable�� ���� ������ �ִ� ht�� (key��,value��)�� �־��ش�. 
		ht.put(name, input);
	}

	@Override
	public void view() {
		String team = inputTeam();
		Hashtable ht = (Hashtable)set.get(team);
		Enumeration enu = ht.keys(); //Enumeration�� ���, ���Ÿ� ����
		System.out.println("���� : " + team);
		System.out.println("------------------");
		//hasMoreElements()��
		//�о�� ��Ұ� �����ִ��� Ȯ���ϰ� ������ true, ������ false. 
		//Iterator�� hasNext()�� ����
		//����Ű�� ��ġ�� ������ �־�? �ϰ� ���°�
		while(enu.hasMoreElements()) {
			//nextElement() : ���� ��Ҹ� �о� ��. Iterator�� next()�� ����
			//Object�� ���� ������ enu�� � �ڷ������� �𸣱� ������
			Object obj = enu.nextElement();
			String key = (String)obj;
			Player view = (Player)ht.get(key);
			System.out.println(view.getName());
		}
	}

	@Override
	public void trade() {
		String team = inputTeam();
		Hashtable ht = (Hashtable)set.get(team); //������
		String name;
		do {
			System.out.print("���� �̸� : ");
			name = in.next();
		} while(!ht.containsKey(name));
			//containsKey(key) : 
		    //map���� ���ڷ� ���� key���� ������ true, ������ false
		Player trade = (Player)ht.get(name);
		String team2 = inputTeam();
		trade.setTeam(team2);
		ht.remove(name);
		ht = (Hashtable)set.get(team2); //�̵�����
		ht.put(name, trade);
		System.out.println(team2 + "������ trade �Ǿ����ϴ�.");
		
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);		
	}
	
}
