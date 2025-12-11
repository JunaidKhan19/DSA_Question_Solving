package LinkedList;

public class Enode {
    int id;
    String name;
    double salary;
    Enode next;

    Enode(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.next = null;
    }
}
