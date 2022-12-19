package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QaToll {

	 public static void main(String[] args) {
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver chdriver = new ChromeDriver(); 
			chdriver.manage().window().maximize();

			chdriver.get("https://demoqa.com/checkbox");
			
			 WebElement checkbox = chdriver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']//span//label[@for='tree-node-home']"
					+ "//span//*[@stroke='currentColor' and @fill='currentColor' and @class='rct-icon rct-icon-uncheck' ]"));
			
			 checkbox.click();
			 
	}
}
