package interview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
	public static void main(String[] args) throws IOException {

		FileWriter fl = new FileWriter(
				"C:\\Users\\Dev\\eclipse-workspace\\FirstProject\\src\\interview\\file.txt\\file123.txt");

		BufferedWriter br = new BufferedWriter(fl);

		br.write("hey");
		br.write("How are you");
		br.write("my name is ashish");
		br.write("thank you");

		System.out.println("Finished");

		br.close();

	}

}
