package interview;

public class ReverseTheNumber {

	public static void main(String[] args) {

		int num = 123654;
		int rev = 0;
		int rem;
		int a = num;
		while (a > 0)

		{

			rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;

		}

		System.out.println("The reverse Of The Number is " + rev);

	}

}
  