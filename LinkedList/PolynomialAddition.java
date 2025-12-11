package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;


class Pnode{
	int power;
    float co;
    Pnode(float co,int power)
    {
        this.co=co;
        this.power=power;
    }

}

public class PolynomialAddition {
	LinkedList<Pnode> makeList(Scanner in) {
        LinkedList<Pnode> list= new LinkedList<>();
        System.out.print("\nEnter highest power:");
        int hp=in.nextInt();
        for(int i = hp; i >= 0; i--)
        {
            System.out.print("\nEnter coefficient for power:"+i+":");
            float co=in.nextFloat();
            if(co!=0)
            {
                list.add(new Pnode(co,i));
            }
        }
        return list;
	};
	
	LinkedList<Pnode> addLists(LinkedList<Pnode> list1, LinkedList<Pnode> list2) {
		LinkedList<Pnode> ans = new LinkedList<>();
        for(int i1=0,i2=0;i1<list1.size() && i2< list2.size();) {
            Pnode e1 = list1.get(i1);
            Pnode e2 = list2.get(i2);
            if (e1.power == e2.power) {
                ans.add(new Pnode(e1.co + e2.co, e1.power));
                i1++;
                i2++;
            }
            else if (e1.power > e2.power) {
                ans.add(e1);
                i1++;
            } else {
                ans.add(e2);
                i2++;
            }
        }
        return ans;
	}
	
	void printList(LinkedList<Pnode> list) {
		for(Pnode item:list)
        {
            System.out.print(item.co+"X ^"+item.power+" + ");
        }
	}
	
    public static void main(String[] args) {        
    	Scanner in = new Scanner(System.in);
    	
    	PolynomialAddition obj = new PolynomialAddition();
    	LinkedList<Pnode> list1 = obj.makeList(in);
    	obj.printList(list1);
    	
    	LinkedList<Pnode> list2 = obj.makeList(in);
    	obj.printList(list2);
    	
    	LinkedList<Pnode> result = obj.addLists(list1, list2);
    	obj.printList(result);
    	
    	in.close();
    }
}
