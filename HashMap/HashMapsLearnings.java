package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapsLearnings {	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("apple", 1);
		map.put("mango", 2);
		map.put("orange", 3);
		
		System.out.println(map.get("apple"));
		
		boolean keyExists = map.containsKey("orange");
		System.out.println(keyExists);
		
		map.remove("mango");
		
		for(String key : map.keySet()) {
			System.out.println(key + " -> " + map.get(key));
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}

