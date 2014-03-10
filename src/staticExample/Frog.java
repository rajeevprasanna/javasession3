package staticExample;

public class Frog {
	
	static int frogCount = 0;
	
	public Frog(){
		frogCount += 1;
	}
	 
	public static void main(String[] args){
		new Frog();
		new Frog();
		new Frog();
		System.out.println("Frog count is now => "+ frogCount);
		//TODO : make the static variable frogCount as instance variable and observe the ouput
	}
}
