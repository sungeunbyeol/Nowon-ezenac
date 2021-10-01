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
			System.out.print(sub + "점수를 입력 : ");
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
			System.out.print("이름을 입력 : ");
			name = in.next();
		} while(checkName(name));
		
		int kor = inputSub("국어");
		int eng = inputSub("영어");
		Student input = new Student(name, kor, eng);
		set.add(input);
	}
	
	protected void rank() {
		Iterator it1 = set.iterator(); // 모든 데이터를 꺼내올 때 사용한다.
		while(it1.hasNext()) {
			Object obj1 = it1.next();
			Student i = (Student)obj1; //내 성적이 있는 객체
			i.clearRank(); // i가 가르치는 학생의 순위는 1등이 된다.
			Iterator it2 = set.iterator();
			while(it2.hasNext()) {
				Object obj2 = it2.next();
				Student j = (Student)obj2; //우리반 학생들 성적이 있는 객체
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
			Student view = (Student)obj; //우리반 학생들 성적이 있는 객체
			view.disp();
		}
	}
	
	public void delete() {
		System.out.print("삭제할 학생의 이름 : ");
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
		System.out.print("수정할 학생의 이름 : ");
		String name = in.next();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Student edit = (Student)obj;
			if(edit.getName().equals(name)) {
				int kor = inputSub("수정할 국어");
				edit.setKor(kor);
				edit.setEng(inputSub("수정할 영어"));
				edit.setTot();
				return;
			}
		}
	}
	
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}
