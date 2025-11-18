import java.util.Arrays;

public class Day05TwoPointerAndSorting {
    public static void main(String[] args) {
		//Level 7 Two Pointer & Sorting Based
		//29 Pair Sum Problem – Two numbers that add up to target (optimized O(n log n)).
		int[] array1 = {1, 2, 8, 7, 3, 9, 6, 5, 4}; 
		int target = 10;
		Arrays.sort(array1); //O (n log n)
        //manual bubble sort has O(n^2)
//		for (int i = 0; i < array1.length - 1; i++) {
//			for (int j = 0; j < array1.length - 1 - i; j++) {
//				if (array1[j] > array1[j+1]) {
//					int temp = array1[j];
//					array1[j] = array1[j+1];
//					array1[j+1] = temp;
//				}
//			}
//		}
		
		int left = 0, right = array1.length-1;
		while (left < right) {
			int sum = array1[left] + array1[right];
			if (sum < target) {
				left++;
			} else if (sum > target) {
				right--;
			} else if (sum == target) {
				System.out.println(array1[left] + " + " + array1[right] + " = " + sum);
				left++;
				right--;
			}
		}

        //
    }
}
