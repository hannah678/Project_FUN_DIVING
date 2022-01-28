package algorithmProject2;

import java.util.Scanner;

public class BinarySearchTreeTest {
	static Scanner s = new Scanner(System.in);
	static class Data{
		private int no;
		private String name;
		
		static final int NO=1;
		static final int NAME=2;
		
		Integer getKeyCode() {
			return no;
		}
		public String toString() {
			return name;
		}

		public void inData(String msg, int sw) {
			System.out.println();
			System.out.println(msg);
			
			if((sw&NO) == NO ) {
				System.out.print("상품 번호 입력: ");
				no = Integer.parseInt(s.nextLine());
			}
			if((sw&NAME)==NAME) {
				System.out.println("상품명 입력: ");
				name = s.nextLine();
			}
		}
	}

	enum Menu{
		ADD("상품 등록  "),
		REMOVE("상품 삭제  "),
		SEARCH("상품 검색  "),
		PRINT("전체 상품 조회  "),
		TERMINATE("종료  ");
		private final String message;
		
		Menu(String msg) {
			message = msg;
		}
		String getMessage() {
			return message;
		}

		static Menu menuAt(int idx) {
			for(Menu m : Menu.values()) {
				if(m.ordinal()==idx) {
					return m;
				}
			}
			return null;
		}
	}

	static Menu selectMenu() {
		int menuNo;
		do {
			for(Menu m: Menu.values()) {//메뉴 출력
				System.out.printf("(%d) %s", m.ordinal()+1, m.getMessage());
				
			}
			System.out.println();
			System.out.print("메뉴 선택 : ");
			menuNo = Integer.parseInt(s.nextLine())-1;
		}while(menuNo < Menu.ADD.ordinal() || menuNo>Menu.TERMINATE.ordinal());
		return Menu.menuAt(menuNo);
	}
	public static void main(String[] args) {
		Menu m;
		
		BinaryTree<Integer, Data> tree = new BinaryTree<Integer, Data>();
		Data data;
		do {
			m = selectMenu();//사용자가 선택한 메뉴
			switch(m) {
			case ADD:
				data = new Data();
				data.inData("상품 등록", data.NO | data.NAME);
				tree.add(data.getKeyCode(), data);
				break;
				
			case REMOVE:
				data = new Data();
				data.inData("상품 삭제" , data.NO);
				boolean result = tree.remove(data.getKeyCode());
				break;
				
			case SEARCH:
				data = new Data();
				data.inData("상품 검색", data.NO);
				Data searchData = tree.search(data.getKeyCode());
				if(searchData==null) {
					System.out.println("등록된 상품이 없습니다.");
				} else {
					System.out.println("상품명 : "+searchData);
				}
				System.out.println();
				break;
				
			case PRINT:
				if(tree==null) {
					System.out.println("등록된 상품이 없습니다.");
				} else tree.print();
			}
		}while(m != Menu.TERMINATE);
		if(m == Menu.TERMINATE) {
			System.out.println("종료합니다.");
		}
	}
}