package member;
import java.util.*;

import javax.swing.JOptionPane;

public class MemberProImpl implements MemberPro{
	private List<Member> list;
	
	public MemberProImpl() {
		list = new ArrayList<Member>();
	}
	
	@Override
	public boolean input(Member input) {
		for(Member data : list) {
			if (data.getName().equals(input.getName())){
				return false;
			}
		}
		list.add(input);
		return true;
	}

	@Override
	public List<Member> view() {
		return list;
	}
	
	@Override
	public boolean delete(String name) {
		for(Member delete : list) {
			if (delete.getName().equals(name)) {
				list.remove(delete);
				return true;
			}
		}
		return false;
	}

	@Override
	public void exit() {
		JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
		System.exit(0);		
	}

}
