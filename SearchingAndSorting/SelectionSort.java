package SearchingAndSorting;

import java.util.Arrays;

public class SelectionSort {
    
    static void selection_sort(int a[]){
        int i,j,min,min_position;
        for(i=0;i<a.length-1;i++)//passes n-1 9,8,7,6,5,4,3,2,1,0(stop)
        {
            //build ref and will use as temp
            min=a[i];
            min_position = i;
            for(j=i+1;j<a.length;j++)//Loop will search for minimum.
            {
                if(a[j]<min)
                {
                   min=a[j]; // storing the value of minimum 
                   min_position=j; //storing the position of minimum
                }
            }
            //swap
            a[min_position] = a[i]; // overwriting value at min-position with value at i or "current"
            a[i] = min; // overwriting value at current position with value stored in min 
        }

    }
	
	public static void main(String[] args) {
	    // int a[]={44,22,99,88,33,66,55,11,77};
        int a[]={11,22,33,44,55,66,77,88,99};
        System.out.println("\nStart before sorting:" + Arrays.toString(a));
        selection_sort(a);
        System.out.println("\nAfter sorting:" + Arrays.toString(a));
	}
}
