package student;

import java.util.*;

public class StudentProImpl implements StudentPro{
	private ArrayList<Student> list;
	private Scanner in;
	
	public StudentProImpl() {
		list = new ArrayList<>();
		in = new Scanner(System.in);
	}
	
	@Override
	public void input(Student st) {
		list.add(st);
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
	}
	
	public Student checkName(String name) {
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student check = it.next();
			if (check.getName().equals(name)) {
				return check;
			}
		}
		return null;
	}
	
	public ArrayList<Student> view(String name) {
		rank();
		switch(name) {
		case "이름" : return viewName();
		case "국어" : return viewKor();
		case "영어" : return viewEng();
		case "총점" : return viewTot();
		}
		return null;
	}

	public ArrayList<Student> viewName() {
		Collections.sort(list);
		return list;
	}
	
	public ArrayList<Student> viewKor(){
		Comparator<Student> totKor = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getKor() < o2.getKor()) {
					return 1;
				}else if (o1.getKor() > o2.getKor()) {
					return -1;
				}
				return 0;
			}
		};
		Collections.sort(list, totKor);
		return list;
	}
	public ArrayList<Student> viewEng(){
		Comparator<Student> totEng = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getEng() < o2.getEng()) {
					return 1;
				}else if (o1.getEng() > o2.getEng()) {
					return -1;
				}
				return 0;
			}
		};
		Collections.sort(list, totEng);
		return list;
	}
	public ArrayList<Student> viewTot(){	
		Comparator<Student> totSort = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getTot() < o2.getTot()) {
					return 1;
				}else if (o1.getTot() > o2.getTot()) {
					return -1;
				}
				return 0;
			}
		};
		Collections.sort(list, totSort);
		return list;
	}

	@Override
	public void delete(Student st) {
		list.remove(st);
	}
	public void edit(Student st) {
		Student edit = checkName(st.getName());
		edit = st;
	}
	public void exit() {
		System.exit(0);
	}
}
