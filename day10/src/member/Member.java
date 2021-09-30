package member;

public class Member {
	//멤버 필드
	private String name;
	private String tel;
	//생성자
	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	//멤버 메소드
	//getter, setter를 만들어주는 이유는 private으로 선언된 멤버필드에
	//main에서 직접적으로 접근할 수 없기때문에
	//getter, setter를 만들어 주는 것.
	//그런데 수정할 필요가 없는 name은 getter만 만들어주면 되고,
	//전화번호는 바뀔 수 있기 때문에 setter까지 만들어주는 것
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
		System.out.println(name+"님의 전화번호는 "+tel+"번 입니다.");
	}
	
}
