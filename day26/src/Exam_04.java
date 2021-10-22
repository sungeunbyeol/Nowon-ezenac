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
			ps.setString(2, "강호동");
			int res = ps.executeUpdate();
			if(res>0) {
				System.out.println("강호동님의 전화번호 수정");
			} else {
				System.out.println("수정 실패");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
