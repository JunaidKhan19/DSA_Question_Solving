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
		
        
        //23 Find the intersection of two arrays.
		int[] arr1 = {2, 3, 5, 8, 7, 0, 9};
		int[] arr2 = {4, 3, 1, 8, 7, 10};
		int i = 0, j = 0, k = 0;
		System.out.println("the intersection Between both arrays are");
		for(i = 0; i < arr1.length; i++) {
			for(j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr2[j]+ ",");
				}
			}
		}


    }
}
