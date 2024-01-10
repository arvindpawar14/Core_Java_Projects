package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Example {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Arvind");                 // Duplicates are allowed in arrayList
		al.add(null);                     // allows any null values in arrayList
		al.add("Pallavi");                // Storage type index
		al.add("Arvind");                 // Order of insertion is Maintain
		al.add(56.7f);                    // Default Capacity of ArryList is 10.
		al.add(456);
		al.add('C');
		al.add(879);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.get(5));
		System.out.println(al);
		// Manipulation operation
		System.out.println(al.lastIndexOf(4));
		System.out.println("--------Right Shift Operation-----");
		al.add(2, "Pooja");
		System.out.println(al);
		System.out.println("------Left Shift Operation------");
		al.remove(3);
		System.out.println(al);
		System.out.println("Modify Information");
		al.set(3, "Dnyaneshwar");
		System.out.println(al);
		System.out.println("--------Print using iterator Cursor------");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
