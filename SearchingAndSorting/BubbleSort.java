package SearchingAndSorting;

import java.util.Arrays;

public class BubbleSort {
    // n-1 passes are required to sort 
	
    static void bubble_sort(int a[])
    {
        int i,j,temp;
        int pass=0;
        for(i=0;i<a.length-1;i++) //passes n-1
        {
            for(j=0;j<a.length-1;j++)//sort by swap step j as second last so j+1 last
            {
                System.out.print("\npass:"+(pass++));
                if(a[j]>a[j+1])
                {
                    temp=a[j];a[j]=a[j+1];a[j+1]=temp;
                }
            }
        }

    }
    static void bubble_sort_v1(int a[])
    {
        int i,j,temp;
        int pass=0;
        for(i=a.length-1;i>0;i--)//passes n-1 9,8,7,6,5,4,3,2,1,0(stop)
        {
            for(j=0;j<i;j++)//sort by swap step j as second last so j+1 last
            {
                System.out.print("\npass:"+(pass++));
                if(a[j]>a[j+1])
                {
                    temp=a[j];a[j]=a[j+1];a[j+1]=temp;
                }
            }
        }

    }
    static void bubble_sort_v2(int a[])
    {
        int i,j,temp;
        int pass=0;
        boolean done;
        for(i=a.length-1;i>0;i--)//passes n-1 9,8,7,6,5,4,3,2,1,0(stop)
        {
            done=true;//Means sorting is done.
            for(j=0;j<i;j++)//sort by swap step j as second last so j+1 last
            {
                System.out.print("\npass:"+(pass++));
                if(a[j]>a[j+1])
                {
                    temp=a[j];a[j]=a[j+1];a[j+1]=temp;
                    done=false;//Sorting is still not done.
                }
            }
            if(done == true) return;
        }
    }

	
	public static void main(String[] args) {
	    // int a[]={44,22,99,88,33,66,55,11,77};
        int a[]={11,22,33,44,55,66,77,88,99};
        System.out.println("\nStart before sorting:" + Arrays.toString(a));
        //sorting call
        //bubble_sort(a);
        //bubble_sort_v1(a);
        bubble_sort_v2(a);
        System.out.println("\nAfter sorting:" + Arrays.toString(a));
	}
}
