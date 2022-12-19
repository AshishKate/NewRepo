package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver chdriver = new ChromeDriver();
		chdriver.get("https://www.facebook.com/");
		
		By emailocator = By.name("email");
		
		WebElement emailtextbox =chdriver.findElement(emailocator);
		emailtextbox.sendKeys("Ashish kate");
		chdriver.findElement(By.name("pass")).sendKeys("Ashsh@2");
		
		chdriver.findElement(By.name("login")).click();

	}

}
