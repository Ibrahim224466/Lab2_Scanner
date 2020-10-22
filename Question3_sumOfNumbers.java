package assignments.Lab2;

import java.util.Scanner;

public class Question3_sumOfNumbers {

	public static void main(String[] args) {

//Write a program that asks the user for a positive nonzero integer value.
//The program should use a loop 
//to get the sum of all the integers from 1 up to the number entered. 		

		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter a positive nonzero integer value");
		
		int number=scan.nextInt();
		
		int sum=0;
		
		for (int i=1; i<=number;i++) {
		
		 sum=sum+i;
		
		}
		
		
		
		
		System.out.print("The sum of all the integers from 1 to "+ number+" is "  + sum );
		
		
		
	}

}
