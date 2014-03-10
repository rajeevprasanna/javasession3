package equals;

public class CompareEqualsMethod {
	
	public static void main(String[] args){
		
		EqualsClass e1 = new EqualsClass(4);
		EqualsClass e2 = new EqualsClass(4);
		
		System.out.println(e1==e2);// false
		System.out.println(e1.equals(e2));//true
		
		System.out.println(e1.equals("String"));
		
	} 
}
