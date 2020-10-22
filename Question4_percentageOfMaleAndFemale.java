package assignments.Lab2;

import java.util.Scanner;

public class Question4_percentageOfMaleAndFemale {

	public static void main(String[] args) {
		
//Write a program that asks user for the number of males and 
//the number of females registered in a class.
//The program should display the percentage of males and females in the class.

	
		
		Scanner scan=new Scanner (System.in);
	
		System.out.println("Please enter the registered number of males in a class");
		int maleStudents =scan.nextInt();
		
		System.out.println("Please enter the registered number of females in a class");
		int femaleStudents =scan.nextInt();
		
		
		int totalStudents=maleStudents+femaleStudents;
		int malePercentage= (100/totalStudents)*maleStudents;
		int femalePercentage= (100/totalStudents)*femaleStudents;
		
		
		System.out.println("The percentage of male students %"+ malePercentage+ ", the percentage of female students %"+ femalePercentage);
				
		
		
	}

}
