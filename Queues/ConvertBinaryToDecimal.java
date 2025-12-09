package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertBinaryToDecimal {
    public static void main(String[] args)
    {
    	String binary = "110101";
        Queue<Integer> obj=new LinkedList<>();
        int sum = 0;
        for(char c: binary.toCharArray()) {
        	obj.offer(c - '0');
        }
        
        while (!obj.isEmpty()) {
        	int bit = obj.poll();
        	sum += bit * Math.pow(2, obj.size());
        }
        
        System.out.println(sum);
    }
}
