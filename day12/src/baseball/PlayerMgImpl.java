package baseball;

import java.util.*;

public class PlayerMgImpl implements PlayerMg{
	Scanner in;
	Hashtable set;
	
	public PlayerMgImpl() {
		in = new Scanner(System.in);
		set = new Hashtable();
		
		//야구팀이 뭐가 있는지 알아야 선택할 수 있으니까
		//미리 구단을 넣어놓은 것
		String[] team = new String[] {
				"kt","LG","삼성","두산","넥센","NC","SSG","롯데","KIA","한화"};
		for(int i=0; i<team.length; ++i) {
			Hashtable ht = new Hashtable();
			set.put(team[i], ht);
		}
	}
	
	//input이랑 view, trade에서 계속 팀명을 물어봐서
	//편하게 관리하기 위해서 새롭게 메서드를 만듦.
	public String inputTeam() {
		while(true) {
			System.out.print("팀을 입력 : ");
			String team = in.next();
			if(set.containsKey(team)) {
				return team;
			}
			System.out.println("없는 팀명입니다. 다시 입력 긔긔");
		}
	}
	
	@Override
	public void input() { //입력 받는 input메서드 생성
		String team = inputTeam(); //team이 inputTeam 메서드를 사용하겠다 
		System.out.print("이름 : "); //이름을 출력
		String name = in.next();//이름을 직접 키보드로 입력
		System.out.print("계약금 : ");
		int pay = in.nextInt();
		System.out.print("연봉 : ");
		int salary = in.nextInt();
		System.out.print("포지션 : ");
		String position = in.next();
		//input을 player 클래스로 객체 생성을 하는데
		//player 생성자를 통해 생성하겠다는 의미
		Player input = new Player(name,team,pay,salary,position);
		//ht를 Hashtable의 자료형으로 선언
		//set안에 있는 get은 Hashtable로 형변환 시켜주고 (key값)을 넣어줌
		Hashtable ht = (Hashtable)set.get(team);
		//Hashtable의 형을 가지고 있는 ht에 (key값,value값)을 넣어준다. 
		ht.put(name, input);
	}

	@Override
	public void view() {
		String team = inputTeam();
		Hashtable ht = (Hashtable)set.get(team);
		Enumeration enu = ht.keys(); //Enumeration은 목록, 열거를 뜻함
		System.out.println("팀명 : " + team);
		System.out.println("------------------");
		//hasMoreElements()는
		//읽어올 요소가 남아있는지 확인하고 있으면 true, 없으면 false. 
		//Iterator의 hasNext()와 같음
		//가리키는 위치에 데이터 있어? 하고 묻는거
		while(enu.hasMoreElements()) {
			//nextElement() : 다음 요소를 읽어 옴. Iterator의 next()와 같음
			//Object를 쓰는 이유는 enu이 어떤 자료형인지 모르기 때문에
			Object obj = enu.nextElement();
			String key = (String)obj;
			Player view = (Player)ht.get(key);
			System.out.println(view.getName());
		}
	}

	@Override
	public void trade() {
		String team = inputTeam();
		Hashtable ht = (Hashtable)set.get(team); //기존팀
		String name;
		do {
			System.out.print("선수 이름 : ");
			name = in.next();
		} while(!ht.containsKey(name));
			//containsKey(key) : 
		    //map에서 인자로 보낸 key값이 있으면 true, 없으면 false
		Player trade = (Player)ht.get(name);
		String team2 = inputTeam();
		trade.setTeam(team2);
		ht.remove(name);
		ht = (Hashtable)set.get(team2); //이동할팀
		ht.put(name, trade);
		System.out.println(team2 + "팀으로 trade 되었습니다.");
		
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);		
	}
	
}
