package SearchingAndSorting;

import java.util.Arrays;

public class QuickSort {
    
    static void quick_sort(int a[],int start,int end){
        int i,j,pivot,temp;
        i=start;
        j=end;
        pivot=start;//end
        //if pivot is at start i will be useless
        //if pivot is at end j is useless
        while(i<j){
            while(a[i]<a[pivot])
                i++;//move ahead
            while(a[j]>a[pivot])
                j--;//move back
            if(i<j){
                temp=a[i];a[i]=a[j];a[j]=temp;
            }
        }
        if(i<end)
            quick_sort(a,i+1,end);
        if(start<j)
            quick_sort(a,start,j-1);
    }

	public static void main(String[] args) {
	    int a[]={44,22,99,88,33,66,55,11,77};
        //int a[]={11,22,33,44,55,66,77,88,99};
        System.out.println("\nStart before sorting:" + Arrays.toString(a));
        quick_sort(a, 0, a.length-1);
        System.out.println("\nAfter sorting:" + Arrays.toString(a));
	}
}
