import java.sql.*;

public class Exam_02 {

	public static void main(String[] args) {
		
		try { //����̹� ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null; //����Ŭ ����
		try {
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "javaapi", "javaapi");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		PreparedStatement ps = null; //������ ����
		
			// 1�� con.setAutoCommit(false); ����Ŀ�� ���ϰڵ�. �׷�?
			String sql = "insert into testMember values(test_seq.nextval, ?, ?, ?)";//����Ŀ���� �ڿ� ����ǥ �ۼ�
			ps = con.prepareStatement(sql);
			ps.setString(1, "��ȣ��"); //����ǥ ������ �°� 3�� ������ߵ�.
			ps.setString(2, "123-1234"); //����ǥ�� � �ڷ����� ���� �˾ƾߵ�
			ps.setString(3, "���� ������"); //���� int���̸� setInt ������ߵ�
			int res = ps.executeUpdate(); //�ٵ���? �׷� �������� �ϴ� executeUpdate()
			if(res > 0) {
				System.out.println("��ȣ������ �Է��Ͽ����ϴ�.");
				//2�� con.commit(); ������������ Ŀ���ϰڴ�
			}else {
				System.out.println("��ȣ���� �Է� ����");
			}
		}catch(SQLException e) {
			System.out.println("��ȣ�� �Է½� DB���� �߻�!");
		}
	}

}
