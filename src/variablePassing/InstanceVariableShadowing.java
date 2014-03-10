package variablePassing;

//https://gist.github.com/rajeevprasanna/8755805
public class InstanceVariableShadowing {
	
	static int size = 7;
	
	public int mInstance;
 
	public int getInstance() {
		return mInstance;
	}

	public void setInstance(int pInstance) {
		mInstance = pInstance;
	}

	static void changeIt(int size) {
		size = size + 200;
		System.out.println("size in changeIt is " + size);//207
	}

	public static void main(String[] args) {
		InstanceVariableShadowing f = new InstanceVariableShadowing();
		System.out.println("size = " + size);//7
		changeIt(size);
		System.out.println("size after changeIt is " + size);//207
	}
}
