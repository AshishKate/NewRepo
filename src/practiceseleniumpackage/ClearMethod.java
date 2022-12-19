package practiceseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		 String str = driver.findElement(By.id("email")).getAttribute("placeholder");
		 System.out.println(str);
		  driver.findElement(By.id("email")).sendKeys("dvsa");
		  driver.findElement(By.id("email")).clear();
		  driver.findElement(By.id("email")).sendKeys("scshb");
		  String str2 = driver.findElement(By.id("email")).getAttribute("value");
		  System.out.println(str2);
		  
		  // clear method is used on webelement to clear the text in the textbox
		  
		  
		
	}

}
