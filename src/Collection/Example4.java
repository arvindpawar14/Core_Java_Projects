package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example4 {

	public static void main(String[] args) {
		LinkedList ops = new LinkedList();
		ops.add("Arvind");
		ops.add("Raju");
		ops.add("Arvind");
		ops.add(789);
		ops.add(78.9f);
		ops.add('A');
		ops.add("Dnyaneshwar");
		
		System.out.println(ops.size());
		System.out.println(ops.contains(3));
		System.out.println(ops.isEmpty());
		System.out.println(ops.get(3));
		System.out.println(ops);
		
		//Manupulation Operation
		System.out.println("---Print info using Right Operation---");
		ops.add(2, "Pallavi");
		System.out.println(ops);
		
		System.out.println("--Print info using left operation----");
		ops.remove(2);
		System.out.println(ops);
		
		System.out.println("--Print info using modify---- ");
		ops.set(2, "Arjun");
		System.out.println(ops);
		
		//Retrosprctive Operation
		System.out.println("Print info using iterator Cursor");
		Iterator itr = ops.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println("Print info using List Iterator Cursor");
		ListIterator list = ops.listIterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		System.out.println("-----Print info using for loop----");
		for(int i=0; i<=ops.size()-1; i++) {
			System.out.println(ops.get(i));
		}
		System.out.println("--Print info using each Loop---");
		for(Object obj:ops) {
			System.out.println(obj);
		}
	}

}
