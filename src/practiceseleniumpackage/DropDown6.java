package practiceseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown6 {
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");
		
		
		
		  driver.findElement(By.id("withOptGroup")).click();
		
		 
		 driver.findElement(By.xpath("//*[contains(text(),'A root option')]")).click();
	}

}
