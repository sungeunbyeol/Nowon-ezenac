import java.sql.*;

public class Exam_03 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		try {
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "javaapi","javaapi");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		//insert, delete, update �������� ���� ����� �׻� ���������� ���´�.
		//executeUpdate()�޼ҵ带 �����Ű�� int���� ����� �޴´�.
		//selete �������� ����Ҷ��� executeQuery()�޼ҵ带 �����Ű�� ResultSet�� ������ �޴´�.
		try {
			String sql = "select * from testMember";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) { //�ʰ� ����Ű�� ���� �����Ͱ� �ִ�? �׷��� ����
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

}
