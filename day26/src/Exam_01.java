import java.sql.*;

public class Exam_01 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �˻� ����");
		}catch(ClassNotFoundException e) {
			System.out.println("����̹� �˻� ����");
		}

		Connection con = null;
		try {
			con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","javaapi","javaapi");
			System.out.println("����Ŭ ���� ����!");
		}catch(SQLException e) {
			System.out.println("����Ŭ ���� ����");
			e.printStackTrace();
		}
		
		
	}

}
