package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpiciteWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys("jshc");
		driver.findElement(By.name("passh")).sendKeys("cghsdc"); //if Webpage doesn't contain the element it will wait for that time 
//		that we have provided 
		
		driver.findElement(By.name("login")).click();
		
		
		
		

	}

}
