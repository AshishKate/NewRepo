package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QaTollchecjbox {

	 public static void main(String[] args) {
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver chdriver = new ChromeDriver(); 
			chdriver.manage().window().maximize();

			chdriver.get("https://demoqa.com/radio-button");
			
			chdriver.findElement(By.xpath("//*[contains(text(),'Impressive')]")).click();
			
	}
}
