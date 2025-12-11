package LinkedList;

import java.util.Scanner;

public class LinkedListInQueues {
	Node front, rear;
	
	public void enqueue(int data) {
		Node n = new Node(data);//created node
        if(rear == null)//not assigned till now
            front=rear=n;
        else
        {
           rear.next=n;
           rear=n;
        }

	}
	
	public void dequeue() {
		if(front==null)//not assigned till now
            System.out.print("\nQueue Empty");
        else{
            Node t=front;
            if(front==rear)//single node
                front=rear=null;//manual deletion
            else
                front=front.next;//move ahead
            System.out.println(t.data+" Deleted");
        }
	}
	
	public void print_queue() {
		if(front==null)//not assigned till now
            System.out.print("\nQueue Empty");
        else {
            Node t;
            t = front;
            while (t != null) {
                System.out.print("|" + t.data + "|-");
                t = t.next;
            }
        }

	}
	
	public static void main(String[] args) {
		LinkedListInQueues obj = new LinkedListInQueues();
		
		Scanner in = new Scanner(System.in);
        int choice=0;
        do
        {
            System.out.print("\nStack Menu");
            System.out.print("\n----------");
            System.out.print("\n1.enqueue");
            System.out.print("\n2.dequeue");
            System.out.print("\n3.print");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice=in.nextInt();
            switch (choice) {
	            case 1:
	                System.out.print("\nEnter Data:");
	                int data=in.nextInt();
	                obj.enqueue(data);
	                System.out.print("\n"+data+" enqueued");
	                break;
		        case 2:
		        	obj.dequeue();
		            break;
		        case 3:
		        	obj.print_queue();
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

