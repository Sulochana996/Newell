package testcases;

public class StringLearning {
	
	public static void main(String[] args) {
		
		//write a java program to remove  all white spaces  from a string?
		//Using \s+  regex regular expression all white space between words can be removed.
		//As per Java regular expressions, the  + means "one or more times" and \s means "a space".
		String str = "      Hi this is Gouthami From TestLeaf MARCH 4th Batch   ";
		System.out.println("After removing all white space ->"+str.replaceAll("\\s+",""));
		
		//trim() method can remove white space from beginning and end of String in Java
		String strWhiteSpace = "     This String contains White Space at beginning and end and middle    ";
		System.out.println("String after removing white space from beginning and end -->"+strWhiteSpace.trim());
        
		//write a java program  to count the total number of occurences of a given charecter in a string  without using a loop?
		String str2="Welcome to TestLeaf";
		int charCount = str2.length() - str2.replaceAll("e", "").length();
	    System.out.println("Total number of occurences of a given charecter "+charCount);
	    
	    System.out.println("==============================================================");
	    //How to check a string contains only string? i.e aplahebets or letters
	    //As per Java regular expressions, the  + means "one or more times" and [a-zA-Z] means "if a string has only alaphabets".
	    System.out.println("String strictly contains only string? "+"12344567".matches("[a-zA-Z]+"));
	    System.out.println("String strictly contains only string? "+"Gouthami".matches("[a-zA-Z]+"));
	    System.out.println("String strictly contains only string? "+"GOUTHAMI".matches("[a-zA-Z]+"));
	    System.out.println("String strictly contains only string? "+"gouthami423".matches("[a-zA-Z]+"));
	    System.out.println("String strictly contains only string? "+"234Gouthami".matches("[a-zA-Z]+"));
	    
	    //check a string contains only digits
	    //As per Java regular expressions, the  + means "one or more times" and \d means "a digit".
	    System.out.println("String contains only digits? "+"12344567".matches("\\d+"));
	    System.out.println("String contains only digits? "+"12344ABC".matches("\\d+"));
	    System.out.println("String contains only digits? "+"123abv123".matches("\\d+"));
	    
	      
	    System.out.println("==============================================================");
	    //check a string contains strings i.e given string may have digits,alhabets.
	    //As per Java regular expressions, the  + means "one or more times" and [a-zA-Z] means "if a string has only alaphabets".
	    //.* = . means any charecter,the star means match zero or more times
	    System.out.println("String contains string? "+"12344567".matches(".*[a-zA-Z]+.*"));
	    System.out.println("String contains string? "+"Gouthami".matches(".*[a-zA-Z]+.*"));
	    System.out.println("String contains string? "+"Gouthami423".matches(".*[a-zA-Z]+.*"));
	    System.out.println("String contains string? "+"234Gouthami423".matches(".*[a-zA-Z]+.*"));
	   
		

				
	}

}
