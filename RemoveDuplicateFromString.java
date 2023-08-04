package interview;

import java.util.HashSet;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		String str = "ashish";

		HashSet<Character> hs = new HashSet();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			   hs.add(str.charAt(i));
			sb.append(str.charAt(i));
		}

		System.out.println(hs.toString());

	}

}
