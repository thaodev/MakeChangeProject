package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter price of the purchased item: ");
		double price = sc.nextDouble();
		System.out.println("Please enter payment:");
		double payment = sc.nextDouble();
		int roundedRefund = 0;
		double change = 0.0;
		
		if (price > payment) {
			System.out.println("Payment is insuficient!");
		} else if (price == payment) {
			System.out.println("Transaction successed!");
		} else {
			double refund = payment - price;
			roundedRefund = (int) (refund / 1);
			change = Math.round((refund - roundedRefund) * 100.0) / 100.0;
			int changeInCent = (int) (change * 100);
			System.out.println("The refund is " + refund);
			System.out.println("The rounded refund is " + roundedRefund);
			System.out.println("The change " + change);
			System.out.println("Your refund will be paid as ");
			roundedRefundCalc(roundedRefund);
			//System.out.print(" and ");
			changeInCentCalc(changeInCent);
		}
	}
	
	public static void changeInCentCalc(int changeInCent) {
		int quarter = changeInCent / 25;
		if (quarter > 0) {
			changeInCent = changeInCent % 25;
			if (quarter <= 1) {
				System.out.print(quarter + " quarter, ");
			} else {
				System.out.print(quarter + " quarters, ");
			}
		}
		
		int dime = changeInCent / 10;
		if (dime > 0) {
			changeInCent = changeInCent % 10;
			if (dime <= 1) {
				System.out.print(dime + " dime, ");
			} else {
				System.out.print(dime + " dimes, ");
			}

		}
		int nickel = changeInCent/5;
		if (nickel > 0) {
			changeInCent = changeInCent%5;
			if (nickel <= 1) {
				System.out.print(nickel + " nickel, ");
			} else {
				System.out.print(nickel + " nickels, ");
			}
		}
		
		int penny = changeInCent;
		if (penny <= 1) {
			System.out.print(penny + " penny.");
		} else {
			System.out.print(penny + " pennies.");
		}
	}
	
	public static void roundedRefundCalc(int roundedRefund) {
		int twenty = roundedRefund / 20;
		if (twenty > 0) {
			roundedRefund = roundedRefund % 20;
			if (twenty <= 1) {
				System.out.print(twenty + " $20 bill, ");
			} else {
				System.out.print(twenty + " $20 bills, ");
			}
		} 
		
		int ten = roundedRefund / 10;
		if (ten > 0) {
			roundedRefund = roundedRefund % 10;
			if (ten <= 1) {
				System.out.print(ten + " $10 bill, ");
			} else {
				System.out.print(ten + " $10 bills, ");
			}
			
		}
		
		int five = roundedRefund / 5;
		if (five > 0) {
			roundedRefund = roundedRefund % 5;
			if (five <= 1) {
				System.out.print(five + " $5 bill, ");
			} else {
			System.out.print(five + " $5 bills, ");
			}
		}
		int one = roundedRefund;
		if (one > 0) {
			if (one <=1) {
				System.out.print(one + " $1 bill,");
			} else {
			System.out.print(one + " $1 bills,");
			}
		}
	}


}
