package assignments.Lab2;

import java.util.Scanner;

public class Question1_seriesOfNumbers {

	public static void main(String[] args) {
	
//Write a program with a loop that lets the user enter a series of integer numbers.
//After all the numbers have been entered, the program should display
//the largest and smallest numbers entered.

		Scanner scan =new Scanner(System.in);
		 int smallestNumber=0;
		 int largestNumber=0;
		  System.out.print("Enter your first number:");
		  int number=scan.nextInt();
		smallestNumber=number;
		  System.out.print("Enter your next number:");
			 number=scan.nextInt();
		if(number<=smallestNumber) {
			smallestNumber=number;
		}else {
			largestNumber=number;
		}
			int n=100;
			for(int i=1; i<=n; i++) {
				
				
				 System.out.print("Do you want to enter another number: 0-No, 1-Yes");
				 int answer=scan.nextInt();
				 if(answer==1) {
					 System.out.print("Enter your next number:");
					 number=scan.nextInt();
					 if(number<=smallestNumber) {
							smallestNumber=number;
						}else if(number>=largestNumber) {
							largestNumber=number;
						}
				 }else if(answer==0) {
					 System.out.println("Smallest number is:"+smallestNumber);
					 System.out.println("Largestt number is:"+largestNumber);
					 return;
				 }
			}
	}
}
