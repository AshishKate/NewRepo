package practiceseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingLoc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		String str = driver.findElement(By.xpath("//*[contains(text(),'alden@example.com')]/preceding-sibling::div[3]"))
				.getText();
		System.out.println(str);
		String str1 = driver.findElement(By.xpath("//*[contains(text(),'alden@example.com')]/preceding-sibling::div[2]"))
				.getText();
		System.out.println(str1);
		String str2 = driver.findElement(By.xpath("//*[contains(text(),'alden@example.com')]/preceding-sibling::div[1]"))
				.getText();
		System.out.println(str2);
		String str3 = driver.findElement(By.xpath("//*[contains(text(),'alden@example.com')]"))
				.getText();
		System.out.println(str3);
		String str4 = driver.findElement(By.xpath("//*[contains(text(),'alden@example.com')]/following-sibling::div[1]"))
				.getText();
		System.out.println(str4);
		String str5 = driver.findElement(By.xpath("//*[contains(text(),'alden@example.com')]/following-sibling::div[2]"))
				.getText();
		System.out.println(str5);
		
		
	}

}
