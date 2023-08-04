package interview;

public class PallindromeString {

	public static void main(String[] args) {

		String str = "kakan";

		String str1 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);

		}

		if (str.equals(str1)) {
			System.out.println(str + " is pallindrome string");
		}

		else {
			System.out.println(str + " is not pallindrome");
		}

	}

}
