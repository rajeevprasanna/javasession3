package arrays;

//Refer : https://gist.github.com/rajeevprasanna/8756729
public class ArrayInitialization {
	
	public static void main(String[] args) {
		
		// Declare and create an array holding three references to int arrays
		int[][] scores = new int[3][];
		int[] test ={0,1,2}; 
		scores[0] = test;
		scores[1] = test;
		scores[2] = test;
		
		// the first element in the scores array is an int array of four int elements
		scores[0] = new int[4];
		  
		// the second element in the scores array is an int array of six int elements
		scores[1] = new int[6];
		
		// the third element in the scores array is an int array of one int element
		scores[2] = new int[1];		
		
		
		
		//Initializing elements in for loop
		Integer[] myDogs = new Integer[6]; // creates an array of 6
		// Dog references
		for (int x = 0; x < myDogs.length; x++) {
			myDogs[x] = new Integer(x); // assign a new Dog to the
			// index position x
		}
		
		
		
		//Initialzing in one line
		int x = 9;
		int[] dots = {6,x,8};
		
		int[][] scores2 = { { 5, 2, 4, 7 }, { 9, 2 }, { 3, 4 } };
		
		
		//Constructing and initializing anonymous array.
		//The second shortcut is called "anonymous array creation" and can be used to construct and initialize an array, 
		//and then assign the array to a previously declared array reference variable:
         int[] testScores;
         testScores = new int[] {4,7,2};
	}
}
