import java.util.*;


public class StudentImpl implements StudentInter{
	private HashSet set;
	private Scanner in;
	
	public StudentImpl() {
		set = new HashSet();
		in = new Scanner(System.in);
	}
	
	protected int inputSub(String sub) {
		int su;
		do {
			System.out.print(sub + "������ �Է� : ");
			su = in.nextInt();
		} while(su<0 || su>100);
			return su;
	}
	
	protected boolean checkName(String name) {
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = in.next();
			Student check = (Student)obj;
			if(check.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	
	public void input() {
		String name;
		do {
			System.out.print("�̸��� �Է� : ");
			name = in.next();
		} while(checkName(name));
		
		int kor = inputSub("����");
		int eng = inputSub("����");
		Student input = new Student(name, kor, eng);
		set.add(input);
	}
	
	protected void rank() {
		Iterator it1 = set.iterator(); // ��� �����͸� ������ �� ����Ѵ�.
		while(it1.hasNext()) {
			Object obj1 = it1.next();
			Student i = (Student)obj1; //�� ������ �ִ� ��ü
			i.clearRank(); // i�� ����ġ�� �л��� ������ 1���� �ȴ�.
			Iterator it2 = set.iterator();
			while(it2.hasNext()) {
				Object obj2 = it2.next();
				Student j = (Student)obj2; //�츮�� �л��� ������ �ִ� ��ü
				if(i.getTot() < j.getTot()) {
					i.plusRank();
				}
			}
		}
	}
	
	public void view() {
		rank();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Student view = (Student)obj; //�츮�� �л��� ������ �ִ� ��ü
			view.disp();
		}
	}
	
	public void delete() {
		System.out.print("������ �л��� �̸� : ");
		String name = in.next();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Student delete = (Student)obj;
			if(delete.getName().equals(name)) {
				set.remove(delete);
				return;
			}
		}
	}
	
	public void edit() {
		System.out.print("������ �л��� �̸� : ");
		String name = in.next();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Student edit = (Student)obj;
			if(edit.getName().equals(name)) {
				int kor = inputSub("������ ����");
				edit.setKor(kor);
				edit.setEng(inputSub("������ ����"));
				edit.setTot();
				return;
			}
		}
	}
	
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
}
