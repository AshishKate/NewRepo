package practiceseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitButton {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Welcome");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Ashish");
		driver.findElement(By.xpath("//button[@name='login']")).submit();
		driver.findElement(By.xpath("//*[@id=\"u_0_6_vB\"]/div/i")).click();
		

		// submit method is the second option for the click button

	}

}
