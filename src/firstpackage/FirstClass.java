package firstpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver chdriver= new ChromeDriver();
		chdriver.get("https://www.facebook.com/");
		
		chdriver.get("https://www.youtube.com/");
		chdriver.close();
		
	}
	

}
