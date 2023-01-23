package Linked_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class A1 {
public static void main(String[] args) {
	LinkedList l1 = new LinkedList();
	l1.addLast(true);
	l1.add("harsha");
	l1.add("ShaShanki");
	l1.addFirst(false);
	l1.add("hemu");
	l1.addLast("loki");
	l1.addFirst("Sharoon");
	System.out.println(l1);
	System.out.println(l1.getFirst());
	System.out.println(l1.getLast());
	System.out.println(l1.get(2));
	System.out.println(l1.remove(2));
	System.out.println(l1.removeFirst());
	System.out.println(l1.removeLast());
	System.out.println(l1);
	ArrayList a1 = new ArrayList(l1);
	System.out.println(a1);
	LinkedList l2 = new LinkedList(a1);
	System.out.println(l2);
}
}
