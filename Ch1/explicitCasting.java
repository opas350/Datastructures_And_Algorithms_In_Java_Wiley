// Brief example of Explicit Casting.

class explicitCasting {

	public static void main(String args[]) {

		double d1 = 3.2;
		double d2 = 3.999;
		System.out.println("d1 = " + d1 +"\nd2 = " + d2);

		int i1 = (int) d1;	// i1 gets value 3
		int i2 = (int) d2;	// i2 gets value 3
		System.out.println("i1 = (int) d1 = " + i1);
		System.out.println("i2 = (int) d2 = " + i2);

		double d3 = (double) i2;	// d3 gets value 3.0
		System.out.println("d3 = (double) i2 = " + d3);
	}
}
