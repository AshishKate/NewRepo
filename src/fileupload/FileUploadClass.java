package fileupload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.demo.guru99.com/test/upload/");

		driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\Env.properties");
		driver.findElement(By.name("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//[@id='res']/center[contains(text(),'1 file')]")));
		
		 String str=driver.findElement(By.xpath("//[@id='res']/center")).getText();
		 System.out.println(str);
		 
		 if (str.equals("1 file\nhas succesfully uploaded")) {
			 System.out.println("pass");
		 }
		 else {
			 System.out.println("fail");
		 }
		
		
		

	}

}
