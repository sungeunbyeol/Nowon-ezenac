package member;

import java.io.Serializable;

public class Member implements Serializable{
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
		System.out.println(getName() + "님의 전화번호는 " + getTel() 
		+"번이고, 주소는 " + address +" 입니다.");
	}
}
