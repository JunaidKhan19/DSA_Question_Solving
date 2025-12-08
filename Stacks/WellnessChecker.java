package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class WellnessChecker {
    static boolean CheckWellness(String Pattern)
    {
        Stack<Character> obj = new Stack<>();
        //read char by char
        //if { push to stack
        //if } pop if not empty else return false
        //end return stack.empty()
    	for(char c: Pattern.toCharArray()) {
    		if (c == '{') {
    			obj.push(c);
    		} else if (c == '}' && !obj.empty()) {
    			obj.pop();
    		} else 
    	    	return false;
    	}
		return obj.empty();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Pattern:");
        String Pattern = in.next();
        boolean result= CheckWellness(Pattern);
        System.out.print("\nPattern:"+Pattern+" is:"+result);

        in.close();
    }
}
