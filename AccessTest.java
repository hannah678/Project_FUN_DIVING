package pkg1;

class MyParent {
	private   int prv;  // same class  
			  int dft;  // (default)same package
	protected int prt;  // same package + child (of other package)
	public    int pub;  // no limit
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);

	}
}

public class AccessTest {  // other class of same package
	public static void main(String[] args) {
		MyParent p = new MyParent();
		// System.out.println(p.prv);  // error
		System.out.println(p.dft);     // OK
		System.out.println(p.prt);     // OK
		System.out.println(p.pub);     // OK
	}
}
