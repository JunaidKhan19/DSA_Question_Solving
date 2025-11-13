public class Day03MixOfLevel1_4 {
    public static void main(String[] args) {
        //Level 5 Mix of Level 1-4
        //21 Move all zeros to the end (preserving order).
		int[] numbers = {2, 3, 5, 0, 0, 8, 7, 0, 9};
		int temp = 0;
		for(int i = numbers.length-1; i > 0; i--) {
			for(int j = numbers.length-1; j > 0; j--) {
				if(numbers[j-1] == 0) {
					temp = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = temp;
				}
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ",");
		}

        //22 Rearrange positive and negative numbers alternately.
		int[] arrayNumbers = {-1, 2, -3, -4, 5, -9, 8, 7};
		int n = arrayNumbers.length;		
		int[] positives = new int[n];
		int[] negatives = new int[n];
        int p = 0, q = 0;
        
		for (int num: arrayNumbers) {
			if (num >= 0) {
				positives[p++] = num;
			} else {
				negatives[q++] = num;
			}
		}
		
		int i = 0, j = 0, k = 0;
		boolean track = true;
		
		while(i <  p && j < q) {
			if (track) {
				arrayNumbers[k++] = positives[i++];
			} else {
				arrayNumbers[k++] = negatives[j++];
			}
			track = !track;
		}
		
		while(i < p) {
			arrayNumbers[k++] = positives[i++];
		}
		while(j < q) {
			arrayNumbers[k++] = negatives[j++];
		}

		for (int nums : arrayNumbers) {
			System.out.println(nums);
		}		
        
        //23 Find the intersection of two arrays.
		int[] arr1 = {2, 3, 5, 8, 7, 0, 9};
		int[] arr2 = {4, 3, 1, 8, 7, 10};
		int a = 0, b = 0;
		System.out.println("the intersection Between both arrays are");
		for(a = 0; a < arr1.length; a++) {
			for(b = 0; b < arr2.length; b++) {
				if (arr1[a] == arr2[b]) {
					System.out.print(arr2[b]+ ",");
				}
			}
		}

        //24 Find union of two arrays (no duplicates).
		int[] arr3 = {2, 3, 5, 8, 7, 0, 9};
		int[] arr4 = {4, 3, 1, 8, 7, 10};
		
        for (int x = 0; x < arr3.length - 1; x++) {
            for (int z = 0; z < arr3.length - 1 - x; z++) {
                if (arr3[z] > arr3[z + 1]) {
                    int temp2 = arr3[z];
                    arr3[z] = arr3[z + 1];
                    arr3[z + 1] = temp2;
                }
            }
        }

        for (int d = 0; d < arr4.length - 1; d++) {
            for (int e = 0; e < arr4.length - 1 - d; e++) {
                if (arr4[e] > arr4[e + 1]) {
                    int temp1 = arr4[e];
                    arr4[e] = arr4[e + 1];
                    arr4[e + 1] = temp1;
                }
            }
        }

		int a2 = 0, b2 = 0;
		while(a < arr3.length && b < arr4.length) {
			if(arr3[a2] < arr4[b2]) {
				System.out.print(arr3[a2] + " ");
				a2++;
			} else if(arr3[a2] < arr4[b2]) {
				System.out.print(arr3[b2] + " ");
				b2++;
			} else {
                // Both are equal → print one and move both
                System.out.print(arr3[a2] + " ");
                a2++;
                b2++;
            }
		}
		
        while (a < arr3.length) {
            System.out.print(arr3[a] + " ");
            a++;
        }

        while (b < arr4.length) {
            System.out.print(arr4[b] + " ");
            b++;
        }
		
        //25 Find majority element (> n/2 occurrences).
        //Boyer–Moore Voting Algorithm
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        int n2 = arr.length;
        
        int candidate = arr[0];
        int count = 1;
        
        for (int iterate = 0; iterate < n2; iterate++) {
        	if(arr[iterate] == candidate) {
        		count++;
        	} else {
        		count--;
        	}
        	
        	if(count == 0) {
        		candidate = arr[iterate];
        		count = 1;
        	}
        }
        
        int frequency = 0;
        for (int num : arr) {
        	if(num == candidate) {
        		frequency++;
        	}
        }
        
        if (frequency > n2/2)
            System.out.println("Majority element: " + candidate);
        else
            System.out.println("No majority element");
	
    }
}
