package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintDuplicateFromString {

	public static void main(String[] args) {

		String str = "ashish";

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);

			}

			else

			{
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getValue() +" " + entry.getKey());
			}

		}

	}

}
