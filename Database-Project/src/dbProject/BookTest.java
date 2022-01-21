package dbProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BookTest {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //����
		
		public void start() throws IOException {
			insertBook();
			bookList();
			}
			
		//���� ������ �Է� �޾Ƽ� BookDAO Ŭ������ insertBook() �޼��� ȣ���ϰ� ����
		public void insertBook() throws IOException {
			BookDTO dto = new BookDTO();
			System.out.println("����� ���� ������ �Է��ϼ���.");
			String s = br.readLine();
			
			StringTokenizer st = new StringTokenizer(s); //StringTokenizer���ڰ��� �Է� ���ڿ� ����
			
			dto.setBookNo(st.nextToken());
			dto.setBookTitle(st.nextToken());
			dto.setBookAuthor(st.nextToken());
			dto.setBookYear(Integer.parseInt(st.nextToken()));
			dto.setBookPrice(Integer.parseInt(st.nextToken()));
			dto.setBookPublisher(st.nextToken());
			
			BookDAO dao = new BookDAO();
			dao.insertBook(dto);
		}
		
		//BookDAO Ŭ������ selectBook() ȣ���ؼ� ������ ��µǵ��� �� 
		public void bookList() {
			BookDAO dao = new BookDAO();
			dao.selectBook();
		}
			
		public static void main(String[] args) throws IOException{
			new BookTest().start();
		}
}