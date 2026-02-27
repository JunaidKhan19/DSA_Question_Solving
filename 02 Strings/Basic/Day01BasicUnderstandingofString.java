public class Day01BasicUnderstandingofString {
    public static void main(String[] args) {
        //Basic Level (Understanding and Traversal)
		//01 Count Length of String
		//Input: "hello" → Output: 5 (Without using .length())
		String str = "hello";
		int count = 0;
		try {
			while(true) {
				str.charAt(count);
				count++;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println(count);

		//02 Print Each Character of a String
		//Input: "java" → Output: j a v a
		String str2 = "java";
		int count2 = 0;
		try {
			while(true) {
				System.out.print(str2.charAt(count2) + " ");
				count2++;
			}
		} catch (Exception e) {
			e.getMessage();
		}

		//03 Count Vowels and Consonants
		//Input: "apple" → Output: Vowels: 2, Consonants: 3
		String str3 = "apple";
		int i = 0;
		int vowels = 0;
		try {
			while(true) {
				char ch = str3.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
						ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					vowels++;
				} 
				i++;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println("There are " + vowels + " vowels in the string");

		//better approach
		for (char c : str3.toLowerCase().toCharArray()) {
			if("aeiou".indexOf(c)!= -1) {
				vowels++;
			}
		}
		System.out.println("There are " + vowels + " vowels in the string");

		//04 Convert Lowercase to Uppercase (and vice versa)
		//Input: "JaVa" → Output: "jAvA" (Use ASCII values — 'A' to 'Z' and 'a' to 'z' ranges)
		String str4 = "JaVa";
		String result = "";
		int position = 0;
		try {
			while(true) {
				char ch = str4.charAt(position);
				if (ch >= 'A' && ch <= 'Z') {
					result += (char)(ch + 32); 
				} else if (ch >= 'a' && ch <= 'z') {
					result += (char)(ch - 32);
				}
				position++;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println(result);

		//05 Count Digits, Alphabets, and Special Characters
		//Input: "abc123@#" → Output: Alphabets: 3, Digits: 3, Specials: 2
		String str5 = "abc123@#";
		int index = 0;
		int characters = 0;
		int digits = 0;
		int specialCharacters = 0;
		try {
			while(true) {
				char ch = str5.charAt(index);
				if (ch>= '0' && ch <='9') {
					digits++;
				} else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
					characters++;
				} else {
					specialCharacters++;
				}
				index++;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println("Digits : " + digits);
		System.out.println("Alphabets : " + characters);
		System.out.println("Special characters : " + specialCharacters);
    }
}
