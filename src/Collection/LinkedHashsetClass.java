package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetClass {

	public static void main(String[] args) {
		LinkedHashSet link = new LinkedHashSet();
		link.add("Arvind");
		link.add("Raju");
		link.add(567);
		link.add(456);
		link.add(67.9f);
		link.add(null);
		link.add("Arvind");
		link.add(null);
		link.add('A');
		
		System.out.println(link.size());
		System.out.println(link.contains(null));
		System.out.println(link.isEmpty());
		System.out.println(link);
		
		
		System.out.println("--Print info using iterator--");
		Iterator itr = link.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
			
		}
		System.out.println("--Print info using for each loop--");
		for(Object obj:link) {
			System.out.println(obj);
		}
		link.remove(2);
		
		link.clear();
		System.out.println(link.isEmpty());
		System.out.println(link.size());
	}

}
