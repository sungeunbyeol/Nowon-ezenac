package student;

import java.util.*;

public interface StudentPro {
	public void input(Student st);
	public ArrayList<Student> view(String name);
	public void delete(Student st);
	public void exit();
	public Student checkName(String name);
	public void edit(Student st);
}
