package interview;

public class RevesreString {

	public static void main(String[] args) {

		String str = "akak";

		String str1 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);

		}
		
		System.out.println("The Reverse of String of "+ str1);

	}

}
