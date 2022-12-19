package readpropertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyHelper {
	Properties prop;

	PropertyHelper(String filename) throws IOException {

		FileInputStream fis = new FileInputStream(filename);

		prop = new Properties();
		prop.load(fis);

	}

	public void getKeyValue(String key) {

		String str = prop.getProperty(key);
		System.out.println(str);

	}

}
