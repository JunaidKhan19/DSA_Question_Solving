public class Day01ManipulationAndUpdating {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
		//Level 2: Manipulation & Updating
		//06 Reverse an array (in-place)
		//Swap first and last, second and second-last, and so on.
		for(int i = 0; i <= numbers.length/2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length-1-i];
			numbers[numbers.length-1-i] = temp;
		}
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ",");
		}

		//07 Copy elements of one array to another
		//Without using clone() or System.arraycopy().
		int[] copyArray = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			copyArray[i] = numbers[i];
			System.out.print(copyArray[i] + ",");
		}

		//08 Insert an element at a first position
		//Shift elements manually to the right.
		int insertNum = 0; //position 1 (index 0)
		int[] newArray = new int[numbers.length+1];
		newArray[0] = insertNum;
		for(int i = 1; i < newArray.length; i++) {
			newArray[i] = numbers[i-1];
		}
		for(int i = 0; i < newArray.length; i++) {
		    System.out.print(newArray[i] + ",");
	    }
		
		//08.2 Insert an element at a specific position 
		int insertNum2 = 65,  position = 5;// (index 4)
		int[] newArray2 = new int[newArray.length+1];
		for(int i = 0; i < position; i++) {
			newArray2[i] = newArray[i];
		}
		newArray2[position] = insertNum2;
		for(int i = position+1; i < newArray2.length; i++) {
			newArray2[i] = newArray[i-1];
		}
		for(int i = 0; i < newArray2.length; i++) {
		    System.out.print(newArray2[i] + ",");
	    }

		//09 Delete an element at a specific position
		//Shift elements left to fill the gap.
		int position2 = 5;
		for(int i = position2-1; i < numbers.length-1; i++) {
			numbers[i] = numbers[i+1];
		}
		numbers[numbers.length-1] = 0;
		for(int i = 0; i < numbers.length; i++) {
		    System.out.print(numbers[i] + ",");
		}

		//10 Count frequency of each element
		//Use nested loops (avoid HashMap).
		int[] nums = {1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 2, 5, 3};
		int[] countList = new int[6];
		int count = 0;
		for(int i = 0; i < countList.length; i++) {
			for(int j = 0; j < nums.length;j++) {
				if(i == nums[j]) count++;
				else continue;
			}
			countList[i] = count;
			count = 0;
		}
		for(int i = 0; i < countList.length; i++) {
			System.out.println(i + " : " + countList[i]);
		}
	}
}
