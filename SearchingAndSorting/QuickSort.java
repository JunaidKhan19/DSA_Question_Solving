package SearchingAndSorting;

import java.util.Arrays;

public class QuickSort {
    
  	static void quick_sort(int[] a, int low, int high) {
	    if (low < high) {
	        int p = partition(a, low, high);
	        quick_sort(a, low, p - 1);
	        quick_sort(a, p + 1, high);
	    }
	}

	static int partition(int[] a, int low, int high) {
	    int pivot = a[low];
	    int i = low + 1;
	    int j = high;

	    while (i <= j) {
	        while (i <= high && a[i] <= pivot) i++;
	        while (a[j] > pivot) j--;

	        if (i < j) {
	            int temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	        }
	    }

	    a[low] = a[j];
	    a[j] = pivot;

	    return j;
	}
    
	public static void main(String[] args) {
	    int a[]={44,22,99,88,33,66,55,11,77};
        //int a[]={11,22,33,44,55,66,77,88,99};
        System.out.println("\nStart before sorting:" + Arrays.toString(a));
        quick_sort(a, 0, a.length-1);
        System.out.println("\nAfter sorting:" + Arrays.toString(a));
	}
}
