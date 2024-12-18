import java.util.HashMap;

public class MainClass {

public static void main(String[] args) { 
	
	HashMap<String, Integer> prices = new HashMap<>();

 prices.put("Shoes", 180); prices.merge("shirt", 100, (oldvalue, newvalue) -> oldvalue + newvalue); System.out.println("NashMap;" + prices);

prices.put("Bag", 300);

prices.put("Pant", 150);

}

}