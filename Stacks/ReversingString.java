package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReversingString {	
	 public static void main(String[] args)
	    {
		 	Stack<Character> obj = new Stack<>();
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter word:");
	        String word = in.next();
	        String rword = "";
	        //use loop to at one character at a time in stack
	        for(char c: word.toCharArray()) {
	        	obj.push(c);
	        }
	        
	        //till stack not empty pop and copy poped to rword  '+'
	        while(!obj.empty()) {
	        	rword += obj.pop();
	        }
	        System.out.println(rword);
	        
	        in.close();
	    }

}
