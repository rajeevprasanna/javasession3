package variablePassing;

//https://gist.github.com/rajeevprasanna/8755774
public class ReferenceTest {
	
	public static void main(String[] args) {
		
		int a = 1;
		
		ReferenceTest rt = new ReferenceTest();
		System.out.println("Before modify() a = " + a);//1
		
		rt.modify(a);
		System.out.println("After modify() a = " + a);//1
	}

	void modify(int number) {
		number = number + 1;
		System.out.println("number = " + number);//2
	}
	
}
