package Logical.Program;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateValuesinStringParagraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc abc iuf uif iuf nbm nbm pou pou";
		System.out.println(str.length());
		String [] ar = str.split(" ");
		System.out.println(ar.length);
		HashMap<String, Integer> mp= new HashMap<String, Integer>();
		for(int i=0; i<=ar.length-1; i++) {
			String s1 = ar[i];
			if(mp.containsKey(s1)) {
				mp.put(s1, mp.get(s1)+1);
			}
			else {
				mp.put(s1, 1);
			}
		}
		Set<String> keys= mp.keySet();
		for(String key:keys) {
			System.out.println(key + ":" + mp.get(key));
		}
	}

}
