package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator4 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver chdriver = new ChromeDriver();
		chdriver.get("https://www.facebook.com/");
	
		
		chdriver.findElement(By.linkText("messenger")).click();
		
		
		
	}

}
