package equals;



public class EqualsClass {

	private int primitive;
	private String s;

	public EqualsClass(int primitive) {
		this.primitive = primitive;
	}

	public void getx() {
	}

	@Override
	public int hashCode() {
		return primitive;
	}

	// M1 -- o1...o2

	// 123-M1 -- o1
	// o2 --> 567 -- 02

	// override hash code --> generate o1 --.>123 o2 is same as o2 -> 123
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EqualsClass) {
			return this.primitive == ((EqualsClass) obj).primitive;
		} else {
			return false;
		}
	}
}
