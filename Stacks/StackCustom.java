package Stacks;

import java.util.Scanner;

public class StackCustom {
	int tos, MaxSize, stack[];
	void create_stack(int size) {
		MaxSize = size;
		tos = -1;
		stack = new int[MaxSize];
	}
	
	void push(int data) {
		tos++;
		stack[tos] = data;
		
		//stack[++tos] = data;
	}
	
	int pop() {
		int temp = stack[tos];
		tos--;
		return (temp);
		
		//return (stack[tos--]);
	}
	
	int peek() {
		int temp = stack[tos];
		return (temp);
		
		//return (stack[tos]);
	}
	
	boolean is_full() {
		if(tos == MaxSize - 1)
			return true;
		else
			return false;
		
		//return (tos == MaxSize - 1);
	}
	
	boolean is_empty() {
		if(tos == - 1)
			return true;
		else
			return false;
		
		//return (tos == - 1);
	}	

	void print_stack() {
		for(int i = tos; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
	
	public static void main(String[] args) {
		StackCustom obj = new StackCustom();
		
		Scanner in = new Scanner(System.in);
        System.out.println("Enter size of stack:");
        int size=in.nextInt();
        int choice=0;
        obj.create_stack(size);
        do
        {
            System.out.print("\nStack Menu");
            System.out.print("\n----------");
            System.out.print("\n1.Push");
            System.out.print("\n2.Pop");
            System.out.print("\n3.Peek");
            System.out.print("\n4.Print");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice=in.nextInt();
            switch (choice) {
                case 1:
                    if (!obj.is_full())
                    {
                        System.out.print("\nEnter Data:");
                        int data=in.nextInt();
                        obj.push(data);
                        System.out.print("\n"+data+" pushed");
                    }
                    else
                        System.out.print("\nStack Full");
                    break;
                case 2:
                    if (!obj.is_empty())
                    {
                        System.out.print("\n"+obj.pop()+" is poped..");
                    }
                    else
                        System.out.print("\nStack Empty");
                    break;
                case 3:
                    if (!obj.is_empty())
                    {
                        System.out.print("\n"+obj.peek()+" is at peek");
                    }
                    else
                        System.out.print("\nStack Empty");
                    break;
                case 4:
                    if (!obj.is_empty())
                    {
                        System.out.print("\nStack has:\n");
                        obj.print_stack();
                    }
                    else
                        System.out.print("\nStack Empty");
                    break;
                case 0:
                    System.out.print("\n Thanks for using the code");
                    break;
                default:
                    System.out.print("\nWrong Choice given.");
                    break;

            }
        }while(choice!=0);
        
        in.close();
    }	
}
