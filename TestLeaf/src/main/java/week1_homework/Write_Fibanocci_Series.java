package week1_homework;

public class Write_Fibanocci_Series {

	public static void main(String[] args) {
		
		System.out.println("Printing Fibanocci_Series using While loop");
		
		int num1=0;
		int num2=1;
		int fNum;
		
		int i=2;
		
		System.out.print(num1 +" "+num2);
			
		while(i<=100){
		
			fNum=num1+num2;
			System.out.print(" "+fNum);
			num1=num2;
			num2=fNum;
			i++;
		}
	}

}
