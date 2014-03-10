package overloading;

public class autoBoxingOverLoading {
	public static void main(String[] args) {
		int i = 9;
		primitiveOverloading(i);
		
		Integer x = 9;
		primitiveOverloading(x);
	}

	private static void primitiveOverloading(int i) {
		System.out.println("Prinmitive");
	}

	private static void primitiveOverloading(Integer i) {
		System.out.println("Wrapper");
	}
}
