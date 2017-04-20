package week1_homework;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter start number:");//say 100
		int startNum=scan.nextInt();
		
		System.out.println("Enter end number:");//say 200
		int endNum=scan.nextInt();
		
		
		System.out.println("Even numbers between "+startNum + " & " +endNum);
		for (int i=startNum;i<=endNum;i++){
			
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}
}	
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			
		

	


