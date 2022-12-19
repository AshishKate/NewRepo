package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver chdriver = new ChromeDriver();
		chdriver.manage().window().maximize();

		chdriver.get("https://www.facebook.com/");
		By emailtextloc = By.id("email");
		chdriver.findElement(emailtextloc).sendKeys("Hey hello");
		chdriver.findElement(By.name("pass")).sendKeys("pass");
		chdriver.findElement(By.name("login")).click();
		chdriver.close();
	}

}
