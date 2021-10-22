package member;
import java.util.*;
import java.sql.*;

public class MemberProImpl implements MemberPro{
	private Scanner in;
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public MemberProImpl() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		in = new Scanner(System.in);
	}
	
	@Override
	public void input() {
		try {
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "javaapi", "javaapi");
			String sql = "insert into testMember values(test_seq.nextval, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			System.out.print("회원의 이름 : ");
			String name = in.next();
			System.out.print("회원의 전화번호 : ");
			String tel = in.next();
			System.out.print("회원의 주소 : ");
			String addr = in.next();
			ps.setString(1, name);
			ps.setString(2, tel);
			ps.setString(3, addr);
			int res = ps.executeUpdate();
			if (res>0) {
				System.out.println(name+"님을 추가하였습니다.!!");
			}else {
				System.out.println(name+"님 추가 실패!!");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void view() {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "javaapi", "javaapi");
			String sql = "select * from testMember";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString(2);
				String tel = rs.getString("tel");
				String addr = rs.getString("addr");
				System.out.println(no+"\t"+name+"\t"+tel+"\t"+addr);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public void edit() {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "javaapi", "javaapi");
			String sql = "select * from testMember where name = ?";
			ps = con.prepareStatement(sql);
			System.out.print("수정할 회원의 이름 : ");
			String name = in.next();
			ps.setString(1, name);
			rs = ps.executeQuery();
			if (rs.next()) {
				sql = "update testMember set tel=?, addr=? where name=?";
				ps = con.prepareStatement(sql);
				System.out.print("새로운 전화번호를 입력 : ");
				String tel = in.next();
				System.out.print("새로운 주소를 입력 : ");
				String addr = in.next();
				ps.setString(1, tel);
				ps.setString(2, addr);
				ps.setString(3, name);
				int res = ps.executeUpdate();
				if (res>0) {
					System.out.println(name+"님의 정보를 수정하였습니다.");
				}else {
					System.out.println(name+"님 정보 수정 실패!!");
				}
			}else {
				System.out.println(name+"님은 저희 회원이 아닙니다.");
			}
			/*
			String sql = "update testMember set tel=?, addr=? where name=?";
			ps = con.prepareStatement(sql);
			System.out.print("수정할 회원의 이름 : ");
			String name = in.next();
			System.out.print("새로운 전화번호를 입력 : ");
			String tel = in.next();
			System.out.print("새로운 주소를 입력 : ");
			String addr = in.next();
			ps.setString(1, tel);
			ps.setString(2, addr);
			ps.setString(3, name);
			int res = ps.executeUpdate();
			if (res>0) {
				System.out.println(name+"님의 정보를 수정하였습니다.");
			}else {
				System.out.println(name+"님은 저희 회원이 아닙니다.");
			}
			*/
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void delete() {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "javaapi", "javaapi");
			String sql = "delete from testMember where name = ?";
			ps = con.prepareStatement(sql);
			System.out.print("삭제할 회원의 이름 : ");
			String name = in.next();
			ps.setString(1, name);
			int res = ps.executeUpdate();
			if (res>0) {
				System.out.println(name+"님을 삭제하였습니다.");
			}else {
				System.out.println(name+"님은 저희 회원이 아닙니다.");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);		
	}

}
