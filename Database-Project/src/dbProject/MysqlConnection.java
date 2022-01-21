package dbProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MysqlConnection {

	// �������, ��ü ����
	//1.  ����̺� �ε�
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (Exception e) {
			System.out.println("����̺�ε� ���� �߻�");
		}
	}
	//��� ������ ������ �����Ѵ�.
	protected Connection conn = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	
	//2. �����ͺ��̽� ���� �޼���
	public void getConn() {
		String url = "jdbc:mysql://localhost/kim";
		String id = "root";
		String password = "root";
		try {
			conn = DriverManager.getConnection(url,id,password);
			
		} catch (Exception e) {
			System.out.println("������ ���̽� ���� ���� �߻�!!!");
		}
	}	
	
	//3. �����͵��̽� ���� �޼���
	public void dbClose() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch(Exception e) {
			System.out.println("������ ���̽� �ݱ� ���� �߻�!!!!");
		} 
	}
}
