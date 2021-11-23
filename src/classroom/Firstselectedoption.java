package classroom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Firstselectedoption {
	
	public WebDriver driver;
		
  @Test
  public void options() throws Exception {
	  
	  WebElement ele = new Select(driver.findElement(By.id("day"))).getFirstSelectedOption();
	  Thread.sleep(3000);
	  
	  System.out.println(ele.getText());
	  
	  if (ele.getText().equalsIgnoreCase("12")) {
		  
		  System.out.println("Yes Its there Passed");
		
	} 
	  else {

		  System.out.println("Not There Failed");
	}
	    
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Amrutha selenium\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/reg/?app_id=1140740696088074&logger_id");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
