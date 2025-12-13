package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class SequentialSearch {
    
    static int sequential_search(int a[],int key){
		int i;
		for(i=0;i<a.length;i++){
			if(key==a[i]){
				 return i; //position where we found the data
			}
		}
		return -1;
	}

	
	public static void main(String[] args) {
		int[] numbers = {11, 9, 22, 5, 77, 33, 88, 33};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key:");
        int key = sc.nextInt();
        int response = sequential_search(numbers,key);
        if(response==-1)
            System.out.println(key+" not found");
        else
            System.out.println(key+" found at "+response+" in "+ Arrays.toString(numbers));

		sc.close();
	}
}
