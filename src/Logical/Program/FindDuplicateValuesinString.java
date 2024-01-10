package Logical.Program;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateValuesinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aiufdskjfasdfefsdvmnadbagfliuwefkjb";
		HashMap<Character, Integer> mp =new HashMap<Character, Integer>();
		for(int i=0; i<=str.length()-1; i++) {
			char ch = str.charAt(i);
			if(mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch)+1);
			}
			else {
				mp.put(ch, 1);
			}
		}
		System.out.println(mp);
		Set<Character> keys = mp.keySet();
		System.out.println(keys);
		for(Character key:keys) {
			System.out.println(key + ":"+ mp.get(key));
		}
	}

}
