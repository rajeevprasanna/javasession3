package staticExample;

public class Foo {
	
	int x = 3;

	public void instanceMethod(){
		
	}
	
	public static void main(String[] args) {
		System.out.println("x is " + x);
		//Foo1, Foo2
		
		new Foo().instanceMethod();
	}
	
	// “Hey, I have no idea which Foo object’s x variable you’re trying to
		// print!”
		// Remember, it’s the class running the main() method, not an instance
		// of the class.
}
