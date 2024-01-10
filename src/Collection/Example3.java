package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example3 {

	public static void main(String[] args) {
		Vector vObject = new Vector();
		vObject.add("Arvind");
		vObject.add("Arvind");
		vObject.add('A');
		vObject.add(567);
		vObject.add(56.7f);
		vObject.add('A');
		
		System.out.println(vObject.size());
		System.out.println(vObject.indexOf(2));
		System.out.println(vObject.capacity());
		System.out.println(vObject.get(3));
		System.out.println(vObject.contains('A'));
		System.out.println(vObject);
		
		//Manipulation Operation
		System.out.println("----Right Shift Operation----");
		vObject.add(1, "Rohit");
		System.out.println(vObject);
		System.out.println("----Left Shift Operation----");
		vObject.remove(1);
		System.out.println(vObject);
		System.out.println("---Modify information---");
		vObject.set(1, "Rohan");
		System.out.println(vObject);
		
		//Retrieval Operation
		System.out.println("-----Print info using Iterator Cursor---");
		Iterator itr = vObject.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("===Print info using list iterator Cursor===");
		ListIterator list = vObject.listIterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		System.out.println("Print info using Previous");
		while(list.hasPrevious()) {
			System.out.println(list.previous());
		}
		System.out.println("---Print info using enumuration cursor---");
		Enumeration enu = vObject.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		System.out.println("--Print info using For loop--");
		for(int i=1; i<=vObject.size()-1; i++) {
			System.out.println(vObject.get(i));
		}
		System.out.println("---Print info using each Loop--");
		for(Object reg:vObject) {
			System.out.println(reg);
		}
	
	}

}
