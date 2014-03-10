package overloading;

//Refer : https://gist.github.com/rajeevprasanna/8757265
public class EasyOver {
	
	/*static void go(byte b){
		System.out.println("Byte");
	}*/
	static void go(int x) {
		System.out.println("int ");
	}

	/*static void go(long x) {
		System.out.println("long ");
	}*/

	static void go(double x) {
		System.out.println("double ");
	}

	public static void main(String[] args) {
		
		byte b = 5;
		//go(b);//int
		
		int i = 6;
		//go(i);
		
		short s = 5;
		
		long l = 5;
		//go(l);
		
		
		float f = 5.0f;
		go(f);
		
		//the calls that use byte and the short arguments are implicitly widened 
		//to match the version of the go() method that takes an int.
		
		
		//go(s);//int
		
		
		//go(l);//long
		
		// call that uses a float is matched to the method that takes a double.
		//go(f);//double
	}
}
