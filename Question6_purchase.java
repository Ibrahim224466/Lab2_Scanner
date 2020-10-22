package assignments.Lab2;

import java.util.Scanner;

public class Question6_purchase {

	public static void main(String[] args) {
		
//Write a program that will ask the user to enter the amount of a purchase.
//The program should then compute the state and county tax sales tax. 
//Assume the state sales tax is 4 percent and the county sales tax is 2 percent.
//The program should display the amount of the purchase , 
//  the state sales tax, the county sales tax, the total sales tax, 
//	and the total of the sale (which is the sum of the amount of purchase plus the total sales tax)	
		

		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter the amount of a purchase:");
		
		double purchase=scan.nextDouble();
		
		double stateSalesTax=purchase*0.04;
		double countySalesTax=purchase*0.02;
		double totalSalesTax=stateSalesTax+countySalesTax;
		double totalOfTheSale=purchase+totalSalesTax;
		
		
		System.out.println( "The amount of the purchase "+ purchase+ "$, "	+ "the state sales tax" +stateSalesTax+ "$, the county sales tax"+ countySalesTax+ "$, the total sales tax"+ totalSalesTax+"$, and the total of the sale "+totalOfTheSale+"$");
		

		
	}

}
