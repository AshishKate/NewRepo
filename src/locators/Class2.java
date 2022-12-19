package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

final class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver chdriver = new ChromeDriver();
		chdriver.manage().window().maximize();

		chdriver.get("https://www.facebook.com/");
		chdriver.findElement(By.linkText("Messenger")).click();

		chdriver.close();
	}

}
