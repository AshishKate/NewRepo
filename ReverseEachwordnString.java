package interview;

public class ReverseEachwordnString {

	public static void main(String[] args) {

		String str = "Hello world ";

		String str1 = "";
		String arr[] = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			str1 = arr[i];

			for (int j = str1.length()-1; j >= 0; j--) {

				System.out.print(str1.charAt(j));

			}

		}

	}

}
 