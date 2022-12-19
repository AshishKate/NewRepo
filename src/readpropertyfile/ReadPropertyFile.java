package readpropertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {

		String file = "C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\read.properties";

		FileInputStream fis = new FileInputStream(file);

		Properties prop = new Properties();
		prop.load(fis);

		String str = prop.getProperty("BaseURl");

		String str1 = prop.getProperty("UserName");
		String str2 = prop.getProperty("Password");

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);

	}
}
