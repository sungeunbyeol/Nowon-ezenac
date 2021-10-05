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
		System.out.print("ȸ���� �̸� : ");
		String name = in.next();
		System.out.print("ȸ���� ��ȭ��ȣ : ");
		String tel = in.next();
		System.out.print("ȸ���� �ּ� : ");
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
		System.out.print("������ ȸ���� �̸� : ");
		String name = in.next();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member edit = (Member)obj;
			if (edit.getName().equals(name)) {
				System.out.print("���ο� ��ȭ��ȣ�� �Է� : ");
				String tel = in.next();
				edit.setTel(tel);
				System.out.print("���ο� �ּҸ� �Է� : ");
				edit.setAddress(in.next());
				return;
			}
		}
		System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
		
	}

	@Override
	public void delete() {
		System.out.print("������ ȸ���� �̸� : ");
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
		System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);		
	}

}
