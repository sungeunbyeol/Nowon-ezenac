
class Member{
	
	//����ʵ�
	private String name;
	private String tel;
	
	//������
	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
	//��� �޼ҵ�
	public void disp() {
		System.out.println(name + "���� ��ȭ��ȣ�� " + tel + "�� �Դϴ�.");
	}
	
}

class Member2 extends Member{
	private String address;
	
	public Member2(String name, String tel, String address) {
		super(name, tel);
		this.address = address;
	}
	public void disp() {
		System.out.println(getName() +"���� ��ȭ��ȣ�� " + getTel() + "�̰� �ּҴ� "
							+ address + "�Դϴ�.");
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void getAddress() {
		return address;
	}
}

public class Exam_08 {
	public static void main(String[]args) {
		Member mb = new Member() {
			mb.name = "���μ�";
		};
		
		mb.disp();
		
	}
}
