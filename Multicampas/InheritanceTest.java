
class Parent {
	int x;
	int y;
}

class Child extends Parent {   // inheritance
	int r;
} 

// class Child {                  // including
	// Parent p = new Parent();
	// int r;
// }

public class InheritanceTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.x = 1;
		c.y = 2;
		c.r = 3;
		System.out.println("c.x = " + c.x);
		System.out.println("c.y = " + c.y);
		System.out.println("c.r = " + c.r);
	}
}