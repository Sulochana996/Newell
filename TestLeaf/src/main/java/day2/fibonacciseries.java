package day2;

public class fibonacciseries {

	public static void main(String[] args) {
			
		int a=0,b=1,c,i,count=12;
		System.out.print("Fibonacci series whose count is "  +count+ " : " +a+" "+b);
		
		for (i=2;i<count;++i)
		{
			c = a+b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}
	} }

