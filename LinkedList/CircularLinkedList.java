package LinkedList;

import java.util.Scanner;

public class CircularLinkedList {
    Node root, last;
	
	public void insert_left(int data) {
		Node n = new Node(data);
		if(root == null) {
			root = last = n;
			last.next = root;
		} else {
			n.next = root;
			root = n; //making the new element as root 
			last.next = root; 
		}
	}
	
	public void delete_left() {
		if(root == null) {
			System.out.println("List is empty");
		} else {
			Node t = root;
			if(root == last) {
				root = last = null;
			} else {
				root = root.next; //moved root to next element
				last.next = root;
			}

			System.out.println(t.data + " is deleted ");
		}	
	}
	
	public void insert_right(int data) {
		Node n = new Node(data);
		if(root == null) {
			root = last = n;
		} else {
			last.next = n;
			last = n;
			last.next = root;
		}
	}
	
	public void delete_right() {
		if(root == null) {
			System.out.println("List is null");
		} else {
			Node t, t2;
			t = t2 = root;
			while(t.next != root) {
				t2 = t;
				t = t.next;
			}
			if(t == root) {
				root = last = null;
			} else {
				last = t2;
				last.next = root;
			}
			System.out.println(t.data + " deleted");
		}
	}
	
	public void print_list() {
		if (root == null) {
			System.out.println("List is empty");
		} else {
			Node t;
			t = root;
			do {
				System.out.println("/" + t.data + "/->");
				t = t.next;
			}while (t != root);
		}
	}
	
	public static void main(String[] args) {
		CircularLinkedList obj = new CircularLinkedList();
		int data;
        Scanner in=new Scanner(System.in);
        int choice=0;
        do
        {
            System.out.print("\nQueue Menu");
            System.out.print("\n----------");
            System.out.print("\n1.Insert left element");
            System.out.print("\n2.Insert right element");
            System.out.print("\n3.Delete left");
            System.out.print("\n4.Delete right");
            System.out.print("\n5.Print list");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice=in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nEnter Data:");
                    data = in.nextInt();
                    obj.insert_left(data);
                    break;
                case 2:
                	System.out.print("\nEnter Data:");
                    data = in.nextInt();
                    obj.insert_right(data);
                    break;
                case 3:
                	obj.delete_left();
                    System.out.print("\n Item deleted from left");
                    break;
                case 4:
                    obj.delete_right();
                    System.out.print("\n Item deleted from right");
                    break;
                case 5:
                	obj.print_list();
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
