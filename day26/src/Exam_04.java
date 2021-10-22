import java.sql.*;


public class Exam_04 {

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
		try {
			String sql = "Update testMember set tel=? where name=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "111-1111");
			ps.setString(2, "��ȣ��");
			int res = ps.executeUpdate();
			if(res>0) {
				System.out.println("��ȣ������ ��ȭ��ȣ ����");
			} else {
				System.out.println("���� ����");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
