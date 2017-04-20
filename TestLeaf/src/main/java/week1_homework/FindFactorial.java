package week1_homework;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		
		//To Read the Input from console
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number for factorial:");
				
		//capture the input number in an integer
		int num=scan.nextInt();	
		
		int fact=1;
		
		for(int i=1;i<=num;i++){
		fact=fact*i;	
		}
		System.out.println("Factorial of  "+num+" is "+fact);

	}

}
