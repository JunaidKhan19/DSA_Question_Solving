package LinkedList;

import java.util.Scanner;

public class CustomLinkedList {
    Node root;
	
	public void insert_left(int data) {
		Node n = new Node(data);
		if(root == null) {
			root = n;
		} else {
			n.next = root;
			root = n;
		}
	}
	
	public void delete_left() {
		if(root == null) {
			System.out.println("List is empty");
		} else {
			Node t = root;
			root = root.next; //moved root to next element
			System.out.println(t.data + " is deleted ");
		}	
	}
	
	public void insert_right(int data) {
		Node n = new Node(data);
		if(root == null) {
			root = n;
		} else {
			Node t = root;
			while(t.next != null) {
				t = t.next;
			}
			t.next = n;
		}
	}
	
	public void delete_right() {
		if(root == null) {
			System.out.println("List is null");
		} else {
			Node t, t2;
			t = t2 = root;
			while(t.next != null) {
				t2 = t;
				t = t.next;
			}
			if(t == root) {
				root = null;
			} else {
				t2.next = null;
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
			while (t != null) {
				System.out.println("/" + t.data + "/->");
				t = t.next;
			}
		}
	}
	
	public boolean search(int key) {
		if (root == null) {
			System.out.println("List is empty");
		} else {
			Node t;
			t = root;
			while (t != null) {
				if(t.data == key) {
					return true;
				}
				t = t.next;
			}
		}
		return false;
	}
	
	public void insert_after(int refNum, int newElement) {
		if (root == null) {
			System.out.println("List is empty");
		} else {
			Node t;
			t = root;
			while (t != null) {
				if(t.data == refNum) {
					System.out.println("Reference found!!");
					Node n = new Node(newElement);
					n.next = t.next;
					t.next = n;
					break;
				}
				t = t.next;
			}
		}
		return;
	}
	
	public void delete(int key) {
		if (root == null) {
			System.out.println("List is empty");
		} else {
			Node t, t2;
			t = t2 = root;
			while (t != null) {
				if (t.data == key) {
					System.out.print("\nFound");
					if (t == root) root = root.next;
					else if (t.next == null) t2.next = null;
					else t2.next = t.next;
					System.out.println(t.data + " deleted");
					return;
				}
				t2 = t;
				t = t.next;
			}
			if (t == null) System.out.print("\nElement:" + key + " not found");
		}
	}
	
	public static void main(String[] args) {
		CustomLinkedList obj = new CustomLinkedList();
		int data;
        Scanner in=new Scanner(System.in);
        int choice=0;
        do
        {
            System.out.print("\nQueue Menu");
            System.out.print("\n----------");
            System.out.print("\n1.Insert left element");
            System.out.print("\n2.Insert right element");
            System.out.print("\n3.Insert after element");
            System.out.print("\n4.Delete element");
            System.out.print("\n5.Search element");
            System.out.print("\n6.Print list");
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
                	System.out.print("\nEnter Data:");
                    data = in.nextInt();
                    System.out.print("\nEnter element from list to put data after it:");
                    int elem = in.nextInt();
                    obj.insert_after(elem, data);
                    break;
                case 4:
                	System.out.print("\nEnter Data:");
                    data = in.nextInt();
                    obj.delete(data);
                    break;
                case 5:
                	System.out.print("\nEnter Data:");
                    data = in.nextInt();
                    boolean result = obj.search(data);
                    System.out.println(result ? "Found element" : "Not found element");
                    break;
                case 6:
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
