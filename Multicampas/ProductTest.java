class Product {
	
	int prdNo;
	String prdName;
	int prdPrice;
	int prdYear;
	String prdMaker;
	
	public Product(int prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
		this.prdNo = prdNo;
        this.prdName = prdName;
        this.prdPrice = prdPrice;
        this.prdYear = prdYear;
        this.prdMaker = prdMaker;
	}
	
	public String toString(){
        return String.format("%03d\t%s\t%d\t%d\t%s%n", prdNo, prdName, prdPrice, prdYear, prdMaker);
	}
}

public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product(1, "노트북", 1200000, 2021, "삼성");
	    Product p2 = new Product(2, "모니터", 300000, 2021, "LG");
	    Product p3 = new Product(3, "마우스", 30000, 2020, "로지텍");
		
		System.out.println("상품번호\t상품명\t가격\t연도\t제조사");
		System.out.println("-------------------------------------");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}
}

