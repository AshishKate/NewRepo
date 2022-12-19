package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver chdriver = new ChromeDriver();
		chdriver.manage().window().maximize();

		chdriver.get("https://www.facebook.com/");
		 WebElement facebook =chdriver.findElement(By.xpath("fbIndex UIPage_LoggedOut _-kb _605a b_c3pyn-ahh chrome webkit win x1 Locale_en_GB cores-lt4 _19_u"));
		String str= facebook.getText();
		System.out.println(str);
		

	}

}
