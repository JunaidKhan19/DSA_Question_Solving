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


    }
}
