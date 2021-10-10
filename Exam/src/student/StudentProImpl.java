package student;

import java.util.*;

public class StudentProImpl implements StudentPro{
	private ArrayList<Student> list;
	private Scanner in;
	
	public StudentProImpl() {
		list = new ArrayList<>();
		in = new Scanner(System.in);
	}
	
	protected int inputSub(String sub) {
		int su;
		do {
			System.out.print(sub+"점수를 입력 ");
			su = in.nextInt();
		}while(su<0 || su>100);
		return su;
	}
	
	protected boolean checkName(String name) {
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student check = it.next();
			if (check.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void input() {
		String name;
		do {
			System.out.print("이름을 입력 : ");
			name = in.next();
		}while(checkName(name));
		int kor = inputSub("국어");
		int eng = inputSub("영어");
		Student input = new Student(name, kor, eng);
		list.add(input);
	}
	protected void rank() {
		for(Student rank1 : list) {
			rank1.clearRank();
			for(Student rank2 : list) {
				if (rank1.getTot() < rank2.getTot()) {
					rank1.plusRank();
				}
			}
		}
		/*
		Student[] rank = new Student[list.size()];
		list.toArray(rank);	
		for(int i=0; i<rank.length; ++i) {
			rank[i].clearRank();
			for(int j=0; j<rank.length; ++j) {
				if (rank[i].getTot() < rank[j].getTot()) {
					rank[i].plusRank();
				}
			}
		}
		*/
	}
	@Override
	public void view() {
		rank();
		Comparator<Student> totSort = new Comparator<Student>() {
	         @Override
	         public int compare(Student o1, Student o2) {
	            if (o1.getTot() < o2.getTot()) {
	            	//내림차순이므로 o2.getTot()값을 앞으로 보냄
	               return 1;
	            }else if (o1.getTot() > o2.getTot()) {
	            	//내림차순이므로 그대로 있음
	               return -1;
	            }
	            return 0;
	         }
	      };
	      
	    Collections.sort(list, totSort);
		Collections.sort(list);
		for(Student view : list) {
			view.disp();
		}
	}

	@Override
	public void delete() {
		System.out.print("삭제할 학생의 이름 : ");
		String name = in.next();
		for(Student delete : list) {
			if (delete.getName().equals(name)) {
				list.remove(delete);
				return;
			}
		}
		System.out.println(name+"님은 저희 학생이 아닙니다.");
	}

	@Override
	public void edit() {
		System.out.print("수정할 학생의 이름 : ");
		String name = in.next();
		for(Student edit : list) {
			if (edit.getName().equals(name)) {
				int kor = inputSub("수정할 국어");
				edit.setKor(kor);
				edit.setEng(inputSub("수정할 영어"));
				edit.setTot();
				return;
			}
		}
		System.out.println(name+"님은 저희 학생이 아닙니다.");
		
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		
	}

}
