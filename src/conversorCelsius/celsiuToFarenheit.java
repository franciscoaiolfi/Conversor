package conversorCelsius;

import java.util.Locale;
import java.util.Scanner;

public class celsiuToFarenheit {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		
		do {
		System.out.print("What is the temperature in C:  ");
		double tempC = sc.nextDouble();
		double tempF = 9.0 * tempC / 5.0 + 32.0;
		System.out.println("The temperature in F is:  " + tempF);
		System.out.print("Do you want to repeat? (y/n): ");
		resp = sc.next().charAt(0);
		
		
		} while (resp != 'n');
		sc.close();
	}

}
