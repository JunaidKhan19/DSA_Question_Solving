package LinkedList;

import java.util.Scanner;

public class CustomDoublyLinkedList {
	DNode root;
	
	public void insert_left(int data) {
		DNode n = new DNode(data);
		if(root == null) {
			root = n;
		} else {
			n.right = root;
			root.left = n;
			root = n;
		}
	}
	
	public void delete_left() {
		if(root == null) {
			System.out.println("List is empty");
		} else {
			DNode t = root;
			root = root.right; // moved root to next element
			if(root.right==null)// if one element only
                root=null;
            else {
                root = root.right;//2
                root.left = null;//3 should be used iff root exists
            }
			System.out.println(t.data + " is deleted ");
		}	
	}
	
	public void insert_right(int data) {
		DNode n = new DNode(data);
		if(root == null) {
			root = n;
		} else {
			DNode t = root;
			while(t.right != null) {
				t = t.right;
			}
			t.right = n;
			n.left = t;
		}
	}
	
	public void delete_right() {
		if(root == null) {
			System.out.println("List is null");
		} else {
			DNode t, t2;
			t = root;
			while(t.right != null) {
				t = t.right;
			}
			if(t == root) {
				root = null;
			} else {
				t2 = t.left;
				t2.right = null;
			}
			System.out.println(t.data + " deleted");
		}
	}
	
	public void print_list() {
		if (root == null) {
			System.out.println("List is empty");
		} else {
			DNode t;
			t = root;
			while (t.right != null) {
				t = t.right;
			}
			while (t != null) {
				System.out.println("<-/" + t.data + "/->");
				t = t.left;
			}
		}
	}
	
	public void print_list_reverse() {
		if (root == null) {
			System.out.println("List is empty");
		} else {
			DNode t;
			t = root;
			while (t != null) {
				System.out.println("<-/" + t.data + "/->");
				t = t.right;
			}
		}
	}
	
//	public boolean search(int key) {
//		if (root == null) {
//			System.out.println("List is empty");
//		} else {
//			DNode t;
//			t = root;
//			while (t != null) {
//				if(t.data == key) {
//					return true;
//				}
//				t = t.next;
//			}
//		}
//		return false;
//	}
	
//	public void insert_after(int refNum, int newElement) {
//		if (root == null) {
//			System.out.println("List is empty");
//		} else {
//			DNode t;
//			t = root;
//			while (t != null) {
//				if(t.data == refNum) {
//					System.out.println("Reference found!!");
//					DNode n = new DNode(newElement);
//					n.next = t.next;
//					t.next = n;
//					break;
//				}
//				t = t.next;
//			}
//		}
//		return;
//	}
	
//	public void delete(int key) {
//		if (root == null) {
//			System.out.println("List is empty");
//		} else {
//			DNode t, t2;
//			t = t2 = root;
//			while (t != null) {
//				if (t.data == key) {
//					System.out.print("\nFound");
//					if (t == root) root = root.next;
//					else if (t.next == null) t2.next = null;
//					else t2.next = t.next;
//					System.out.println(t.data + " deleted");
//					return;
//				}
//				t2 = t;
//				t = t.next;
//			}
//			if (t == null) System.out.print("\nElement:" + key + " not found");
//		}
//	}
	
	public static void main(String[] args) {
		CustomDoublyLinkedList obj = new CustomDoublyLinkedList();
		int data;
        Scanner in=new Scanner(System.in);
        int choice=0;
        do
        {
            System.out.print("\nQueue Menu");
            System.out.print("\n----------");
            System.out.print("\n1.Insert left element");
            System.out.print("\n2.Insert right element");
            System.out.print("\n3.Delete left element");
            System.out.print("\n4.Delete right element");
            System.out.print("\n5.Insert after element");
            System.out.print("\n6.Delete element");
            System.out.print("\n7.Search element");
            System.out.print("\n8.Print list");
            System.out.print("\n9.Print reverse list");
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
                    obj.delete_left();;
                    break;
                case 4:
                    obj.delete_right();
                    break;
/*
                case 5:
                	System.out.print("\nEnter Data:");
                    data = in.nextInt();
                    System.out.print("\nEnter element from list to put data after it:");
                    int elem = in.nextInt();
                    obj.insert_after(elem, data);
                    break;
                case 6:
                	System.out.print("\nEnter Data:");
                    data = in.nextInt();
                    obj.delete(data);
                    break;
                case 7:
                	System.out.print("\nEnter Data:");
                    data = in.nextInt();
                    boolean result = obj.search(data);
                    System.out.println(result ? "Found element" : "Not found element");
                    break;
*/
                case 8:
                	obj.print_list();
                    break;
                case 9:
                	obj.print_list_reverse();
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

