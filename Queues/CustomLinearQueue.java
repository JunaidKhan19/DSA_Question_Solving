package Queues;

import java.util.Scanner;

public class CustomLinearQueue {
    int front, rear, MaxSize, queue[];
	void create_queue(int size) {
		MaxSize = size;
		front = 0;
		rear = -1;
		queue = new int[MaxSize];
	}
	
	void enqueue(int data) {  //entry on queue
		queue[++rear] = data;
	}
	
	int dequeue() {
		return (queue[front++]);
	}
	
	boolean is_full() {
		return (rear == MaxSize - 1);
	}
	
	boolean is_empty() {
		return (front > rear); // front is greater than rear then queue is empty
	}	

	void print_queue() {
		for(int i = front; i <= rear ; i++) {
			System.out.print(queue[i] + " ,");
		}
	}
	
	public static void main(String[] args) {
		CustomLinearQueue obj = new CustomLinearQueue();
		Scanner in = new Scanner(System.in);
        System.out.println("Enter size of stack:");
        int size=in.nextInt();
        int choice=0;
        obj.create_queue(size);
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
                    if (!obj.is_full())
                    {
                        System.out.print("\nEnter Data:");
                        int data=in.nextInt();
                        obj.enqueue(data);
                        System.out.print("\n"+data+" enqueued");
                    }
                    else
                        System.out.print("\nStack Full");
                    break;
                case 2:
                    if (!obj.is_empty())
                    {
                        System.out.print("\n"+obj.dequeue()+" is dequeued..");
                    }
                    else
                        System.out.print("\nQueue Empty");
                    break;
                case 3:
                    if (!obj.is_empty())
                    {
                        System.out.print("\nQueue has:\n");
                        obj.print_queue();
                    }
                    else
                        System.out.print("\nQueue Empty");
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
