package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClass {

	public static void main(String[] args) {
		// There are alert and frames and windows we switch method use

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/frames");

		driver.switchTo().frame("sampleHeading");
		String str = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(str);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[contains(text(),'Alerts')]")).click();

	}

}
