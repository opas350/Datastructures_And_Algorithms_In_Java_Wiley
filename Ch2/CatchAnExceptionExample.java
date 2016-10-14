
class CatchAnExceptionExample {

	public static void main(String[] args) {

		int n = 0;
		try {
			n = Integer.parseInt(args[0]);
			
			if(n <= 0) {
				System.out.println("n must be positive. Using default.");
				n = 0;
				System.out.println("default = " + n);
			}

			else
				System.out.println("n = " + n);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No argument specified for n. Using default.");
		} catch(NumberFormatException e) {
			System.out.print("Invalid integer argument. Using default.");
		}
	}
}
