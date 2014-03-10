package equality;

//Refer : https://gist.github.com/rajeevprasanna/8757682
public class ComparePrimitives {
	public static void main(String[] args) {		
		System.out.println("char 'a' == 'a'? " + ('a' == 'a'));// true
		System.out.println("char 'a' == 'b'? " + ('a' == 'b'));// false
		System.out.println("5 != 6? " + (5 != 6));// true
		System.out.println("5.0 == 5L? " + (5.0 == 5L));// true
		System.out.println("true == false? " + (true == false));// false
	}
}
