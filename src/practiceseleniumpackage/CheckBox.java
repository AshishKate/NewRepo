package practiceseleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/radio.html");

		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='checkbox1']"));
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='checkbox2']"));
		checkbox2.click();
		WebElement checkbox3 = driver.findElement(By.xpath("//input[@value='checkbox3']"));
		checkbox3.click();
		checkOrUncheckBox(driver);
	}

	// To check the check box is selected or not if selected uncheck it and if
	// uncheck check it

	public static void checkOrUncheckBox(WebDriver driver) {

		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement each : checkboxes) {
			boolean flag = each.isSelected();

			if (flag) {
				System.out.println("It is checked");
			} else  {
				each.click();

			}

		}

	}
}
