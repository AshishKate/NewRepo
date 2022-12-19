package practiceseleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EplicteWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://demoqa.com/radio-button");
		
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		
		
		WebDriverWait wt = new WebDriverWait(driver, 10);
		/*
		 * WebElement noRadio = driver.findElement(By.xpath("//label[@for='noRadio']"));
		 * ExpectedCondition<WebElement> in =
		 * ExpectedConditions.elementToBeClickable(noRadio); wt.until(in);
		 */		
	//	wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//label[@for='noRadio']"))));
		
	//	wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("sfgfg")));
	//	wt.until(ExpectedConditions.elementToBeSelected(By.id("noRadio")));
	//	wt.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//label[@for='noRadio']"))));
		wt.until(ExpectedConditions.alertIsPresent());
		
		System.out.println("wait is over");
		driver.findElement(By.xpath("//label[@for='noRadio']")).click();
		
		
		
	}

}
