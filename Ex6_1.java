//Object Oriented Programming(OOP)

public class Ex6_1 {
	public static void main(String[] args) {
		Tv t;              // declare variable
		t = new Tv();      //  create an instance
		t.channel = 7;     //  set member variable value to 7
		t.channelDown();   //  call the method channelDown() of Tv instance
		
		System.out.println("This channel is number "+ t.channel );
	}
}

class Tv {
	//properties of Tv(member variables) 
	String color;
	boolean power;
	int channel;
	
	//functions of Tv(methods)
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
