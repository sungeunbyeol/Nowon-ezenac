package member;

import java.io.Serializable;

public class Member implements Serializable{
	private String select;
	private String name;
	private String tel;
	
	public Member(String select) {
		this.select = select;
	}
	
	public Member(String name, String select) {
		this.name = name;
		this.select = select;
	}
	
	public Member(String name, String tel, String select) {
		this.name = name;
		this.tel = tel;
		this.select = select;
	}
	
	public String getSelect() {
		return select;
	}
	
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
