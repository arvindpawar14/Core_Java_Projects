package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example5 {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.add("Pallavi");
		link.add(675);
		link.add("Arvind");
		link.add(57.6f);
		link.add(null);
		link.add(null);
		link.add("Arvind Pawar");
		
		System.out.println(link.size());
		System.out.println(link.isEmpty());
		System.out.println(link.get(3));
		System.out.println(link.contains("Arvind"));
		System.out.println(link);
		
		System.out.println("--Right Shift Operation--");
		link.add(1, "Pallavi");
		System.out.println(link);
		
		System.out.println("--Left Shift Operation--");
		link.remove(1);
		System.out.println(link);
		
		System.out.println("--Modify Shift Operation--");
		link.set(1, "Raju");
		System.out.println(link);
		
		System.out.println("----Print info using Iterator Cursor--");
		Iterator itr = link.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---Print info using List Iterator--");
		ListIterator lik = link.listIterator();
		while(lik.hasNext()) {
			System.out.println(lik.next());
		}
		System.out.println("--Print info using for loop--");
		for(int i=0; i<=link.size()-1; i++)
		{
			System.out.println(link.get(i));
		}
		System.out.println("--Print info using while loop--");
		for(Object obj:link) {
			System.out.println(obj);
		}

	}

}
