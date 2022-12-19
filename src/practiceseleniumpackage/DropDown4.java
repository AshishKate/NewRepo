package practiceseleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown4 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		

		driver.findElement(By.id("withOptGroup")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'Group 2, option 1')]")).click();
		
		
		
		
		   
		   
		   
		   
		   
		   
		  
		  
		  
		  
		  
		
		
	}

}
