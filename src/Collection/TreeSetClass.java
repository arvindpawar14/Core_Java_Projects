package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
		tree.add(567);
		tree.add(789);
		tree.add(898);
		tree.add(345);
		tree.add(878);
		tree.add(900);
		tree.add(456);
		tree.add(567);
		tree.add(890);
		tree.add(678);
		
		System.out.println(tree);
		System.out.println(tree.size());
		System.out.println(tree.isEmpty());
		System.out.println(tree.contains(567));
		System.out.println(tree);
		
		tree.remove(567);
		tree.pollFirst();
		System.out.println(tree);
		
		tree.pollLast();
		System.out.println(tree);
		
		System.out.println(tree.first());
		
		System.out.println(tree.last());
		
		System.out.println("--Print using iterator Cursor--");
		Iterator itr = tree.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---Print info using Each Loop--");
		for(Object obj:tree) {
			System.out.println(obj);
		}
		tree.clear();
		System.out.println(tree.isEmpty());
		System.out.println(tree.size());
	}

}
