package practiceseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		 WebElement email = driver.findElement(By.id("email"));
		 email.sendKeys("wlcome");
		 WebElement pass = driver.findElement(By.id("pass"));
		 pass.sendKeys("ashsish");
		 WebElement login = driver.findElement(By.name("login"));
		 login.click();

		driver.close();

	}

}
