package member;
import java.util.*;

public class MemberProImpl implements MemberPro{
	private HashSet set;
	private Scanner in;
	
	public MemberProImpl() {
		set = new HashSet();
		in = new Scanner(System.in);
	}
	
	@Override
	public void input() {
		System.out.print("회원의 이름 : ");
		String name = in.next();
		System.out.print("회원의 전화번호 : ");
		String tel = in.next();
		System.out.print("회원의 주소 : ");
		String address = in.next();
		Member input = new Member(name, tel, address);
		set.add(input);
	}

	@Override
	public void view() {
		Collection.sort(set);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member view = (Member)obj;
			view.disp();
		}
	}

	@Override
	public void edit() {
		System.out.print("수정할 회원의 이름 : ");
		String name = in.next();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member edit = (Member)obj;
			if (edit.getName().equals(name)) {
				System.out.print("새로운 전화번호를 입력 : ");
				String tel = in.next();
				edit.setTel(tel);
				System.out.print("새로운 주소를 입력 : ");
				edit.setAddress(in.next());
				return;
			}
		}
		System.out.println(name+"님은 저희 회원이 아닙니다.");
		
	}

	@Override
	public void delete() {
		System.out.print("삭제할 회원의 이름 : ");
		String name = in.next();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member delete = (Member)obj;
			if (delete.getName().equals(name)) {
				set.remove(delete);
				return;
			}
		}
		System.out.println(name+"님은 저희 회원이 아닙니다.");
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);		
	}

}
