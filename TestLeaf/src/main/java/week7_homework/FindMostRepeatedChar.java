package week7_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class FindMostRepeatedChar {

	public static void main(String[] args) {
		
	String str ="Cognizant";
		
		char[] allchars= str.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (char ch : allchars) {
		 
			if(!(map.containsKey(ch))){
				
				map.put(ch,1);
				//System.out.println("No of Occurences of a char->"+ch+ "---"+items.get(ch));
				
			}else{
				map.put(ch, map.get(ch)+1);
				System.out.println("No of Occurences of a char->"+ch+ "---"+map.get(ch));
			}   
		}
		
		System.out.println("Before sorting map by value "+map);
		
		List<Entry<Character, Integer>> list=new ArrayList<Entry<Character, Integer>>(map.entrySet());
		
		Collections.sort(list,new Comparator(){
			   public int compare(Object obj1, Object obj2){
			   return ((Comparable)((Map.Entry)(obj1))
					   .getValue())
					   .compareTo(((Map.Entry)(obj2))
					   .getValue()); 
			   }
			  });
		
		System.out.println("After sorting map by value "+list);
		
		System.out.println("Most repeated charecter and its no of occurences is "+list.get(list.size()-1));
			
	}

	
	
}
	
	

