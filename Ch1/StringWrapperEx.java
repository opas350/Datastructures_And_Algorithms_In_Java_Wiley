// Brief example for casting string to int

class StringWrapperEx {

	public static void main(String args[]) {
		String s1 = "2014";
		int i1 = Integer.parseInt(s1);	//i1 gets 2014
		System.out.println("String s1 = " + s1); 
		System.out.println("i1 = Integer.parseInt(s1) = " + i1);
		int i2 = -35;
		String s2 = Integer.toString(i2);	// s2 gets value -35
		System.out.println("int i2 = " + i2);
		System.out.println("String s2 = Integer.toString(i2) = " + s2);

	}
}
