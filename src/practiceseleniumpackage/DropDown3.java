package practiceseleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		
		
		
		 WebElement fruits = driver.findElement(By.id("fruits"));
		 Select sel= new Select(fruits);
		 
		  boolean flag=sel.isMultiple();
		  
		  sel.selectByValue("apple");
		  sel.selectByVisibleText("Grape");
		  sel.selectByVisibleText("Orange");
		  
		   List<WebElement> all = sel.getOptions(); //get all option is method wchich give us the list of web element
		  int num= all.size();
		  for (WebElement each:all) {
			  System.out.println(each.getText());
		  }
		   List<WebElement> selopt = sel.getAllSelectedOptions();  // .getAllSelectedOptions() get us the list of selected option
		   for (WebElement each:selopt) {
			   System.out.println(each.getText());
		   }
		    WebElement firstsel = sel.getFirstSelectedOption();  //getFirstSelectedOption(); get us the first selected web element8|
	    System.out.println(firstsel.getText());
		   
		   
		   
		   
		   
		   
		  
		  
		  
		  
		  
		
		
	}

}
