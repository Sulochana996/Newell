package day1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int i;
				int n=13;     
				for(i=2;i<n;i++){    
					if(n%i==0){    
						System.out.println("Not A Prime Number");      
						break;  
					}  
					else if(i==n-1)
						System.out.println("Prime Number");
				}       
			}
}


	
