import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day02FrequencyAndManipulation {
    public static void main(String[] args) {
        //Character Frequency & Manipulation
		//11 Count Frequency of Each Character
		//Input: "banana" → Output: b=1, a=3, n=2
		String str11 = "banana";
		boolean[] visited = new boolean[str11.length()];
		for(int i = 0; i < str11.length(); i++) {
		    if(visited[i]) continue;

		    int count = 1;
		    for(int j = i + 1; j < str11.length(); j++) {
		        if(str11.charAt(i) == str11.charAt(j)) {
		            count++;
		            visited[j] = true;
		        }
		    }
		    System.out.println(str11.charAt(i) + " = " + count);
		}

		//12 Sort characters by frequency (using HashMap)
		//Input: "banana" → Output: anb
		String str12 = "banana";
		HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
		
		for(char ch : str12.toCharArray()) {
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0)+1);
		}
		
		List<Map.Entry<Character, Integer>> list = new ArrayList<>(frequencyMap.entrySet());
		
		list.sort((a, b) -> b.getValue() - a.getValue());
		
		StringBuilder result = new StringBuilder();
		
		for(Map.Entry<Character, Integer> entry : list) {
			result.append(entry.getKey());
		}
		
		System.out.println(result);

        //13 Remove Duplicates from String
		//Input: "programming" → Output: "progamin"
		String str13 = "programming";
		String nonDuplicates = "";
		for(int i = 0; i < str13.length(); i++) {
			char ch = str13.charAt(i);
			boolean found = false;
			for(int j = 0; j < nonDuplicates.length(); j++) {
				if(ch == nonDuplicates.charAt(j)) {
					found = true;
					break;
				} 				
			}
			if(!found) nonDuplicates += ch;
		}
		System.out.println(nonDuplicates);
		
		//14 Find First Non-Repeated Character
		//Input: "aabbcddde" → Output: c
		String str14 = "aabbcddde";
		char results = '\0';
		for(int i = 0; i < str14.length(); i++) {
			char ch = str14.charAt(i);
			boolean repeated = false;
		    for (int j = 0; j < str14.length(); j++) {
		        if (i != j && ch == str14.charAt(j)) {
		        	repeated = true;
		            break;
		        }
		    }
	        if(!repeated) {
	        	results = ch;
	        	break;
	        }
		}
		
		if (results != '\0')
		    System.out.println("First non-repeated char = " + result);
		else
		    System.out.println("No unique character found");

		//15 Check if Two Strings are Anagrams
		//Input: "listen", "silent" → Output: true (You’ll need to compare character counts manually)
		String str15 = "listen";
		String strGiven = "silent";

		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		
		if(str15.length() == strGiven.length()) {
			for(char ch : str15.toCharArray()) {
				countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
			}
			
			for(char ch : strGiven.toCharArray()) {
				if(!countMap.containsKey(ch)) {
					System.out.println("not an anagram");
				}
				
				countMap.put(ch, countMap.get(ch)-1);
				
				if(countMap.get(ch) == 0) {
					countMap.remove(ch);
				}
			}
			
			if(countMap.isEmpty()) System.out.println("The strings are anagram");
			else System.out.println("Strings are not an anagram");
		} else {
			System.out.println("Strings are not an anagram");
		}

		//16 Count Occurrences of a Substring (manual search using sliding window)
		//Input: "abababa", substring = "aba" → Output: 3
		String str16 = "abababa";
		String substring = "aba";
		int main = str16.length();
		int sub = substring.length();
		int count = 0;
		for(int i = 0; i <= main-sub; i++) {
			int j = 0;
			while(j < sub && str16.charAt(i+j)== substring.charAt(j)) {
				j++;
			}
			
			if (j == sub) {
				count++;
			}
		}
		
		System.out.println(count);

		//17 Highest occurring character (using Hashmap)
		//Input: "banana" → 'a'
		String str17 = "banana"; 
		HashMap<Character, Integer> cmap = new HashMap<Character, Integer>(); 
		for(char c: str17.toCharArray()) {
			cmap.put(c, cmap.getOrDefault(c, 0)+1);
		}
		
		int maxCount = 0;
		char maxChar = ' ';
		
		for(Map.Entry<Character, Integer> entry: cmap.entrySet()) {
			if(entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}
		}
		System.out.println(maxChar);
		
		//18 Print all non-repeating characters
		//Input: "successfull" -> "ef"
		String str18 = "successfull";
		HashMap<Character, Integer> nmap = new HashMap<Character, Integer>();
		for(char c: str18.toCharArray()) {
			nmap.put(c, nmap.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry: nmap.entrySet()) {
			if(entry.getValue() < 2) {
				System.out.print(entry.getKey());
			}
		}

		//19 Find second non-repeating character
		//Input: "successfull" -> "f"
		String str19 = "successfull";
		HashMap<Character, Integer> snmap = new HashMap<Character, Integer>();
		for(char c: str19.toCharArray()) {
			snmap.put(c, snmap.getOrDefault(c, 0)+1);
		}
		int counter = 0;
		for(char c: str19.toCharArray()) {
			if(snmap.get(c) == 1) {
				counter++;
			}
			
			if(counter == 2) {
				System.out.println("the second non repeating character is : " + c);
				break;
			}
		}

		//20 Remove All Occurrences of a Character
		//Input: "programming", remove 'm' → Output: "prograing"
		String str20 = "programming";
		char removeChar = 'm';
		String newstr = "";
		for(char c: str20.toCharArray()) {
			if(c != removeChar) {
				newstr += c;
			}
		}		
		System.out.println(newstr);

    }    
}