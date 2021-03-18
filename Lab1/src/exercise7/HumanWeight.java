package exercise7;

import java.util.Scanner;

public class HumanWeight {
	
	public static void main(String[] args ) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your weight in pounds(lbs): ") ;

		double weight = input.nextDouble();

		// calculate weights on earth and mars

		double earth = (weight * 1);
		double mars = (weight * 0.38);

		// display results

		System.out.print("\n");
		System.out.print("Your weight on Earth is " + earth + " lbs \n");
		System.out.print("Your weight on Mars is " + mars + " lbs \n");

		} 

}
