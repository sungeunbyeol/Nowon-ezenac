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
	
	//������ team�� setter �޼ҵ带 ������ְ�
	//�������� ������ �ʿ䰡 ������ getter �޼ҵ常 ������ش�.
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
