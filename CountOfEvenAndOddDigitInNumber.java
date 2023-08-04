package interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfEvenAndOddDigitInNumber {

	public static void main(String[] args) {

		int num = 4521;

		int ecount = 0;
		int ocount = 0;

		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				ecount++;

			}

			else {
				ocount++;
			}
			num = num / 10;

		}

		System.out.println("The even count = " + ecount + " and " + " odd count = " + ocount);

	}

}
