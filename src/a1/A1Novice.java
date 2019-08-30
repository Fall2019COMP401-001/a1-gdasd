package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numPeople;
		double price = 0;
		// Your code follows here.
		numPeople = scan.nextInt();
		for (int i = 0; i < numPeople; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int orderQuantity = scan.nextInt();
			for (int j = 0; j < orderQuantity; j++) {
				int itemQuantity = scan.nextInt();
				scan.next();
				double itemPrice = scan.nextDouble();
				price += itemPrice * itemQuantity;
			}
			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + String.format("%.2f", price));
			price = 0;
		}
		scan.close();
	}
}
