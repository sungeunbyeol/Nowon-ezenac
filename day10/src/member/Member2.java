package member;

public class Member2 extends Member{
	private String address;
	
	public Member2(String name, String tel, String address) {
		super(name, tel);
		this.address = address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void disp() {
		System.out.println(getName()+"���� ��ȭ��ȣ�� " + getTel()
					+"���̰�, �ּҴ� " + address + " �Դϴ�.");
	}
}
