package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListBuiltin {
    	public static void main(String[] args) {
        LinkedList<Student> StudentList = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        
        //adding record
        StudentList.add(new Student(1,"abcde",26, "male"));
        StudentList.add(new Student(2,"fghi",27, "female"));
        StudentList.add(new Student(3,"jklmn",28, "male"));
        StudentList.add(new Student(4,"opqrs",29, "female"));

        //printing them
        for (Student st: StudentList) {
        	st.print();
        }
        
        //searching
        System.out.print("\nEnter roll number to search:");
        int roll = in.nextInt();
        boolean flag = false;
        
        for (Student st: StudentList) {
        	if(st.getRoll_no() == roll) {
        		System.out.print("\nFound");
                st.print();
                flag=true;
        	}
        }
        if(flag == false) System.out.print("\n"+roll+" not found");
        
        in.close();
	}
}
