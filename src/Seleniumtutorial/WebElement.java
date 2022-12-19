package Seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
	public static void main(String[] args) {

		/*
		 * Webelement on webpage is dispaly or not is enabeled or not is selected or not
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		org.openqa.selenium.WebElement element = driver.findElement(By.name("login"));
		element.isDisplayed();
		element.isEnabled();
		element.isSelected();
		driver.close();

	}

}
