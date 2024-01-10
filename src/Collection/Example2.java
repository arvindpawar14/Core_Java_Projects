package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class Example2 {

	public static void main(String[] args) {
		ArrayList sb = new ArrayList();
		sb.add("Rohan");
		sb.add("Santosh");
		sb.add(567);
		sb.add("7767909704");
		sb.add('A');
		sb.add(89.9f);
		sb.add("Arvind");
		sb.add(null);
		System.out.println(sb.size());
		System.out.println(sb);
		System.out.println(sb.isEmpty());
		System.out.println(sb.get(3));
		System.out.println("------Right Shift Operation----");
		sb.add(1, "Akhil");
		System.out.println(sb);
		System.out.println("------Left Shift Operation----");
		sb.remove(4);
		System.out.println(sb);
		ArrayList sb1 = new ArrayList();
		Iterator itr = sb.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---------------------------------------");
		
		sb1.add("Dnyane");
		sb1.add("Santosh");
		sb1.add('B');
		sb1.add(76.5f);
		sb1.add(89);
		sb1.add(null);
		
		System.out.println(sb1.size());
		System.out.println(sb1);
		System.out.println(sb1.isEmpty());
		System.out.println(sb1.get(3));
		System.out.println("------Right Shift Operation----");
		sb1.add(1, "Arvind");
		System.out.println(sb1);
		System.out.println("------Left Shift Operation----");
		sb1.remove(4);
		System.out.println(sb1);
		Iterator itr1 = sb1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("Print info uing list iterator");
		ListIterator list = sb1.listIterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
	}

}
