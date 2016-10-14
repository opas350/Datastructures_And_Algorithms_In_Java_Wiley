// Example of the use of wrapper and boxing pg. 19

class WrapperEx1 {

	public static void main(String args[]) {

		int j = 8;
		System.out.println("j = " + j);
		Integer a = new Integer(12);
		System.out.println("a = " + a);
		int k = a;	// implicit call to a.intValue()
		System.out.println("k = " + k);
		int m = j + a;	// a is automatic unboxed before the addition
		System.out.println("m = j + a = " + (j + a) );
		a = 3 * m;	// result is automatically boxed before assigment
		System.out.println("a = 3 * m = " + (3 * m) );
		Integer b = new Integer("-135"); // constructor accepts a String
		System.out.println("b = " + b);
		System.out.println("b + 135 = " + (b + 135) );
		int n = Integer.parseInt("2013"); // using static method of Integer class
		System.out.println("n = " + n);

	}
}
