// Example using the util Scanner and using other methods from class
import java.util.Scanner;

class ScannerExampleWithCond {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter an Integer: ");
		while(!s.hasNextInt()) {
			
			s.nextLine();
			System.out.print("Invalid Integer; please try again");
		}

		int i = s.nextInt();
	}
}
