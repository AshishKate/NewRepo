package practiceseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/radio.html");
		driver.findElement(By.xpath("//input[@value='Option 1']")).click();
		driver.findElement(By.xpath("//input[@value='Option 2']")).click();
		  WebElement ele = driver.findElement(By.xpath("//input[@value='Option 3']"));
		  ele.click();
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isEnabled());
		System.out.println(ele.isSelected());
		

		
		
	}

}
