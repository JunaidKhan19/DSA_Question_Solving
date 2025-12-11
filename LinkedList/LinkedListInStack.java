package LinkedList;

import java.util.Scanner;

public class LinkedListInStack {
    Node tos;//single data member //insert_left:push
	 
     void push(int data){
        Node n=new Node(data);//created node
        if(tos==null)//not assigned till now
            tos=n;
        else
        {
            n.next=tos;//1:   2100
            tos=n;//2 root=3400
        }
     }
    
     void pop(){
		if(tos==null)//not assigned till now
		    System.out.print("\nStack Empty");
		else
		{
		    Node t=tos;//1
		    tos=tos.next;//2
		    System.out.println(t.data+" Poped");
		}
     }
    
     void peek(){
        if(tos==null)//not assigned till now
            System.out.print("\nStack Empty");
        else
        {
            System.out.println(tos.data+" @ Peek");
        }
     }
    
     boolean is_empty(){
        return(tos==null);
     }
    
     void print_stack(){
    	 if(tos==null)//not assigned till now
            System.out.print("\nStack Empty");
    	 else {
    		 Node t;
             t = tos;
             while (t != null) {
             	System.out.print("\n|" + t.data + "|");
                 System.out.print("\n____");
                 t = t.next;
             }
    	 }
     }

	public static void main(String[] args) {
		LinkedListInStack obj = new LinkedListInStack();
		
		Scanner in=new Scanner(System.in);
        int choice=0;
        do{
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
                    System.out.print("\nEnter Data:");
                    int data=in.nextInt();
                    obj.push(data);
                    System.out.print("\n"+data+" pushed");
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.print_stack();
                    break;
                case 0:
                    System.out.print("\n Thanks for using the code.");
                    break;
                default:
                    System.out.print("\nWrong Choice given.");
                    break;
            }
        }while(choice!=0);
        in.close();
    }
}
