package variablePassing;

// Refer : https://gist.github.com/rajeevprasanna/8755845
public class ShadowReferenceVariables {
	
	public Bar myBar = new Bar();

	void changeIt(Bar myBar) { //myBar is copy reference pointing to inst1
		myBar.barNum = 99; //inst1 bar variable is modified
		System.out.println("myBar.barNum in changeIt is " + myBar.barNum); //99	
		
		myBar = new Bar();// myBar is copy reference pointing to inst2
		myBar.barNum = 420;//inst1 bar variable is modified to 420
		System.out.println("myBar.barNum in changeIt is now " + myBar.barNum); //inst2 value is 420
	}
	
	

	public static void main(String[] args) {
		ShadowReferenceVariables f = new ShadowReferenceVariables();
		System.out.println("f.myBar.barNum is " + f.myBar.barNum);//28--> inst1
		
		f.changeIt(f.myBar);//inst1 reference copy is passed
		System.out.println("f.myBar.barNum after changeIt is " + f.myBar.barNum); //99
		
		int[][] matrix = { { 1,2 }, { 1,2 }, { 1,2 } };
		
		 
	}
	
  /*
	f.myBar.barNum is 28
	myBar.barNum in changeIt is 99
	myBar.barNum in changeIt is now 420
	f.myBar.barNum after changeIt is 99*/
}
