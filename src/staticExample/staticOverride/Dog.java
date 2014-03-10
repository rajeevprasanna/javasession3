package staticExample.staticOverride;

//https://gist.github.com/rajeevprasanna/8754437
public class Dog extends Animal {

	static void doStuff() {
		System.out.print("d ");
	}
	
	{
		System.out.println("test");
	}

	// it's a redefinition, not an override
	public static void main(String[] args) {
		Animal[] a = { new Animal(), new Dog(), new Animal() };
		for (int x = 0; x < a.length; x++)
			a[x].doStuff(); // invoke the static method. It will invoke static
							// method of the class name u r having not actual
							// instance it is holding.
	}
}
