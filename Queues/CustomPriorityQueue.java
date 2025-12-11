package Queues;

import java.util.Scanner;

public class CustomPriorityQueue {
    int front,rear,MaxSize,queue[];
    void create_queue(int size)
    {
        MaxSize=size;
        rear=-1;//init as stack starts from 0th index(Array)
        front=0;
        queue=new int[MaxSize];
    }
    //Enqueue:Entry on queue
    //in this rear+1 and then new entry taken
    void enqueue(int data)
    {
        queue[++rear]=data;
        for(int i=front;i<rear;i++)
        {
            for(int j=front;j<rear;j++)
            {
                if(queue[j]<queue[j+1])//ASC    > //DEC
                {
                    int temp=queue[j];queue[j]=queue[j+1];queue[j+1]=temp;
                }
            }
        }
    }
    //is_full:
    // if rear==MaxSize-1 then full
    boolean is_full()
    {
        return(rear==MaxSize-1);
    }
    //dequeue:
    // Remove and returns element from front
    // in this front+1 on every dequeue
    int dequeue()
    {
        return(queue[front++]);
    }

    //is_empty
    //front>rear then empty
    boolean is_empty()
    {
        return(front>rear);
    }

    void print_queue()
    //print queue in FIFO manner means from front to rear
    {
        for(int i=front;i<=rear;i++)
            System.out.print(queue[i]+" ,");
    }

    public static void main(String[] args){
        CustomPriorityQueue obj = new CustomPriorityQueue();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of queue:");
        int size=in.nextInt();
        int choice=0;
        obj.create_queue(size);
        do
        {
            System.out.print("\nQueue Menu");
            System.out.print("\n----------");
            System.out.print("\n1.Enqueue");
            System.out.print("\n2.Dequeue");
            System.out.print("\n3.Print");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice=in.nextInt();
            switch (choice) {
                case 1:
                    if (!obj.is_full())//not full
                    {
                        System.out.print("\nEnter Data:");
                        int data=in.nextInt();
                        obj.enqueue(data);
                        System.out.print("\n"+data+" enqueued");
                    }
                    else
                        System.out.print("\nQueue Full");
                    break;
                case 2:
                    if (!obj.is_empty())//not empty
                    {
                        System.out.print("\n"+obj.dequeue()+" is dequeued");
                    }
                    else
                        System.out.print("\nQueue Empty");
                    break;
                case 3:
                    if (!obj.is_empty())//not empty
                    {
                        System.out.print("\nQueue has:\n");
                        obj.print_queue();
                    }
                    else
                        System.out.print("\nQueue Empty");
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
