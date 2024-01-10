package Logical.Program;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateValuesinStringParagraph1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "arv arv ikn ikn pok pok shddjs kadfh ury ury skjdh ";
		String [] ar = str.split(" ");
		System.out.println(ar.length);
		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		for(int i=0; i<=ar.length-1; i++) {
			String s1 = ar[i];
			if(mp.containsKey(s1)) {
				mp.put(s1, mp.get(s1) + 1);
			}
			else {
				mp.put(s1, 1);
			}
		}
		Set<String> keys = mp.keySet();
		for(String key:keys) {
			System.out.println(key + ":"+ mp.get(key));
		}
	}

}
