class Book {
	String[] bookNo = {"B001", "B002", "B003", "M001", "M002", "M003"};
	String[] bookTitle = {"자바 프로그래밍", "자바스크립트", "HTML/CSS", "자바 월드", "웹 월드", "게임 월드"};
	String[] bookAuthor = {"홍길동", "이몽룡", "성춘향", "홍길동", "이몽룡", "성춘향"};
	int[] bookPrice = {25000, 30000, 18000, 25000, 30000, 18000};
	int[] bookYear = {2021, 2020, 2021, 2021, 2020, 2021};
	String[] bookPublisher = {"멀티출판사", "서울출판사", "강남출판사", "멀티출판사", "서울출판사", "강남출판사"};
	
	public String toString(){
		String result = "";
		for (int i=0; i<bookNo.length/2; i++) {
				result += String.format("%s\t%s\t%s\t%d\t%d\t%s\n", bookNo[i], bookTitle[i], bookAuthor[i], bookPrice[i], bookYear[i], bookPublisher[i]);
		}
		return result;
	}
}

class Magazine extends Book {
	int[] month = {5, 7, 9};
	public String toString() {
		String result = "";
		for (int i=bookNo.length/2 , j=0; i<bookNo.length && j<month.length; i++, j++) {
			result += String.format("%s\t%s\t%s\t%d\t%d\t%s\t   %d\n", bookNo[i], bookTitle[i], bookAuthor[i], bookPrice[i], bookYear[i], bookPublisher[i], month[j]);
		}
		return result;
	}
	
}

public class javaProject2 {
	public static void main(String[] args) {
		Book b = new Book();
		Magazine m = new Magazine();
		
		System.out.printf("도서번호\t도서명\t\t저자\t가격\t발행일\t출판사\n");
		System.out.println(b.toString());
		System.out.printf("잡지번호\t잡지명\t발행인\t가격\t발행연도\t출판사\t발행월\n");
		System.out.println(m.toString());
	}
}
