// Brief example of the Scanner  use

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter your age in years: " );
		double age = s.nextDouble();

		System.out.print("Enter your maximum heart rate: ");
		double rate = s.nextDouble();
		double fb = (rate - age) * 0.65;
		System.out.println("Your ideal fat-buring heart rate is " + fb);
	}
}
