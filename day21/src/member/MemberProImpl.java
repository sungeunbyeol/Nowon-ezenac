package member;
import java.io.*;
import java.util.*;

public class MemberProImpl implements MemberPro{
	private ArrayList<Member> set;
	private Scanner in;
	File dir = new File("C:\\javaAPI\\study\\day21\\src\\member");
	File file = new File(dir, "data.txt");
	
	public MemberProImpl() {
		set = new ArrayList<Member>();
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
		for(Member view : set) {
			view.disp();
		}
	}
	

	@Override
	public void edit() {
		System.out.print("수정할 회원의 이름 : ");
		String name = in.next();
		for(int i=0; i<set.size(); ++i) {
			Object obj = set.get(i);
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

	@Override
	public void save() {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			oos.writeObject(set);
			oos.close();
		}catch(Exception e) {}
	}

	@Override
	public void load() {
		set.clear();
		try {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
				set = (ArrayList)ois.readObject();
			}
		}catch(Exception e) {}
		
	}

}
