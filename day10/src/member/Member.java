package member;

public class Member {
	//��� �ʵ�
	private String name;
	private String tel;
	//������
	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	//��� �޼ҵ�
	//getter, setter�� ������ִ� ������ private���� ����� ����ʵ忡
	//main���� ���������� ������ �� ���⶧����
	//getter, setter�� ����� �ִ� ��.
	//�׷��� ������ �ʿ䰡 ���� name�� getter�� ������ָ� �ǰ�,
	//��ȭ��ȣ�� �ٲ� �� �ֱ� ������ setter���� ������ִ� ��
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public void disp() {
		System.out.println(name+"���� ��ȭ��ȣ�� "+tel+"�� �Դϴ�.");
	}
	
}
