abstract class Unit {
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("Stop.");}
}

interface Fightable {
	void move(int x, int y);   // omit public abstract
	void attack(Fightable f);  // omit public abstract
}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {
		System.out.println("Move to [" + x + ", " + y + "]");
	}
	public void attack(Fightable f) {
		System.out.println("Attack " + f);
	}
}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.stop();
		f.move(100, 200);
		f.attack(new Fighter());
	}
}