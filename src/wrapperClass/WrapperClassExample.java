package wrapperClass;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassExample {
	public static void main(String[] args) {
		Boolean b = null;
		Integer i = null;
		
		List<Boolean> booleanList  = new ArrayList<Boolean>();
		booleanList.add(true);
		booleanList.add(b);
		
		for(Boolean x: booleanList){
			System.out.println(x);
		}
	}
}
