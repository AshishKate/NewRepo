package interview;

import java.util.Iterator;

public class CountOfvowelandConsonnent {
	public static void main(String[] args) {

		String str = "ashish";
		char arr[] = str.toCharArray();
		int a = 0;
		int b = 0;
		for (char string : arr) {

			switch (string) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				a++;
				break;

			default:
				b++;
			}

		}

		System.out.println("The vowel count is " + a);
		System.out.println("The consonenet count is " + b);

	}

}
