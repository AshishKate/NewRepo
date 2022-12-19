package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLocator {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver chdriver = new ChromeDriver(); 
		chdriver.manage().window().maximize();

		chdriver.get("https://www.facebook.com/");
		
		By emaillocator = By.name("email");
		WebElement emailtextbox = chdriver.findElement(emaillocator);
		
		emailtextbox.sendKeys("Ashish Kate");
		chdriver.findElement(By.name("pass")).sendKeys("Ashish@123");
		chdriver.findElement(By.xpath("//input[@id='pass' and @aria-label='Password']")).click();
	}

}
