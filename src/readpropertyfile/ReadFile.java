package readpropertyfile;

import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		PropertyHelper ph = new PropertyHelper(System.getProperty("user.dir") + "\\read.properties");

		ph.getKeyValue("BaseURl");
		ph.getKeyValue("UserName");
		ph.getKeyValue("Password");

	}
}
