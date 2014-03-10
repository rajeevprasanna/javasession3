package overloading;

//Refer : https://gist.github.com/rajeevprasanna/8757252
public class OverLoadingPrecedence {

	static void go(Integer x) {
		System.out.println("2. Boxing");
	}

	static void go(long x) {
		System.out.println("1. widening");
	}

	static void go(int... x) {
		System.out.println("3. var args");
	}

	// Compiler will choose widening over boxing, so the output will be
	public static void main(String[] args) {
		int i = 5;
		go(i); // which go() will be invoked?
	}
}
