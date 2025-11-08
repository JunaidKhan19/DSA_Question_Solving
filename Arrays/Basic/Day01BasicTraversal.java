public class Day01BasicTraversal{

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		//Level 1: Basic Traversal & Input/Output
		//01 Print all elements of an array
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ",");
		}

		//02 Find the maximum and minimum element in an array
		int max = 0;
		int min = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < max && numbers[i] < min) {
				min = numbers[i];
			} else if(numbers[i] > min && numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("min: " + min);
		System.out.println("max: " + max);

		//03 Find the sum and average of all elements in an array
		int sum = 0; 
		float average = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		average = (float)sum/numbers.length;
		System.out.println("sum :" + sum);
		System.out.println("average :" + average);

		//04 Count the number of even and odd elements in an array
		int odd = 0, even = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i]%2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
		}
		System.out.println("odd numbers: " + odd);
		System.out.println("even numbers: " + even);

		//05 Search for an element in an array (Linear Search)
		int searchNum = 7;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == searchNum) {
				System.out.println("number " + searchNum + " exist at index " + i);
			} else continue;
		}
	}
}
