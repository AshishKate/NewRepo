package interview;

public class PallindromeStrimg {

	public static void main(String[] args) {

		String str = "java";

		String str1 = "";

		for (int i = 0; i < str.length(); i++) {
			str1 = str1 + str.charAt(i);
		}

		if (str.equals(str1)) {
			System.out.println("pallindrome");
		}

		else {
			System.out.println("Not Pallindrome");
		}

	}

}
