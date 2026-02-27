public class Day06SearchingSorting {
    public static void main(String[] args) {
		//Level 8 Searching, Rotations, and Rearrangements
		// Find Element in Rotated Sorted Array (Binary Search)
        int[] array1 = {4, 5, 6, 7, 0, 1, 2};
		int target = 0;
		
		int low = 0, high = array1.length-1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			
			if (array1[mid] == target) {
				System.out.println("Found at index: " + mid);
				return;
			}
			
			if (array1[low] < array1[mid]) {
				if (target >= array1[low] && target < array1[mid]) {
		            high = mid - 1; // Search left
		        } else {
		            low = mid + 1;  // Search right
		        }
			} else {                                
		        if (target > array1[mid] && target <= array1[high]) {
		            low = mid + 1;  // Search right
		        } else {
		            high = mid - 1; // Search left
		        }
		    }
		}

		//35 Find the Rotation Count in Rotated Sorted Array
		int[] arr = {4, 5, 6, 1, 2, 3};
		int n = arr.length;

		int lowPosition = 0, highPosition = n - 1;
		int rotationCount = 0;

		while (lowPosition <= high) {
		    // If array already sorted → no rotation
		    if (arr[lowPosition] <= arr[highPosition]) {
		        rotationCount = lowPosition;
		        break;
		    }

		    int midPosition = lowPosition + (highPosition - lowPosition) / 2;
		    int next = (midPosition + 1) % n;
		    int prev = (midPosition - 1 + n) % n;

		    // Check if mid is the minimum (pivot)
		    if (arr[midPosition] <= arr[next] && arr[midPosition] <= arr[prev]) {
		        rotationCount = midPosition;
		        break;
		    }

		    // Decide search direction
		    if (arr[midPosition] >= arr[lowPosition]) {
		        // Left half sorted → pivot in right half
		        lowPosition = midPosition + 1;
		    } else {
		        // Right half sorted → pivot in left half
		        highPosition = midPosition - 1;
		    }
		}

		System.out.println("Rotation count = " + rotationCount);

		//36 Rearrange Array in Alternating Positive & Negative Order
		int[] array3 = {3, -2, -5, 6, -7, 4, 1, -9};
		int i = 0; //keep the index of negatives after the shifting
		int j = 0;
		//Shifting all positives to left and all negatives to right
		while (j < array3.length) {
			if (array3[j] >= 0) {
				int temp = array3[i];
				array3[i] = array3[j];
				array3[j] = temp;
				i++;
			}
			j++;
		}
		
		int currentPos = 0;
		int neg = i;
		
		while (currentPos < array3.length && neg < array3.length) {
			int temp = array3[currentPos];
			array3[currentPos] = array3[neg];
			array3[neg] = temp;
			currentPos += 2;
			neg++;			
		}
		
		for(int x: array3) {
			System.out.print(x + ",");
		}

//		//37 Rearrange Array so that arr[i] = i if possible
		int[] array4 = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		int l = array4.length;
		
		for (int a = 0; a < l; a++) {
			while (array4[a] != -1 && array4[a] != a) {
				int correctIndex = array4[a]; //where this number needs to go
				int temp = array4[a];
                array4[a] = array4[correctIndex];
                array4[correctIndex] = temp;
			}
		}
		for(int x: array4) {
			System.out.print(x + ",");
		}
    }
}
