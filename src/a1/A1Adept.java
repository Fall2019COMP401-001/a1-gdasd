package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Your code follows here.
		int numStore = input.nextInt();
		String[] itemList = new String[numStore];
		double[] priceList = new double[numStore];
		
		for (int i = 0; i < numStore; i++) {
			itemList[i] = input.next();
			priceList[i] = input.nextDouble();
		}
		
		int numCustomers = input.nextInt();
		String[] customerNames = new String[numCustomers];
		double[] customerPrices = new double[numCustomers];
		
		for (int i = 0; i < numCustomers; i++) {
			customerNames[i] = input.next() + " " + input.next();
			int customerItemQuantity = input.nextInt();
			
			for (int j = 0; j < customerItemQuantity; j++) {
				int individualQuantity = input.nextInt();
				String itemCheck = input.next();
				
				for (int k = 0; k < numStore; k++) {
					if (itemList[k].equals(itemCheck)) {
						customerPrices[i] += priceList[k] * individualQuantity;
						break;
					}
				}
			}
		}
		int maxima = maxPriceIndex(customerPrices);
		int minima = minPriceIndex(customerPrices);
		double average = getAverage(customerPrices);
		
		System.out.println("Biggest: " + customerNames[maxima] + " (" + String.format("%.2f", customerPrices[maxima]) + ")");
		System.out.println("Smallest: " + customerNames[minima] + " (" + String.format("%.2f", customerPrices[minima]) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		
		input.close();
	}
	
	static int maxPriceIndex(double[] comparePrices) {
		int maxIndex = 0;
		for (int i = 1; i < comparePrices.length; i++) {
			if (comparePrices[i] > comparePrices[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	static int minPriceIndex(double[] comparePrices) {
		int minIndex = 0;
		for (int i = 1; i < comparePrices.length; i++) {
			if (comparePrices[i] < comparePrices[minIndex]) {
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	static double getAverage(double[] prices) {
		double sum = 0.0;
		for (double d: prices) {
			sum += d;
		}
		return (sum / prices.length);
	}
}
