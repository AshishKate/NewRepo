package interview;

import java.util.Scanner;

public class RevesreTheNumber {

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

		System.out.println("The Reverse OF the " + a + " is " + rev);

		// Approach 2 using StringBuilder And StringBufer

		StringBuilder sb = new StringBuilder();

		System.out.println(sb.reverse());

	}

}
