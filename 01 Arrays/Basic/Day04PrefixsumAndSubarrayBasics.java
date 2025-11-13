public class Day04PrefixsumAndSubarrayBasics {
    public static void main(String[] args) {
        //Level 6 Prefix Sum and Subarray Basics
		//26 Prefix Sum Array → Compute prefix sum without using library functions.
		int[] array1 = {2, 4, 8, 6, 10};
		int[] prefixSum = new int[array1.length];
		prefixSum[0] = array1[0];
		for(int i = 1; i < array1.length; i++) {
			prefixSum[i] = prefixSum[i-1] + array1[i];
		}
		
		for (int num: prefixSum) {
			System.out.println(num);
		}

		//27 Find Subarray with Given Sum (Positive Numbers) – Sliding window.
        int[] array2 = {1, 2, 3, 4, 5, 9, 8, 7};
        int givenSum = 18;

        int start = 0, sum = 0;
        boolean found = false;

        for (int end = 0; end < array2.length; end++) {
            sum += array2[end];

            while (sum > givenSum && start <= end) {
                sum -= array2[start];
                start++;
            }

            if (sum == givenSum) {
                System.out.print("Subarray found: ");
                for (int i = start; i <= end; i++) {
                    System.out.print(array2[i] + " ");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No subarray with given sum found.");
        }


    }
}
