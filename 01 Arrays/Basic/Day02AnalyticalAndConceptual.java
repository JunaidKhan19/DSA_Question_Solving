public class Day02AnalyticalAndConceptual {
    public static void main(String[] args) {
        //Level 4: Analytical & Conceptual    
		//16 Remove duplicate elements from an array        
		//Without using extra array at first, then try with one.
		int[] arr = {1, 2, 2, 3, 4, 5, 5, 5, 6};
		int n = arr.length;
        for(int i = 0; i < n; i++) {
        	for(int j = i+1; j < n;) {
    	        if (arr[i] == arr[j]) {
    	            for (int k = j; k < n - 1; k++) {
    	                arr[k] = arr[k + 1];
    	            }
    	            n--; 
    	        } else {
    	        	j++;
    	        }
        	 }
        }
        for(int i = 0; i < n; i++) {
        	System.out.print(arr[i] + ",");
        }

		//17 Merge two sorted arrays into a single sorted array
		int[] sorted1 = {1, 2, 3, 4, 6};
		int[] sorted2 = {5, 7, 8, 9};

		int n1 = sorted1.length + sorted2.length;
		int[] merged = new int[n];

		int index = 0;

		for (int i = 0; i < sorted1.length; i++) {
		    merged[index++] = sorted1[i];
		}

		for (int i = 0; i < sorted2.length; i++) {
		    merged[index++] = sorted2[i];
		}

		for (int i = 0; i < n1-1; i++) {
		    if(merged[i] > merged[i+1]) {
		    	int temp2 = merged[i+1];
		    	merged[i+1] = merged[i];
		    	merged[i] = temp2;
		    }
		}
		
		for (int i = 0; i < merged.length; i++) {
			System.out.print(merged[i] + ",");
		}	

		//18 Find the missing number in a sequence (1 to n)
		//Use sum formula or XOR method (no inbuilt functions).
		int[] arrayNumber = {1, 2, 3, 4, 6};
		int n3 = 6;
		int xorResult = 0;
		for (int i = 0; i <= n3; i++) {
			xorResult ^= i; 
		}
		for(int num : arrayNumber) {
			xorResult ^= num;
		}
		
		System.out.println("the missing number is: " + xorResult);

		//19 Find the number of occurrences of each element
		//Requires nested loops; later you can optimize using maps.
		int[] repeatedNums = {1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 2, 5, 3};
		int count = 0;
		for(int i = 0; i <= 5; i++) {
			for (int j = 0; j < repeatedNums.length; j++) {
				if(repeatedNums[j] == i) {
					count++;
				}
			}
			System.out.println(i + " = " + count);
			count = 0;
		}

		//20 Find the contiguous subarray with maximum sum (Kadane’s Algorithm)
		//Slightly advanced but must-learn — builds intuition for DP and optimization.
		/*Add current element to sum. 
		 * Update max whenever sum exceeds it.
		 * Reset sum when it drops to ≤ 0.
		 */
        int[] randomNums = {1, 2, 3, -5, 7, 2, -1, 3, -8, -20};
        int sum = 0, max = Integer.MIN_VALUE, start = 0, end = 0;
        for(int i = 0; i < randomNums.length; i++) {
        	sum += randomNums[i];
    		if(max < sum) {
    			max = sum;
    			end = i;
    		}
        	if (sum <= 0) {
        		sum = 0;
        		start = i;
        		end = i;
        	}
        }
        
        System.out.println(max);
    }
}
