package instanceOfEquality;

//Refer: https://gist.github.com/rajeevprasanna/8757802
public class Test6 {
	static class Cat {
	}

	static class Dog {
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		//You can't use the instanceof operator to test across two different class hierarchies.
		//System.out.println(d instanceof Cat);
	}
}
