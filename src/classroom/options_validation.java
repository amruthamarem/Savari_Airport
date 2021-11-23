package classroom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class options_validation {
	
	public WebDriver driver;
	
  @Test
  public void options() {
	  
	  List<WebElement> allvalues = new Select(driver.findElement(By.id("day"))).getOptions();
	  //print values by index mode
	  System.out.println(allvalues.get(21).getText());
	  
	  for (int i = 0; i < allvalues.size(); i++) {
		  
		  System.out.println(allvalues.get(i).getText());
		  
		  if (allvalues.get(i).getText().contains("31")) {
			  
			  System.out.println(allvalues.get(i).getText());
			  System.out.println("Pass");
			
		} else { System.out.println("Not there Fail"); }
		
	}
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\\\Amrutha selenium\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/reg/?app_id=1140740696088074&logger_id");
	  driver.manage().window().maximize();
	    
  }
  
  
  @AfterTest
  public void afterTest() {
  }

}
