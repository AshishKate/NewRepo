package interview;

public class PrimeNumberOrNot {

	public static void main(String[] args) {

		int num = 7;
		boolean flag = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
			}
		}

		if (flag) {
			System.out.println(num + " is prime");
		}

		else {
			System.out.println(num + " is not prime");
		}

	}
}
