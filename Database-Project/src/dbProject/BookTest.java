package dbProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BookTest {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		
		public void start() throws IOException {
			insertBook();
			bookList();
			}
			
		//도서 정보를 입력 받아서 BookDAO 클래스의 insertBook() 메서드 호출하고 전달
		public void insertBook() throws IOException {
			BookDTO dto = new BookDTO();
			System.out.println("등록할 도서 정보를 입력하세요.");
			String s = br.readLine();
			
			StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
			
			dto.setBookNo(st.nextToken());
			dto.setBookTitle(st.nextToken());
			dto.setBookAuthor(st.nextToken());
			dto.setBookYear(Integer.parseInt(st.nextToken()));
			dto.setBookPrice(Integer.parseInt(st.nextToken()));
			dto.setBookPublisher(st.nextToken());
			
			BookDAO dao = new BookDAO();
			dao.insertBook(dto);
		}
		
		//BookDAO 클래스의 selectBook() 호출해서 데이터 출력되도록 함 
		public void bookList() {
			BookDAO dao = new BookDAO();
			dao.selectBook();
		}
			
		public static void main(String[] args) throws IOException{
			new BookTest().start();
		}
}