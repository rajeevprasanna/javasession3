package overloading;

//Refer: https://gist.github.com/rajeevprasanna/8757479
public class WidenAndBox {

	static void go(Long x) {
		System.out.println("Long");
	}

	/*
	 * static void go(long x) { System.out.println("long"); }
	 */

	static void go(Object o) {
		Byte b2 = (Byte) o;
		System.out.println(b2);
	}

	static void wide_vararg(long... x) {
		System.out.println("long...");
	}

	static void box_vararg(Integer... x) {
		System.out.println("Integer...");
	}

	public static void main(String[] args) {
		byte b = 5;
//		go(b); // must widen then box - illegal...widening method(commented) is called

		byte c = 5;
		//go(c);
		
		int i = 5;
	    wide_vararg(i,i); // needs to widen and use var-args
	    box_vararg(i,i);  // needs to box and use var-args
	}
}
