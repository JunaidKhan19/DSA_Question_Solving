public class Day01BasicPatternAndLogic {
    public static void main(String[] args) {
        int[] numbers = {25, 40, 33, 1, 28, 99, 74, 45, 82, 66};

        //Level 3: Pattern & Logic Building
        //11 Find the second largest and second smallest elements
        //Without sorting the array.
        int min = numbers[0], max = 0, secondMin = numbers[0], secondMax = 0, mid = 0;
        for (int i = 0; i < numbers.length; i++) {
        	if (numbers[i] > min && numbers[i] > max) {
        		max = numbers[i];
        	} else if(numbers[i] < min && numbers[i] < max) {
        		min = numbers[i];
        	} else if (numbers[i] > min && numbers[i] < mid && numbers[i] < secondMin) {
        		secondMin = numbers[i];
        	} else if (numbers[i] > mid && numbers[i] < max && numbers[i] > secondMax) {
        		secondMax = numbers[i];
        	} else if(numbers[i] > min && numbers[i] < max) {
        		mid = numbers[i];
        	} 
        }
        
        System.out.println("min :" + min);
        System.out.println("second smallest :" + secondMin);
        System.out.println("max :"+ max);
        System.out.println("second largest :" + secondMax);

        //12 Check if the array is sorted (ascending or descending)
        //int[] numbers2 = {25, 40, 33, 1, 28, 99, 74, 45, 82, 66, 2};
        //int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] numbers2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        boolean ascending = true, descending = true;
        for(int i = 0; i < numbers2.length-1; i++) {
            if(numbers2[i] > numbers2[i+1]) {
                ascending = false;
            } else if(numbers2[i] < numbers2[i+1]) {
                descending = false;
            }
        }
        
        if (ascending) {
            System.out.println("array is sorted in ascending order");
        } else if(descending) {
            System.out.println("array is sorted in descending order");
        } else {
            System.out.println("Not in order");
        }

        //13 Rotate the array by one position (left/right)
        //Practice shifting manually.
        int temp = 0;
        for(int i = 0; i < numbers.length-1; i++) {
        	temp = numbers[i];
        	numbers[i] = numbers[i+1];
        	numbers[i+1] = temp;
        }
        System.out.println("right-shifted: ");
        for(int i = 0; i < numbers.length; i++) {
        	System.out.print(numbers[i] + ",");
        }
        
        for(int i = numbers.length-1; i > 0 ; i--) {
        	temp = numbers[i];
        	numbers[i] = numbers[i-1];
        	numbers[i-1] = temp;
        }
        System.out.println("\nleft-shifted: ");
        for(int i = 0; i < numbers.length; i++) {
        	System.out.print(numbers[i] + ",");
        }

        //14 Rotate the array by ‘k’ positions without using temp arrays if possible.
        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 4;
        int n = numbers3.length;
        //if k = n then no rotation required hence mod gives actual rotation in case k > n. 
        if(k > n) {
        	k = k % n; 
        }
        for(int i = 0; i < k; i++) {
        	int temp1 = numbers3[n-1];
        	for(int j = n-1; j > 0; j--) {
        		numbers3[j] = numbers3[j-1];
        	}
        	numbers3[0] = temp1;
        }
	    for(int i = 0; i < numbers3.length; i++) {
	    	System.out.print(numbers3[i] + ",");
		}

        //way 2: Cycle Replacement Algorithm (optimal solution)
        int k1 = 3, temp1 = 0, count = 0;
        int n1 = numbers.length;
        k1 = k1 % n;
        for(int start = 0; count < n1; start++) {
        	int current = start;
        	int prev = numbers[start]; //2nd temp-variable to store the number at next on every swap
        	do {
        		//current + 3 = next 
        		//when next position exceeds the array length it counts remaining from start
        		int next = (current + k1) % n; 
        		
        		temp1 = numbers[next];
        		numbers[next] = prev;
        		prev = temp1;
        		
        		current = next;
        		count++;
        	} while(current != start);
        }     
        
        for(int i = 0; i < n1; i++) {
        	System.out.print(numbers[i] + ",");
        }
        
        //15. Find all pairs of elements whose sum equals a given number
        //Classic nested loop problem.
        int given = 75;
        for(int i = 0; i < numbers.length-2; i++) {
        	for(int j = 0; j < numbers.length; j++) {
        		if(numbers[i]+numbers[j] == given) {
        			System.out.println(numbers[i]+ ","+ numbers[j]);
        		}
        	}
        }
    }
}
