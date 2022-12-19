package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver chdriver = new ChromeDriver();
		chdriver.manage().window().maximize();

		chdriver.get("https://www.facebook.com/");
		 String str=chdriver.findElement(By.xpath("//div//h2[contains(text(),'Facebook helps you connect and share with the people in your life')]")).getText();
		 System.out.println(str);
		chdriver.close();
		

	}

}
