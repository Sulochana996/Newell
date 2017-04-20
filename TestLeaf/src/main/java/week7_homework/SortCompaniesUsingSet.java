package week7_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SortCompaniesUsingSet {

	//public static void main(String[] args) {
	
	@Test
	public void sortReverseCompSet(){
		
		Set<String> companies= new TreeSet<String>();
		
		companies.add("TCS");
		companies.add("Cognizant");
		companies.add("Hexaware");
		companies.add("Infosys");
		companies.add("Virtusa");
		companies.add("Testleaf");
		companies.add("Hcl");
		companies.add("Zohoo");
		companies.add("Google");
		companies.add("Paypal");
		companies.add("Welgros");
		companies.add("Dell");
		companies.add("Yahoo");
		companies.add("Emphasis");
		companies.add("Boa");
		companies.add("Barclays");
		companies.add("SBI");
		companies.add("Hdfc");
		companies.add("Infotech");
		companies.add("Amazon");
		
		System.out.println("Companies in Ascii order before reversing ->");
		System.out.println(companies);
		
		List<String> list = new ArrayList<String>(companies);
		
		Collections.reverse(list);
		System.out.println("Companies in reverse order ->");
		System.out.println(list);
		
		

	}

}
