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
			System.out.print("ȸ���� �̸� : ");
			String name = in.next();
			System.out.print("ȸ���� ��ȭ��ȣ : ");
			String tel = in.next();
			System.out.print("ȸ���� �ּ� : ");
			String addr = in.next();
			ps.setString(1, name);
			ps.setString(2, tel);
			ps.setString(3, addr);
			int res = ps.executeUpdate();
			if (res>0) {
				System.out.println(name+"���� �߰��Ͽ����ϴ�.!!");
			}else {
				System.out.println(name+"�� �߰� ����!!");
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
			System.out.print("������ ȸ���� �̸� : ");
			String name = in.next();
			ps.setString(1, name);
			rs = ps.executeQuery();
			if (rs.next()) {
				sql = "update testMember set tel=?, addr=? where name=?";
				ps = con.prepareStatement(sql);
				System.out.print("���ο� ��ȭ��ȣ�� �Է� : ");
				String tel = in.next();
				System.out.print("���ο� �ּҸ� �Է� : ");
				String addr = in.next();
				ps.setString(1, tel);
				ps.setString(2, addr);
				ps.setString(3, name);
				int res = ps.executeUpdate();
				if (res>0) {
					System.out.println(name+"���� ������ �����Ͽ����ϴ�.");
				}else {
					System.out.println(name+"�� ���� ���� ����!!");
				}
			}else {
				System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
			}
			/*
			String sql = "update testMember set tel=?, addr=? where name=?";
			ps = con.prepareStatement(sql);
			System.out.print("������ ȸ���� �̸� : ");
			String name = in.next();
			System.out.print("���ο� ��ȭ��ȣ�� �Է� : ");
			String tel = in.next();
			System.out.print("���ο� �ּҸ� �Է� : ");
			String addr = in.next();
			ps.setString(1, tel);
			ps.setString(2, addr);
			ps.setString(3, name);
			int res = ps.executeUpdate();
			if (res>0) {
				System.out.println(name+"���� ������ �����Ͽ����ϴ�.");
			}else {
				System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
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
			System.out.print("������ ȸ���� �̸� : ");
			String name = in.next();
			ps.setString(1, name);
			int res = ps.executeUpdate();
			if (res>0) {
				System.out.println(name+"���� �����Ͽ����ϴ�.");
			}else {
				System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);		
	}

}
