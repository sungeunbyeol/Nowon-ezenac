import java.sql.*;

public class Exam_01 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 검색 성공");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패");
		}

		Connection con = null;
		try {
			con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","javaapi","javaapi");
			System.out.println("오라클 연결 성공!");
		}catch(SQLException e) {
			System.out.println("오라클 연결 실패");
			e.printStackTrace();
		}
		
		
	}

}
