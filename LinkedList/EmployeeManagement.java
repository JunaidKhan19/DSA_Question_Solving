package LinkedList;

import java.util.Scanner;

public class EmployeeManagement {
    	Enode root;
	
	//Create / Insert Employee (At End) insert_right()
	void addEmployee(int id, String name, double salary) {
		Enode n = new Enode(id, name, salary);
		if (root == null) {
			root = n;
		} else {
			Enode t = root;
			while (t.next != null) {
				t = t.next;
			}
			t.next = n;
		}
	}
	
	//Display All Employees//print_list
	void displayEmployees() {
		if (root == null) {
			System.out.println("No employes entered yet..");
		} else {
			Enode t = root;
			while (t != null) {
				System.out.println("ID: " + t.id + " Name: " + t.name + " Salary: " + t.salary);
				t = t.next;
			}
		}
	}
	
	//Search Employee by ID//list_search
	void searchEmployee(int id) {
		if (root == null) {
			System.out.println("No employes entered yet..");
		} else {
			Enode t = root;
			boolean found = false;
			while (t != null) {
				if (t.id == id) {
					System.out.println("ID: " + t.id + " Name: " + t.name + " Salary: " + t.salary);
					found = true;
					return;
				}
				t = t.next;
			}
			if (!found) {
				System.out.println("No employee with id: " + id + "found. Search Terminated");
			}
		}
	}
	
	//Update Employee by ID//search and over-write
	void updateEmployee(int id, String newName, double newSalary) {
		if (root == null) {
			System.out.println("No employes entered yet..");
		} else {
			Enode t = root;
			boolean found = false;
			while (t != null) {
				if (t.id == id) {
					t.name = newName;
					t.salary = newSalary;
					System.out.println("Employee Updated..");
					found = true;
					return;
				}
				t = t.next;
			}
			if (!found) {
				System.out.println("No employee with id: " + id + "found.");
			}
		}
		
	}
	
	//Delete Employee by ID//delete element
	void deleteEmployee(int id) {
		if (root == null) {
			System.out.println("No employes entered yet..");
		} else {
			Enode t, t2; 
			t = t2 = root;
			if (t == root && root.id == id) root = root.next; //if root
			while (t != null) {
				if (t.id == id) {
					t2.next = t.next;
					return;
				} 
				t2 = t;
				t = t.next;
			}
			if (t == null) System.out.println("No employe with id: "+ id + "found. Delete Terminated.. ");
		}
	}
	
	public static void main(String[] args) {
		EmployeeManagement obj = new EmployeeManagement();
		int id;
		String name;
		double salary;
        Scanner in=new Scanner(System.in);
        int choice=0;
        do
        {
            System.out.print("\nQueue Menu");
            System.out.print("\n----------");
            System.out.print("\n1.Add Employee.");
            System.out.print("\n2.Display Employee");
            System.out.print("\n3.Search Employee");
            System.out.print("\n4.Update Employee");
            System.out.print("\n5.Delete Employee");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice=in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nEnter data for employee:");
                    System.out.print("\nEnter ID: ");
                    id = in.nextInt();
                    System.out.print("\nEnter name: ");
                    name = in.next();
                    System.out.print("\nEnter salary: ");
                    salary = in.nextDouble();
                    obj.addEmployee(id, name, salary);
                    break;
                case 2:
                	obj.displayEmployees();
                    break;
                case 3:
                	System.out.print("\nEnter Id:");
                    id = in.nextInt();
                    obj.searchEmployee(id);
                    break;
                case 4:
                	System.out.print("\nEnter data for employee:");
                    System.out.print("\nEnter ID: ");
                    id = in.nextInt();
                    System.out.print("\nEnter name: ");
                    name = in.next();
                    System.out.print("\nEnter salary: ");
                    salary = in.nextDouble();
                    obj.updateEmployee(id, name, salary);
                    break;
                case 5:
                	System.out.print("\nEnter Id:");
                    id = in.nextInt();
                    obj.deleteEmployee(id);
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
