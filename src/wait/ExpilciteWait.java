package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpilciteWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // to delay the no such element exception if is
																		// there any

		driver.get("https://demoqa.com/radio-button");

		driver.findElement(By.xpath("//label[contains(text(),'Impressive')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		
		wait.until(ExpectedConditions.alertIsPresent());
		/*
		 * wait until the expected conditons--
		 * 1.visibility of element located (need the webelement)
		 * 2.element to be selected
		 * invisibility of
		 */
		
		
		
		
		

	}

}
