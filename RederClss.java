package interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RederClss {

	public static void main(String[] args) throws IOException {

		// Approach 1
		FileReader file = new FileReader("C:\\Users\\Dev\\eclipse-workspace\\FirstProject\\src\\interview\\file.txt\\line.txt");

		BufferedReader rb = new BufferedReader(file);

		String str;

		while ((str = rb.readLine()) != null) {
			System.out.println(str);
		}

		// Approach 2

		File fl = new File("C:\\Users\\Dev\\eclipse-workspace\\FirstProject\\src\\interview\\file.txt\\line.txt");

		Scanner sc = new Scanner(fl);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}
