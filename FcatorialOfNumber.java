package interview;

public class FcatorialOfNumber {

	public static void main(String[] args) {

		int fact = 1;
		int num = 5;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		System.out.println("The factorial of " + num + " is " + fact);

	}
}
