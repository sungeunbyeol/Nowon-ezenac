package membergui;

import java.util.*;

public interface MemberPro {
	public void input(Member input);
	public List<Member> view();
	public boolean delete(String name);
	public void exit();
}
