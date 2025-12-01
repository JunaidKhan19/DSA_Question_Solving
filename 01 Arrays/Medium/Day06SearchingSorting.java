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

//		//35 Find the Rotation Count in Rotated Sorted Array
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

    }
}
