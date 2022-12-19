package Seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
//		How to launch browser
//		How to open url
//		How to capture url of page
//		How to capture pagesource of page
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		String str1 = driver.getTitle();
		System.out.println(str1);
		String str2 = driver.getCurrentUrl();
		System.out.println(str2);
		String str3 = driver.getPageSource();
		System.out.println(str3);
		
		driver.close();

	}

}
