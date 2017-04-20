package day1;

import java.util.Map;
import java.util.TreeMap;

public class DuplicateIncre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var="Paypal India";
	//	boolean dupli=false;
		
		char[] allChar=var.toCharArray();
				
		Map<Character, Integer> temp= new TreeMap<>();
		
		for (char increm : allChar) {
			
			if(temp.containsKey(allChar)){					
				System.out.println(" the char : "+temp.put(increm, temp.get(increm)+1));
					//		dupli=true;			
					}
			else {
				System.out.println("The value is not duplicate : "+temp.get(increm));
						
				}		
				
			}
			
		}
		
	}


