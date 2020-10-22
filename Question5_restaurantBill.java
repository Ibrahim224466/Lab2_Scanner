package assignments.Lab2;

import java.util.Scanner;

public class Question5_restaurantBill {

	public static void main(String[] args) {
		
//Write a program that computes the tax and tip on a restaurant bill.
//The program should ask the user to enter the charge for the meal. 
//The tax should be 6.75 percent of the meal charge. 
//The tip should be 20 percent of the total after adding tax.
//Display the meal charge, tax amount, tip amount, and total bill on the screen.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the charge for the meal:");
		
		double charge=scan.nextDouble();
		
		double tax=charge*0.0675;
		double tip=(charge+tax)* 0.20;
		double totalBill=charge+tax+tip;
		
		System.out.println("The meal charge:"+charge+ "$ , tax amount:" +tax+"$ , tip amount:"+tip+"$ and total bill:"+totalBill+ "$");
		

	}

}
