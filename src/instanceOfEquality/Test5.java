package instanceOfEquality;

//Refer: https://gist.github.com/rajeevprasanna/8757785
public class Test5 {
	
	static class A {
	}

	static class B extends A {

		public static void m2(A a) {
			if (a instanceof B)
				((B) a).doBstuff(); // downcasting an A reference
									// to a B reference
		}

		public static void doBstuff() {
			System.out.println("'a' refers to a B");
		}
	}

	public static void main(String[] args) {
		A myA = new B();
		B.m2(myA);
	}
}
