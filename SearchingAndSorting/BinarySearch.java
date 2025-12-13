package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    
    static int binary_search(int a[], int start, int end, int key){
		 if(start <= end) { //for searching
	           int mid=(start+end)/2;
	           if(key == a[mid])//found go
	               return mid;
	           else { //search either side
	               if(key < a[mid])
	                   return binary_search(a, start, mid-1, key); //left half
	               else
	                   return binary_search(a, mid+1, end, key); //left half
	           }
		 } else return -1; // when start > end
	}

	public static void main(String[] args) {
		int[] numbers = {11,22,33,44,55,66,77,88,99};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key:");
        int key = sc.nextInt();
        int response = binary_search(numbers, 0, numbers.length-1, key);
        if(response==-1)
            System.out.println(key+" not found");
        else
            System.out.println(key+" found at "+response+" in "+ Arrays.toString(numbers));

		sc.close();
	}
}
