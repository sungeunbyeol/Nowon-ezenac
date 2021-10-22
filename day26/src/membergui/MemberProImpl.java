package membergui;
import java.util.*;

public class MemberProImpl implements MemberPro{
	private ArrayList<Member> list;
	private Scanner in;
	
	public MemberProImpl() {
		list = new ArrayList<>();
		in = new Scanner(System.in);
	}
	
	@Override
	public void input(Member input) {
		list.add(input);
	}

	@Override
	public List<Member> view() {
		Collections.sort(list);
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
		System.exit(0);		
	}

}
