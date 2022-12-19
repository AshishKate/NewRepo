package practiceseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");

		WebElement seldrp = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(seldrp);
		// select class is used to handle dropdown if there is select tag
		// and we need to pass webelement of that dropdown in that constructor of select
		// class

		sel.selectByVisibleText("Yellow");
		sel.selectByIndex(7);
		sel.selectByValue("5");
		sel.deselectByVisibleText("Black");

	}

}
