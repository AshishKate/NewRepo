package interview;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str = "jaav";
		String str1 = "agavj";

		char arr[] = str.toCharArray();
		char arr1[] = str1.toCharArray();

		Arrays.sort(arr);

		Arrays.sort(arr1);

		if (Arrays.equals(arr, arr1)) {
			System.out.println("Anagarm");
		} else {
			System.out.println("Not Anagarm");
		}

	}

}
