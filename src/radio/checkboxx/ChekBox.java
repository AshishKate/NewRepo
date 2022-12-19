package radio.checkboxx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChekBox {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/radio-button");

		WebElement ch1 = driver.findElement(By.xpath("//label[contains(text(),'Yes')]"));

		boolean disp = ch1.isDisplayed();
		System.out.println(disp);

		boolean en = ch1.isEnabled();
		System.out.println(en);
		boolean sel = ch1.isSelected();
		System.out.println(sel);

		ch1.click();
		 disp = ch1.isDisplayed();
		System.out.println(disp);

		en = ch1.isEnabled();
		System.out.println(en);
		sel = ch1.isSelected();
		System.out.println(sel);
		
		driver.close();

	}

}
