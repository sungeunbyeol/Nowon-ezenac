
class Member{
	
	//멤버필드
	private String name;
	private String tel;
	
	//생성자
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
	
	//멤버 메소드
	public void disp() {
		System.out.println(name + "님의 전화번호는 " + tel + "번 입니다.");
	}
	
}

class Member2 extends Member{
	private String address;
	
	public Member2(String name, String tel, String address) {
		super(name, tel);
		this.address = address;
	}
	public void disp() {
		System.out.println(getName() +"님의 전화번호는 " + getTel() + "이고 주소는 "
							+ address + "입니다.");
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
			mb.name = "조인성";
		};
		
		mb.disp();
		
	}
}
