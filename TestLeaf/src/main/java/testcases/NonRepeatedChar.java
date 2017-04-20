package testcases;

import java.util.LinkedHashSet;
import java.util.Set;

public class NonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findFirstNonRepeatedChar("testleaf"));

	}
	public static Set findFirstNonRepeatedChar(String str) {
		Set chSet = new LinkedHashSet();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
		if (!chSet.add(charArray[i])) {
		chSet.remove(charArray[i]);
		
		}
		
		}
		if (chSet.isEmpty())
		return null;
		else
		return chSet;
		}

}
