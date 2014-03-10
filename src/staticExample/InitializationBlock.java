package staticExample;

//https://gist.github.com/rajeevprasanna/8756880

//Initialization blocks are the third place in a Java program where operations can be performed. 
//Initialization blocks run when the class is first loaded (a static initialization block) or 
//when an instance is created (an instance initialization block)
public class InitializationBlock {
	
/*	x=7 is loaded
			z[4]  array is loaded
			main started....
			7
*/
	
	
	
	int y;
	static int x;
	static {
		System.out.println("x value => "+ x);
		x = 7;
		System.out.println("x=7 is loaded");
	}
	
	
	{
		y = 8;
		System.out.println("y=8 is loaded");
	}

	public static void main(String[] args) {
		System.out.println("main started....");
		System.out.println(x);//7
	}
	
	static int [] z = new int[4];//0 to 3
	static {
		System.out.println("z[4]  array is loaded");
		z[4] = 5;//max index can be inserted in z[3]. now it throws ArrayIndexoutofBoundException.
	} // bad array index!
     
}
