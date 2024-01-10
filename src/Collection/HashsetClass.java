package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetClass {

	public static void main(String[] args) {

		HashSet has = new HashSet();
		has.add("Arvind");
		has.add(null);
		has.add(345);
		has.add(76.5f);
		has.add("Arvind");
		has.add(890);
		has.add('A');

		System.out.println(has.size());
		System.out.println(has.contains(null));
		System.out.println(has.isEmpty());
		System.out.println(has);
		has.remove(2);
		System.out.println("---Print info using iterator--");
		Iterator itr = has.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--Print info using while Loop--");
		for (Object obj : has) {
			System.out.println(obj);
		}
		System.out.println("Print info using Has Clear, Is Empty Methods---");
		has.clear();
		System.out.println(has.isEmpty());
		System.out.println(has.size());

	}

}
