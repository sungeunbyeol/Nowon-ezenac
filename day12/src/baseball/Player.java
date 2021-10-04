package baseball;

public class Player {
	private String name;
	private String team;
	private int pay;
	private int salary;
	private String position;
	public Player(String name, String team, int pay, int salary, String position) {
		this.name = name;
		this.team = team;
		this.pay = pay;
		this.salary = salary;
		this.position = position;
	}
	
	//수정할 team만 setter 메소드를 만들어주고
	//나머지는 수정할 필요가 없으니 getter 메소드만 만들어준다.
	public void setTeam(String team) {
		this.team = team;
	}
	public String getName() {
		return name;
	}
	public String getTeam() {
		return team;
	}
	public int getPay() {
		return pay;
	}
	public int getSalary() {
		return salary;
	}
	public String getPosition() {
		return position;
	}
}
