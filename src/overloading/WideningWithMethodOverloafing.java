package overloading;

public class WideningWithMethodOverloafing {
	
	public static void main(String[] args){
		Parent p = new Parent();
		Child1 c1  =new Child1();
		Child2 c2 = new Child2();
			
		//overload1(p);
		//overload1(c1);
		overload1(c2);
	}
	
	private static void overload1(Parent p){
		System.out.println("parent");
	}
	
	/*private static void overload1(Child1 c1){
		System.out.println("child1");
	}*/
	
	/*private static void overload1(Child2 c2){
		System.out.println("child2");
	}*/
	
}
