package floatAndDoubleComparison;

//Refer : https://gist.github.com/rajeevprasanna/8754840
public class Test1 {
	public static void main(String[] args) {

		double a = 99999.8;
		double b = 99999.65;
		System.out.println(a + b);
		
		float a2 = 99999.8f;
		float b2 = 99999.65f;
		System.out.println(a2 + b2);
 		
		// output : 199999.45
		// 199999.44
		// Neither of the fraction portions .8 and .65 have a terminating binary
		// representation, so there is some rounding error. the double has more
		// precision so it has slightly less rounding error.
	}
}
