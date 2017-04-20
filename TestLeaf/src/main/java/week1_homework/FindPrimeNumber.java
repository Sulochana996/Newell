package week1_homework;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		
		//To Read the Input from console
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number for check:");
		
		//capture the input number in an integer
		int num=scan.nextInt();
				
		//Declare a temp variable to hold the remainder value		
		int temp;
		
		//Declare a boolean variable and initialize to true.
		boolean isPrime=true;
		
		//For loop to check the input divisible by all numbers between 2 and num-1
		for(int i=2;i<num;i++){
			
			//System.out.println("iteration for "+i);
			temp= num%i;
			if(temp==0){
				isPrime=false;
				break;
			}
				
	    }
		
		if(isPrime)
			System.out.println("Given Number ->"+num+ " is a Prime Number");
		else
			System.out.println("Given Number ->"+num+ " is not a Prime Number");
	}
}	

	


