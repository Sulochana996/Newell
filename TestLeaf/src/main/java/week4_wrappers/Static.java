package week4_wrappers;


public class Static {
	
	static String Sting="eert";
	
	public static void main(String[] args){
		temp();
		
		
	}
	

	public static void temp(){
		
		money();
		Static obj = new Static();
		obj.bank();
		trimt();
	
		
		
		
	}
	
	public static int money(){
		int temp=45;	
		return temp;
	}
	
	public void bank(){
		System.out.println("Non Static menthod = RBS is top of Aon company");
		System.out.println("the variable of Static called in non static method "+Sting);
	}
	
		
		// TODO Auto-generated method stub
		
		
	public static void trimt(){
		System.out.println("Static method");
		
			
		}

	}


