package Seleniumtutorial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandel {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Get window handel gives us the id of the parent window or default window id

		WebElement var = driver.findElement(By.id("")); // -- for first window
		String str1 = driver.getWindowHandle();
		System.out.println(str1); // -- give the id of default window

		// Get Window handels -- gives us the set of window ids

		Set<String> ids = driver.getWindowHandles();

		// How to get each window id

		// for each loop

		for (String each : ids) {
			System.out.println(each); // -- give the each window id
		}

		// By iterator
		Iterator<String> itr = ids.iterator();
		String str = itr.next(); // --- gives us the id of parent window
		String str2 = itr.next(); // -- gives us the id of child window

	}

}
