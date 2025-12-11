package Trees;

import java.util.Scanner;

public class CustomTree {
	Node root;
	
	public void insert(Node r, Node n) {
		if(root == null) root = n;
		else {
			if (n.data < r.data) //left
			{
				if (r.left == null) {
					r.left = n;
				} else insert(r.left, n);
			} else {
				if (r.right == null) {
					r.right = n;
				} else insert(r.right, n);
			}
		} 
	}
	
	void inorder(Node r) {
        if(r!=null)//LPR
        {
            inorder(r.left); //L
            System.out.print(r.data+","); //P
            inorder(r.right); //R
        }
	}
	
	void preorder(Node r) {
        if(r!=null) //PLR
        {
            System.out.print(r.data+","); //P
            preorder(r.left); //L
            preorder(r.right); //R
        }
	}
	
	void postorder(Node r) {
        if(r!=null) //PLR
        {
            postorder(r.left); //L
            postorder(r.right); //R
            System.out.print(r.data+","); //P
        }
	}
	
	public Node search(Node r, int key) {
		if(r == null) System.out.println("Tree is empty");

        if (key == r.data) return r;
        else if (key < r.data) return search(r.left, key);
        else return search(r.right, key);
	}
	
    int count_node(Node r) {
        if(r==null)
            return 0;
        else
            return 1+count_node(r.left)+count_node(r.right);
    }

    int count_leafnode(Node r) {
        if(r==null) return 0;
        else if (r.left == null && r.right == null) return 1;
        return count_leafnode(r.left) + count_leafnode(r.right);
    }
    
    int tree_value(Node r) {
        if(r==null)
            return 0;
        else
            return r.data + tree_value(r.left) + tree_value(r.right);
    }
    
    int tree_depth(Node r) {
        if(r==null)
            return 0;
        else {
        	int length_left = tree_depth(r.left);
        	int length_right = tree_depth(r.right);
        	return 1 + Math.max(length_left, length_right);
        }
    }

	
	Node delete(Node r, int key) {
        if (r == null) return null;

        if (key < r.data)
            r.left = delete(r.left, key);
        else if (key > r.data)
            r.right = delete(r.right, key);
        else {
            // Case 1: No child
            if (r.left == null && r.right == null)
                return null;

            // Case 2: One child
            else if (r.left == null)
                return r.right;
            else if (r.right == null)
                return r.left;

            // Case 3: Two children → replace with inorder successor
            Node successor = findMin(r.right);
            r.data = successor.data;
            r.right = delete(r.right, successor.data);
        }
        return r;
	}
	
    Node findMin(Node r) {
        while (r.left != null)
            r = r.left;
        return r;
    }
	
	public static void main(String[] args) {
		CustomTree obj = new CustomTree();
		int data;
        Scanner in=new Scanner(System.in);
        int choice=0;
        do
        {
            System.out.print("\nTree Menu");
            System.out.print("\n----------");
            System.out.print("\n1.Insert element");
            System.out.print("\n2.Print Pre-Order");
            System.out.print("\n3.Print In-Order");
            System.out.print("\n4.Print Post-Order");
            System.out.print("\n5.Delete element");
            System.out.print("\n6.Search element");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice=in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nEnter Data:");
                    data = in.nextInt();
                    obj.insert(obj.root, new Node(data));
                    break;
                case 2:
                    obj.preorder(obj.root);
                    System.out.println();
                    break;

                case 3:
                    obj.inorder(obj.root);
                    System.out.println();
                    break;

                case 4:
                    obj.postorder(obj.root);
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Enter value to delete: ");
                    data = in.nextInt();
                    obj.root = obj.delete(obj.root, data);
                    break;

                case 6:
                    System.out.print("Enter value to search: ");
                    data = in.nextInt();
                    Node res = obj.search(obj.root, data);
                    if (res != null) System.out.println("Found!");
                    else System.out.println("Not found.");
                    break;
                case 0:
                    System.out.print("\n Thanks for using the code.");
                    break;
                default:
                    System.out.print("\nWrong Choice given.");
                    break;

            }
        } while(choice!=0);
        in.close();
    }
}

