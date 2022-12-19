package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver chdriver = new ChromeDriver();
		chdriver.manage().window().maximize();
		chdriver.get("https://www.youtube.com/");
		chdriver.findElement(By.xpath("//input[@id='search']")).sendKeys("tumhe jo maine dekha");
		chdriver.findElement(By.xpath("   //button//yt-icon[@class='style-scope ytd-searchbox']")).click();
		chdriver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();

	}

}
