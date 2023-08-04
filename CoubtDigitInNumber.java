package interview;

import java.util.Scanner;

public class CoubtDigitInNumber {

	public static void main(String[] args) {

		System.out.println("Enter The Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 0;
		num = a;

		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}

		System.out.println("The count of digit in " + a + " is " + count);

	}
}
