package week7_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SortCompaniesUsingList {

	//public static void main(String[] args) {
	
	@Test
	public void sortReverseCompList(){
		
		List<String> companies= new ArrayList<String>();
		
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
		
		System.out.println("Companies in insertion order->");
		System.out.println(companies);
		
		Collections.sort(companies);
		System.out.println("Companies in sorting order ->");
		System.out.println(companies);
		
		Collections.reverse(companies);
		System.out.println("Companies in reverse order ->");
		System.out.println(companies);
	

	}

}
