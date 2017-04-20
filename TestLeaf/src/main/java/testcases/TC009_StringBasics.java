package testcases;

public class TC009_StringBasics {

	public static void main(String[] args) {
		
		String str= "FGTS (10056)";
		
		System.out.println("Lead ID us :::--->"+str.substring(str.indexOf("(")+1,str.indexOf(")")));
		
		str.replaceAll("\\D", "");
        String str2="TestLeaf";
        
        //String [] str3=str2.split("");
        //System.out.println(str3.length);
        //char revStr=str2.charAt(str2.length()-1);
        for(int i=(str2.length()-1);i>=0;i--){
        
        	//revStr=str2.charAt(i);
        	 System.out.println("Final revere string "+str2.charAt(i));
             
        	 
        	
             	
        }
        
      
        
        
	}

}
