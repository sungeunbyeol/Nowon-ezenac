package member;

import java.util.*;

public class MemberPro {
	HashSet Member2; //회원이 한명 이상이기 때문에 배열 사용
	//private int increment; 
	private int co;
	private Scanner in;
	
	public MemberPro() {
		HashSet set = new HashSet(); //일단 mb 배열을 5개로 선언해줌.
		//배열은 5자리인데 공간이 부족하면 increment에서 지정해준 수만큼
		//추가해줄 수 있게 하려고 만든 변수
		//increment = 3; 
		co = 0;
		in = new Scanner(System.in);
	}
	
	public void input() {
		System.out.print("회원의 이름 : ");
		String name = in.next();
		System.out.print("회원의 전화번호 : ");
		String tel = in.next();
		System.out.print("회원의 주소 : ");
		String address = in.next();
		Member2 input = new Member2(name,tel,address);
		set.add(input);
		/*
		++co;
		if(co==mb.length) {
			Member2[] mb2= new Member2[mb.length+increment];
			for(int i=0; i<mb.length; ++i) {
				mb2[i] = mb[i];
			}
			mb = mb2;
		}
		*/
	}
	public void view() {
		for(int i=0; i<co; ++i) {
			mb[i].disp();
		}
	}
	public void edit() {
		System.out.print("수정할 회원의 이름 : ");
		String name = in.next();
		for(int i=0; i<co; ++i) {
			if(name.equals(mb[i].getName())) {
				System.out.print("새로운 전화번호를 입력 : ");
				String tel = in.next();
				mb[i].setTel(tel);
				System.out.print("새로운 주소를 입력 : ");
				mb[i].setAddress(in.next());
				return;
			}
		}
		System.out.println(name + "님은 저희 회원이아닙니다.");
	}
	public void delete(){
		System.out.print("삭제할 회원의 이름 : ");
		String name = in.next();
		for(int i=0; i<co; ++i) {
			if(name.equals(mb[i].getName())) {
				for(int j=i; j<co-1; ++j) {
					mb[j] = mb[j+1];
				}
				--co;
				return;
			}
		}
		System.out.println(name+"님은 저희 회원이 아닙니다.");
	}
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}
