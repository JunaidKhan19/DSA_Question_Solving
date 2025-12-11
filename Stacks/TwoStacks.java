package Stacks;

import java.util.Scanner;

public class TwoStacks {
    	int arr[];
	int size;
	int top1, top2;
	
	// Constructor
	TwoStacks(int n) {
		size = n;
		arr = new int[n];
		top1 = -1; // Stack 1 starts from left
		top2 = n; // Stack 2 starts from right
	}

	void push1(int x) {
		if(top1 + 1 < top2) {
			arr[++top1] = x;
		}
	}
	
	void push2(int x) {
		if(top2 - 1 > top1) {
			arr[--top2] = x;
		}
	}
	
	int pop1() {
		if(top1 >= 0) {
			return arr[top1--]; 
		}
		return -1;
	}
	
	int pop2() {
		if(top2 < size) {
			return arr[top2++];
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TwoStacks ts = new TwoStacks(5); // default size
		while (sc.hasNext()) {
			String op = sc.next();
			switch(op) {
				case "push1":
					System.out.println("Enter data to push in stack 1:");
					ts.push1(sc.nextInt());
					break;
				case "push2":
					System.out.println("Enter data to push in stack 2:");
					ts.push2(sc.nextInt());
					break;
				case "pop1":
					System.out.println(ts.pop1());
					break;
				case "pop2":
					System.out.println(ts.pop2());
					break;
				default:
					return;
			}
		}
		sc.close();
	}
}
