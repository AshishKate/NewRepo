package interview;

import java.util.HashSet;

public class ArrayContainDuplicateOrNot {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 6 };

		int len = arr.length;

		HashSet<Integer> hs = new HashSet();

		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}

		int len1 = hs.size();
		if (len1 == len) {
			System.out.println("no duplicate contain");
		}

		else {
			System.out.println("Contain Duplicate");
		}

	}

}
