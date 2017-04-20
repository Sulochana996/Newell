package testcases;

import java.util.HashMap;
import java.util.Map;

public class FindOccurces {

	public static void main(String[] args) {
		
		String str ="Paypal India";
		
		char[] allchars= str.toCharArray();
		
		Map<Character, Integer> items = new HashMap<Character, Integer>();
		
		
		for (char ch : allchars) {
		 
			if(!(items.containsKey(ch))){
				
				items.put(ch,1);
				System.out.println("No of Occurences of a char->"+ch+ "---"+items.get(ch));
				
			}else{
				items.put(ch, items.get(ch)+1);
				System.out.println("No of Occurences of a char->"+ch+ "---"+items.get(ch));
				
			}   
			
			
		}
		

	}

}
