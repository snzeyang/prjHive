import java.util.*;
public class Bankaccount {
	static HashMap<String, Double> account = new HashMap<String, Double>();
	public static void main(String[] args) {
		
		//Create a hash map object
		
		//Put element into the map
		account.put("Daniele", 15000.00);
		account.put("Sylvain", 200000.00);
		account.put("Roy", 25000.00);
		
		//Get set of entry
		
		Set<Map.Entry<String, Double>> list = account.entrySet();
		
		//Display the set
		
		for(Map.Entry<String, Double> elt:list)
			System.out.println(elt.getKey() + " : " + elt.getValue());
		
		//Deposit money in Daniele's account
		
		Double balance = account.get("Daniele");
		account.put("Daniele", balance + 50000.00);
		
		//Get Daniele's new account balance
		
		System.out.println("Daniele new balance: " + account.get("Daniele"));
		
	}

}
