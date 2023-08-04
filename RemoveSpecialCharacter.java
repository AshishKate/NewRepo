package interview;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {

		String str = "jyasgdj62346bn d7v*8hd";

		  String str1=str.replaceAll("[^a-zA-Z-0-9]", "");
		
		System.out.println(str1);

	}

}
