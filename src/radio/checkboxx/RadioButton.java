package radio.checkboxx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.findElement(By.xpath("//input[@value='Option 1']")).click();
		driver.findElement(By.xpath("//input[@value='Option 2']")).click();
		 WebElement op1 = driver.findElement(By.xpath("//input[@value='Option 2']"));
		 op1.click();
		 boolean flag1=op1.isSelected();
		 System.out.println(flag1);
		driver.close();
		
		
		

	}

}
