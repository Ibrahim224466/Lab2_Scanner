package assignments.Lab2;

import java.util.Scanner;

public class Question2_cookies {

	public static void main(String[] args) {

		
//	A bag of cookies holds 40 cookies. 
//	The calorie information on the bag claims 
//	that there are 10 serving in the bag and 
//	that a serving equals 300 calories. write a program 
//	that lets the user enter the number of cookies
//	he or she actually ate and then reports 
//	the number of total calories consumed.

		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter the number of cookies that you ate: ");
		
		int cookiesEaten=scan.nextInt();
		
		int bagOfCookies=40;
		int servingOfCookies=10;
		int servingOfCalories=300;
		int caloriesOfAcookie=servingOfCalories/servingOfCookies;
		int numberOfTotalCalories=caloriesOfAcookie*cookiesEaten;
		
		String report=("The number of total calories consumed : "+numberOfTotalCalories+"calories");
		System.out.println(report);
		
		
		
		
		
		
	}

}


