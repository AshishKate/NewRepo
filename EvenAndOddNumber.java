package interview;

import java.util.Scanner;

public class EvenAndOddNumber {

	public static void main(String[] args) {

		System.out.println("Enter The Number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("even ");
		}

		else {
			System.out.println("odd");
		}

	}

}
