package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Your code follows here.
		int numStore = input.nextInt();
		String[] itemList = new String[numStore];
		double[] priceList = new double[numStore];
		
		// Adds item names and prices to parallel arrays
		for (int i = 0; i < numStore; i++) {
			itemList[i] = input.next();
			priceList[i] = input.nextDouble();
		}
		
		int numCustomers = input.nextInt();
		String[] customerNames = new String[numCustomers];
		int[] customerAmount = new int[numStore];
		int[] itemAmount = new int[numStore];
		
		for (int i = 0; i < numCustomers; i++) {
			customerNames[i] = input.next() + " " + input.next();
			int customerItemQuantity = input.nextInt();
			int[] repeatCheck = customerAmount.clone();
			
			for (int j = 0; j < customerItemQuantity; j++) {
				int individualQuantity = input.nextInt();
				String itemCheck = input.next();
				
				for (int k = 0; k < numStore; k++) {
					if (itemList[k].equals(itemCheck)) {
						if(repeatCheck[k] == customerAmount[k]) {
							customerAmount[k]++;
						}
						itemAmount[k] += individualQuantity;
						break;
					}
				}
			}
		}
		
		// Prints out item name, quantity purchased, and number of customers who purchased for each item
		for (int i = 0; i < numStore; i++) {
			if (customerAmount[i] != 0) {
				System.out.println(customerAmount[i] + " customers bought " + itemAmount[i] + " " + itemList[i]);
			}
			else
				System.out.println("No customers bought " + itemList[i]);
		}
		
		input.close();
	}
}
