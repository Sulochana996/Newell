package day2;

public class factorial {
	public static void main(String[] args) {
		
		int a = 5;
		int i, fact = 1;
		for (i=1;i<=a;i++)
		{
			fact = fact*i;	
		}
		System.out.println(+fact);
	}
}
