import java.util.Arrays;

public class Day05TwoPointerAndSorting {
    public static void main(String[] args) {
		//Level 7 Two Pointer & Sorting Based
		//29 Pair Sum Problem – Two numbers that add up to target (optimized O(n log n)).
		int[] array1 = {1, 2, 8, 7, 3, 9, 6, 5, 4}; 
		int target = 10;
		Arrays.sort(array1); //O (n log n)
		/*
        //manual bubble sort has O(n^2)
		for (int i = 0; i < array1.length - 1; i++) {
			for (int j = 0; j < array1.length - 1 - i; j++) {
				if (array1[j] > array1[j+1]) {
					int temp = array1[j];
					array1[j] = array1[j+1];
					array1[j+1] = temp;
				}
			}
		}
		*/
		
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

	    //30 Triplet Sum Problem (already done, but do again for unique + sorted).
		int[] array2 = {1, 2, 8, 7, 3, 9, 6, 5, 4};
		int target2 = 13;
		Arrays.sort(array2);
		for(int i = 0; i < array2.length-2; i++) {
			int leftp = i + 1;
			int rightp = array2.length - 1;
			
			while(leftp < rightp) {
				int sum = array2[i] + array2[leftp] + array2[rightp];
				
				if(sum == target2) {
					System.out.println(array2[i] + ", " + array2[leftp] + ", " + array2[rightp]);
					leftp++;
					rightp--;
				} else if(sum < target2) {
					leftp++;
				} else rightp--;
			}
		}

		//31 Move All Zeros to End (without using another array)
		int[] array3 = {5, 0, 0 ,3, 0, 6, 4, 0, 8}; 
		int pos = 0;
		for(int i = 0; i < array3.length; i++) {
			if (array3[i] != 0) {
				int temp = array3[i];
				array3[i] = array3[pos];
				array3[pos] = temp;
				pos++;
			}
		}
		
		for(int i = 0; i < array3.length; i++) {
			System.out.print(array3[i]);
		}

//		//32 Sort 0s, 1s, 2s (Dutch National Flag Algorithm)
		int[] array4 = {2, 0, 1, 2, 1, 0, 0, 2, 1};
		int low = 0, mid = 0, high = array3.length-1;
		
		while(mid <= high) {
			switch(array4[mid]) {
			case 0:
				int tempfor1 = array4[mid];
				array4[mid] = array4[low];
				array4[low] = tempfor1;
				mid++;
				low++;
				break;
			case 1:
				mid++;
				break;
			case 2: 
				int tempfor2 = array4[mid];
				array4[mid] = array4[high];
				array4[high] = tempfor2;
				high--;
				break;
			}
		}
		
		for(int i = 0; i < array4.length; i++) {
			System.out.print(array4[i]);
		}
		

    }
}
