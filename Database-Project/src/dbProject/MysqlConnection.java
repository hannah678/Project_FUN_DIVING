package dbProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MysqlConnection {

	// 멤버변수, 객체 생성
	//1.  드라이브 로딩
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (Exception e) {
			System.out.println("드라이브로딩 예외 발생");
		}
	}
	//멤버 영역에 변수를 선언한다.
	protected Connection conn = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	
	//2. 데이터베이스 연결 메서드
	public void getConn() {
		String url = "jdbc:mysql://localhost/kim";
		String id = "root";
		String password = "root";
		try {
			conn = DriverManager.getConnection(url,id,password);
			
		} catch (Exception e) {
			System.out.println("데이터 베이스 연결 예외 발생!!!");
		}
	}	
	
	//3. 데이터데이스 종료 메서드
	public void dbClose() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch(Exception e) {
			System.out.println("데이터 베이스 닫기 예외 발생!!!!");
		} 
	}
}
