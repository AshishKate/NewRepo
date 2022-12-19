package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
	       WebElement element = driver.findElement(By.name("email"));
	       element.sendKeys("Welcome");
	       
	       String msg= element.getAttribute("value");  // method to get the value which we pass in the emailbox whatever text
	       //we have send in textbox.
	       System.out.println(msg);
	}
}
