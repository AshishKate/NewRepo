package interview;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InterviewQ {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// How to give Implicitly wait

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Explicite wait

		WebDriverWait wait = new WebDriverWait(driver, 5); // need to give driver and time in its constructor
		wait.until(ExpectedConditions.alertIsPresent());

		By text = By.id("email");
		wait.until(ExpectedConditions.elementToBeSelected(text));

		WebElement webelement = driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.elementToBeSelected(webelement));

		// Fluent wait
		// Thread Sleep

		Thread.sleep(5000);

		// Page loader timeout
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		// Data entry of text

		driver.findElement(By.id("email")).sendKeys("dsbx"); // sendkeys is used to send data in web element

		// click on link
		driver.findElement(By.id("login")).click(); // need click on button click method is used

		// Element is displayed ,selected ,enabled or not
		// following are the methods in web element

		WebElement loginbutton = driver.findElement(By.id("login"));
		loginbutton.isDisplayed();
		loginbutton.isEnabled();
		loginbutton.isSelected();

		// To check if check box is checked or not

		WebElement loginbutton1 = driver.findElement(By.id("login"));
		loginbutton1.isSelected(); // it will check the element is checked or not

		// find element on webpage

		driver.findElement(By.xpath("")); // it will find the element on the webpage

		// Get current window id

		driver.getWindowHandle(); // it will give us the main window id

		// Get current window url

		driver.getCurrentUrl();

		// Find all elements on the webpage

		List<WebElement> Webelements = driver.findElements(By.id("kh")); // it will give us the list of web element

		// Get title on the page
		driver.getTitle();

		// How to handle multiple window

		Set<String> Handels = driver.getWindowHandles(); // it will give us the set strings of id

		// Maximize window
		driver.manage().window().maximize();

		// How to co-ordinates of window

		Point position = driver.manage().window().getPosition();

		position.getX();
		position.getY();

		// Mouse over == Move to element

		// need to create instance of actions class
		Actions act = new Actions(driver); // need to provide driver as an parameter
		act.moveToElement(loginbutton1);

		// How to perform drag and drop

		act.dragAndDrop(loginbutton, loginbutton1); // need of source element and destination element

		// Second way to perform drag and drop
		act.clickAndHold(loginbutton).moveToElement(loginbutton1).release(); // need of source and destination element

		// keys

		driver.findElement(By.id("email")).sendKeys(Keys.ALT);
		act.sendKeys(Keys.ESCAPE);

		// How to work with alert
		// need to switch method

		driver.switchTo().alert().accept(); // accept the alert

		driver.switchTo().alert().dismiss(); // dismiss the alert

		// count of frames

		driver.findElement(By.id("farmes")).getSize();

		// How to work with frames
		// First need to switch the frame

		driver.switchTo().frame(1); // by index
		driver.switchTo().frame("frame"); // by name
		driver.switchTo().frame(loginbutton1); // by webelement
		driver.switchTo().parentFrame(); // navigate to parent frame

		// How to work with select
		// Select class is used to handle with dropdown

		Select sel = new Select(loginbutton1); // Here we need to pass the web element as parameter

		sel.selectByIndex(1);
		sel.selectByValue("1");
		sel.selectByVisibleText("vdgs");
		sel.getOptions(); // give us the list of web element

		// navigation
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().equals(sel);
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
