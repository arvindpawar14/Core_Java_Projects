package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numSet = new TreeSet<>();
		numSet.add(65);
		numSet.add(78);
		numSet.add(90);
		numSet.add(24);
		numSet.add(14);
		numSet.add(65);
		
		
		Iterator<Integer> itr = numSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
