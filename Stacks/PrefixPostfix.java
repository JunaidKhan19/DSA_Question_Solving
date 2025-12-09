package Stacks;

import java.util.Stack;

public class PrefixPostfix {
	public static String toPostfix(String s) 
	{
		String postfix = ""; // to store operand 
        Stack<Character> obj = new Stack<>(); // to store operators
        
        for (int i = 0; i < s.length(); i++) 
        {
        	char c = s.charAt(i);
        	if (c == '(') //start pushing
        	{
        		obj.push(c);
        	}
        	else if (c == ')') //start poping untill '(' comes again dont add '(' & ')'
        	{
        		while(!obj.isEmpty() && obj.peek() != '(') 
        		{
        			postfix += obj.pop();
        		}
        		obj.pop();
        	}
        	else if (!(c >= 'A' && c <= 'Z' || c >= '0' && c <= '9'))
        	{
        		while (!obj.isEmpty() && obj.peek() != '('){
	        		char lastOperator = obj.peek();
	        		boolean stop = false; 
	        		switch (c){
	        			case '+':
	        			case '-':
	        				if (lastOperator == '*' || lastOperator == '/') 
	        				{
	        					postfix += obj.pop();
	        				} else {
	        					stop = true;
	        				}
	        				break;
	        			case '*':
	        			case '/':
	        				if (lastOperator == '*' || lastOperator == '/') 
	        				{
	        					postfix += obj.pop();
	        				} else {
	        					stop = true;
	        				}
	        				break;
	        		}
	        		if (stop) break;
        		}
        		obj.push(c);
        	}
        	else postfix += c;
        }
        
		while (!obj.isEmpty()) //pop the remaining operator in stack and append it in postfix
		{
			postfix += obj.pop();
		}
		
		return postfix;
	}
	
	public static String evalPrefix(String s) 
	{
		return null;
	}
	
	
	public static void main(String[] args) 
	{
		//Q1 infix to postfix
		String infix = "(A+B)*(C-D)/E";
		String result = toPostfix(infix);
		System.out.println(result);
	}

}
