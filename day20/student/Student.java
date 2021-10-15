package student;

public class Student implements Comparable<Student>{
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private int rank;
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		tot = kor + eng;
		rank = 1;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setTot() {
		tot = kor + eng;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getTot() {
		return tot;
	}
	public int getRank() {
		return rank;
	}
	public void clearRank() {
		rank = 1;
	}
	public void plusRank() {
		++rank;
	}
	public void disp() {
		System.out.println(name+"학생의 총점은 " + tot 
							+"점이고, 순위는 " + rank +"등 입니다.");
	}
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.getName());
	}
}












