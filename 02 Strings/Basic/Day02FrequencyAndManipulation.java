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
    }    
}