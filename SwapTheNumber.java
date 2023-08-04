package interview;

import java.util.Scanner;

public class SwapTheNumber {

	public static void main(String[] args) {

		System.out.println("Enter The Number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
// Using Third VAriable

		int c = a;
		a = b;
		b = c;

		System.out.println(a);
		System.out.println(b);

		// Without Using Third Variable

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);

	}

}
