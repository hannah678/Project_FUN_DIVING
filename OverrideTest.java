class MyPoint3 {
	int x;
	int y;
	MyPoint3(int x, int y){
		this.x = x;
		this.y = y;
	}
	// override toString() of Object class
	public String toString() {
		return "x: " + x + ", y: "+y;
	}
}


public class OverrideTest {
	public static void main(String[] args) {
		MyPoint3 p = new MyPoint3(3,5);
		  //p.x =3;
		  //p.y = 5;
		System.out.println(p);
		  //System.out.println(p.toString());
	}
}
