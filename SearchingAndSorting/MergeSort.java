package SearchingAndSorting;

import java.util.Arrays;

public class MergeSort {
    static void merge_sort(int a[],int start,int end){
        if (start < end)//size 1 stop < and not <=
        {
            int mid = (start + end)/2;
            merge_sort(a,start, mid);
            merge_sort(a, mid+1, end);
            merger(a, start, mid,end);
        }
    }
	
    static void merger(int a[],int start, int mid, int end){
        int i,j;
        i = start;
        j = mid+1;
        int temp[],tindex;//temp array to store inbetween elements
        temp = new int[a.length];
        tindex = start;
        while(i <= mid && j <= end){ //copy smaller first
            if(a[i] < a[j])
                temp[tindex++] = a[i++];
            else
                temp[tindex++] = a[j++];
        }
        //copy leftover
        while(i <= mid)
            temp[tindex++] = a[i++];
        while (j <= end)
            temp[tindex++] = a[j++];
        for(i = start; i <= end; i++)
            a[i] = temp[i];//copy to original
    }

	public static void main(String[] args) {
	    int a[] = {44,22,99,88,33,66,55,11,77};
        System.out.println("\nStart before sorting:" + Arrays.toString(a));
        merge_sort(a, 0, a.length-1);
        System.out.println("\nAfter sorting:" + Arrays.toString(a));
	}
}
