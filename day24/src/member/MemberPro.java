package member;

import java.util.List;

public interface MemberPro {
	public boolean input(Member input);
	public List<Member> view();
	public boolean delete(String name);
	public void exit();
}
