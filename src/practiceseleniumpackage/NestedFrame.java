package practiceseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");

		driver.switchTo().frame("frame1");

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@srcdoc='<p>Child Iframe</p>']")));

		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Child Iframe')]")).getText());

		driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[contains(text(),'Alerts')]")).click();
	}
}
