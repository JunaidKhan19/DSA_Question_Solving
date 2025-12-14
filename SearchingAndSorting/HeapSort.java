package SearchingAndSorting;

import java.util.Arrays;

public class HeapSort {
    
    static void heap_sort(int a[]){
		int pc,i,j;
		boolean done;
		for(i=a.length-1;i>0;i--){
			for(j=0;j<=i;j++){
					pc=j;
					done=false;
					while(pc>0 && pc/2>=0 && done!=true){
						  if(a[pc]>a[pc/2]){ //child>parent:swap
							  int temp=a[pc];
                                   a[pc]=a[pc/2]; 
                                   a[pc/2]=temp;
							  pc=pc/2;//go to parent
							}
						else
							done=true;//stop
					}
			}//j loop
				
			//swap root(0) with ith in ith pass
			int temp=a[0];
			a[0]=a[i];
			a[i]=temp;
		}//i loop
	}
	
	public static void main(String[] args) {
	    int a[] = {44,22,99,88,33,66,55,11,77};
        System.out.println("\nStart before sorting:" + Arrays.toString(a));
        heap_sort(a);
        System.out.println("\nAfter sorting:" + Arrays.toString(a));
	}
}
