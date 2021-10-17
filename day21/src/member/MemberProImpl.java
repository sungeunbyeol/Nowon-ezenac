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
		for(Member view : set) {
			view.disp();
		}
	}
	

	@Override
	public void edit() {
		System.out.print("������ ȸ���� �̸� : ");
		String name = in.next();
		for(int i=0; i<set.size(); ++i) {
			Object obj = set.get(i);
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
