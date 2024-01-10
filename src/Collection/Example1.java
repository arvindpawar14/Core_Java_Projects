package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		ArrayList ap = new ArrayList();
		ap.add("Arvind");
		ap.add("Raju");
		ap.add(656);
		ap.add(78.9f);
		ap.add("Dnyaneshwar");
		ap.add('A');
		ap.add("Sanjeev");
		ap.add("Arvind");
		ap.add("Pravin");
		
		System.out.println(ap.size());
		System.out.println(ap.hashCode());		
		System.out.println(ap.remove(4));		
		System.out.println(ap.isEmpty());	
		System.out.println(ap);		
		System.out.println(ap.get(3));
		System.out.println(ap.lastIndexOf(5));
		System.out.println("-------Adding Elements-----");
		ap.add(3, "Rahul");
		System.out.println(ap);
		ap.remove(4);
		System.out.println(ap);
		ap.set(2, "Sudhir");
		System.out.println(ap);
		
		Iterator mn = ap.iterator();
		while(mn.hasNext()) {
			System.out.println(mn.next());
		}
		
		

	}

}
