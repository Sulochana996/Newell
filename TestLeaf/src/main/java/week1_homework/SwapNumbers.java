package week1_homework;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		    	int a=2,b=3;
				System.out.println("Before swapping, a value is "+ a +"& b value is " +b);
				a=a+b;
				b=a-b;
				a=a-b;
				System.out.println("After swapping, a value is "+ a +"& b value is " +b);

	}

}
