package SearchingAndSorting;

import java.util.Arrays;

public class InsertionSort {
    
    static void insertion_sort(int a[]){
        int i,j,new_element;
        for(i=0;i<a.length-1;i++){
            j=i+1;
            new_element=a[j];
            while(j>0 && a[j-1]>new_element){
	             a[j]=a[j-1];
	             j--;
            }
            a[j]=new_element; // the current position is the actual position of that element.
        }
    }

	public static void main(String[] args) {
	    int a[]={44,22,99,88,33,66,55,11,77};
        //int a[]={11,22,33,44,55,66,77,88,99};
        System.out.println("\nStart before sorting:" + Arrays.toString(a));
        insertion_sort(a);
        System.out.println("\nAfter sorting:" + Arrays.toString(a));
	}
}
