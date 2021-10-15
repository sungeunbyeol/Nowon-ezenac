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
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			for(Member view : set) {
				pw.print(view.getName());
				pw.print(view.getTel());
				pw.println(view.getAddress());
			}
			pw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void load() {
		set.clear();
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
				String name = br.readLine();
				String tel = br.readLine();
				String address = br.readLine();
				Member mem = new Member(name, tel, address);
				set.add(mem);
			}
		}catch(FileNotFoundException e) {
			try {
				file.createNewFile();
			}catch(IOException ee) {}
		}catch(EOFException e) {
			System.out.println("���� ���ε� ��!!!");
		}catch(IOException e) {}
		
	}

}
