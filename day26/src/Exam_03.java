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
		//insert, delete, update 쿼리문의 실행 결과는 항상 정수값으로 나온다.
		//executeUpdate()메소드를 실행시키고 int값을 결과로 받는다.
		//selete 쿼리문을 사용할때는 executeQuery()메소드를 실행시키고 ResultSet의 값으로 받는다.
		try {
			String sql = "select * from testMember";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) { //너가 가르키는 곳에 데이터가 있니? 그러면 꺼내
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
