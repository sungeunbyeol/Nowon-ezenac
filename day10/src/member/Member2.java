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
		System.out.println(getName()+"님의 전화번호는 " + getTel()
					+"번이고, 주소는 " + address + " 입니다.");
	}
}
