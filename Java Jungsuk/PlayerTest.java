abstract class Player {                 
	abstract void play(int pos);   // abstract method that has no {}
	abstract void stop();             
}

class AudioPlayer extends Player {
	void play(int pos) {System.out.println("play from number"+pos);}
	void stop() {System.out.println("stop playing music");}
}

public class PlayerTest {
	public static void main(String[] args) {
	// Player p = new Player();  // error    //Object can be created when the abstract class is completed through inheritance.
	//	AudioPlayer ap = new AudioPlayer();  //OK
		Player ap = new AudioPlayer();     //polymorphism
		ap.play(100);
		ap.stop();
	}
}
