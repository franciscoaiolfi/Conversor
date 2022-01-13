package fahToCelsius;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;

		do {
			System.out.print("What is the temperature in F? ");
			double tempF = sc.nextDouble();
			double tempC = 9.0 * tempF / 5.0 - 32.0;
			System.out.println("The temperatura in C is: " + tempC);
			System.out.println("Do you want to repeat? (y/n)");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();
	}

}
