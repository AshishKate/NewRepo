package interview;

public class CountOfOcceranceInString {

	public static void main(String[] args) {

		String str = "ashsish";

		char ch = 's';
		int count = 0;

		for (int i = 0; i < str.length(); i++)

		{
			if (str.charAt(i) == ch) {
				count++;
			}

		}

		System.out.println("The count of " + ch + " in string is " + count);

	}

}
