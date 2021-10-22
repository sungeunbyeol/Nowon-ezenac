import java.sql.*;

public class Exam_02 {

	public static void main(String[] args) {
		
		try { //드라이버 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null; //오라클 연결
		try {
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "javaapi", "javaapi");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		PreparedStatement ps = null; //데이터 삽입
		
			// 1번 con.setAutoCommit(false); 오토커밋 안하겠따. 그럼?
			String sql = "insert into testMember values(test_seq.nextval, ?, ?, ?)";//동적커리라서 뒤에 물음표 작성
			ps = con.prepareStatement(sql);
			ps.setString(1, "강호동"); //물음표 개수에 맞게 3개 적어줘야됨.
			ps.setString(2, "123-1234"); //물음표에 어떤 자료형이 들어갈지 알아야됨
			ps.setString(3, "서울 강남구"); //만약 int형이면 setInt 적어줘야됨
			int res = ps.executeUpdate(); //다됐지? 그럼 실행해줘 하는 executeUpdate()
			if(res > 0) {
				System.out.println("강호동님을 입력하였습니다.");
				//2번 con.commit(); 성공했을때만 커밋하겠다
			}else {
				System.out.println("강호동님 입력 실패");
			}
		}catch(SQLException e) {
			System.out.println("강호동 입력시 DB오류 발생!");
		}
	}

}
