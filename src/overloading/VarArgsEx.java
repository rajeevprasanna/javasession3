package overloading;

public class VarArgsEx {
	static void go(byte x, byte y) {
		System.out.println("byte,bytet");
	}

	static void go(Byte... x) {
		System.out.println(x.getClass());
		for (byte arg : x) {
			System.out.println(arg);
		}
		System.out.println("byte... ");
	}

	public static void main(String[] args) {
		byte b = 5;
		go(b, b); // which go() will be invoked?

		go(b, b, b, b, b, b);

		Byte d = null;
		// go(d);
	}
}
