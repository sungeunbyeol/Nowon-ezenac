package member;

public class Member implements Comparable<Member>{
	private String name;
	private String tel;
	private String address;
	
	public Member(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public String getAddress() {
		return address;
	}
	public void disp() {
		System.out.println(getName() + "���� ��ȭ��ȣ�� " + getTel() 
		+"���̰�, �ּҴ� " + address +" �Դϴ�.");
	}

	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.getName());
	}
}
