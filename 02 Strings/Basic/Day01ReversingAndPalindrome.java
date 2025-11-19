public class Day01ReversingAndPalindrome {
    public static void main(String[] args) {
        //Level 2: Reversing & Palindrome Concepts
		//06 Reverse a String
		//Input: "abcd" → Output: "dcba"
		String str6 = "abcd";
		String reversed = "";
		int i = 0;
		try {
			while (true) {
				char ch = str6.charAt(i);
				reversed = ch + reversed; //prepend in the reversed string 
				i++;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println(reversed);

		//07 Check if a String is Palindrome
		//Input: "madam" → Output: true
		String str7 = "madam";
		boolean isPalindrome = true;
		int count = 0;
		int itr = 0;
		try {
			while(true) {
				str7.charAt(count);
				count++;
			}
		} catch (Exception e) {
			count--;
		}
		
		while (itr < count) {
			if (str7.charAt(itr) != str7.charAt(count)) {
				isPalindrome = false;
				break;
			}
			itr++;
			count--;
		}
		
		System.out.println(isPalindrome ? "Yes it is palindrome": "No it is not a palindrome");

		//08 Count Number of Words
		//Input: "I love coding" → Output: 3 (Assume words are separated by a single space)
		String str8 = "I love coding";
		int x = 0, countSpace = 0; 
		try {
			while(true) {
				if(str8.charAt(x) == ' ') {
					countSpace++;
				}
				x++;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		countSpace += 1;//The count of space is 1 less than words eg: 2 words 1 space
		System.out.println("Words : " + countSpace);

		//09 Reverse Each Word in a Sentence
		//Input: "I love Java" → Output: "I evol avaJ"
		String str9 = "I love Java";
		String reverseWord = "";
		String reversedString = "";
		int k = 0;
		try {
			while (true) {
				char ch = str9.charAt(k);
				if (ch != ' ') {
					reverseWord = ch + reverseWord;
				} else if (ch == ' ') {
					reversedString += reverseWord + " ";
					reverseWord = "";
				}
				k++;
			}
		} catch (Exception e) {
			// append the last reversed word when the loop ends
		    reversedString = reversedString + reverseWord;
		}
		
		System.out.println(reversedString);


    }
}
