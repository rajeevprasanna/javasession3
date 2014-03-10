package implicitIntCating;

//Refer :https://gist.github.com/rajeevprasanna/8755470
public class TestX {
	
	Object[] oox; //oox=null
	Object ooy = new Object[4];//{null, null,null, null}
	
	public static void main(String[] args) {
		
		int[] aa = new int[4];//000
		boolean[] xx = new boolean[4];//{false,false,false,false }
		Object oo = new Object[4];//{null, null,null, null}
		
		byte a = 3;
		byte b = 4;

		int c =  (a + b);
		System.out.println(c); // 7

		byte d = (byte) (a + 4);
		System.out.println(d);// 7
	}
}
