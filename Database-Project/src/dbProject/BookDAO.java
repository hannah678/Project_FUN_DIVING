package dbProject;

public class BookDAO extends MysqlConnection{
	
	//book 테이블에 데이터 저장
	public void insertBook(BookDTO dto) {
		try {
		getConn();
		String sql = "insert into book(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher) "
				+ "values(?,?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1,dto.getBookNo());
		pstmt.setString(2,dto.getBookTitle());
		pstmt.setString(3,dto.getBookAuthor());
		pstmt.setInt(4,dto.getBookYear());
		pstmt.setInt(5,dto.getBookPrice());
		pstmt.setString(6,dto.getBookPublisher());
		
		pstmt.executeUpdate();
		
		/*while(rs.next()) {
			dto.setBookNo(rs.getString(1));
			dto.setBookTitle(rs.getString(2));
			dto.setBookAuthor(rs.getString(3));
			dto.setBookYear(rs.getInt(4));
			dto.setBookPrice(rs.getInt(5));
			dto.setBookPublisher(rs.getString(6));
		
		} */
		}catch (Exception e) {
			System.out.println("도서입력 예외 발생!");
			e.printStackTrace();
		}finally {
			dbClose();
		}
		}
	
	// book 테이블에 있는 모든 데이터 출력
	public void selectBook() {
		try {
			getConn();
			String sql = "select * from book order by bookNo";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.printf("%s\t%s\t%s\t%d\t%d\t%s\n",
				        rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4),
				        rs.getInt(5), rs.getString(6));
					}
		}catch(Exception e) {
			System.out.println("도서 정보 출력 오류!");
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
		
}
