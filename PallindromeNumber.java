package interview;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter The Number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
// Approach 1
		int num = a;
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		if (rev == a) {
			System.out.println(a + " is pallindrome number");
		} else {
			System.out.println(a + " is not pallindrome");
		}

	}

}
