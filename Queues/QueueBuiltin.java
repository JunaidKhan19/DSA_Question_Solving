package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueBuiltin {
    public static void main(String[] args) {
        Queue<Integer> obj=new LinkedList<>();
        //Is an interface which gets implemented via linked list class.
        Scanner in=new Scanner(System.in);

        int choice=0;
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
                        System.out.print("\nEnter Data:");
                        int data=in.nextInt();
                        obj.add(data);
                        System.out.print("\n"+data+" enqueued");
                        break;
                case 2:
                    if (!obj.isEmpty())
                    {
                        System.out.print("\n"+obj.remove()+" is dequeued");
                    }
                    else
                        System.out.print("\nQueue Empty");
                    break;
                case 3:
                    if (!obj.isEmpty())//not empty
                    {
                        System.out.print("\nQueue has:\n");
                        for(int e:obj)
                        {
                            System.out.print(e+",");
                        }
                    }
                    else
                        System.out.print("\nQueue Empty");
                    break;
                case 0:
                    System.out.print("\n Thanks for using the code..amar.career");
                    break;
                default:
                    System.out.print("\nWrong Choice given.");
                    break;

            }
        }while(choice!=0);
        
        in.close();
    }
}
