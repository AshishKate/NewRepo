package practiceseleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliciteWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("Ashish");
		driver.findElement(By.id("pass")).sendKeys("Ashsish@212");
		driver.findElement(By.name("login")).click();

		driver.close();

		driver = new ChromeDriver();  // after closing of that driver implicit wait is not applicable once session is end
		driver.findElement(By.id("email")).sendKeys("Ashish");
		driver.findElement(By.id("pass")).sendKeys("Ashsish@212");
		driver.findElement(By.name("login")).click();

	}

}
