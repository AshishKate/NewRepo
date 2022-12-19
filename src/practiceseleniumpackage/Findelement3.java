package practiceseleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement3 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		 List<WebElement> webelement = driver.findElements(By.xpath("//form//div//input"));
		  webelement.get(0).sendKeys("dvsadv");
		 webelement.get(1).sendKeys("cs cv");
		 
		

		driver.close();

	}

}
