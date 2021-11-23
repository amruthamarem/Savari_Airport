package classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseOver {
	
	public WebDriver driver;
	
	public Actions action;
		
	
  @Test
  public void Mouseover() throws Exception {
	  
	  action = new Actions(driver);
	 
	WebElement ele = driver.findElement(By.linkText("SwitchTo"));
	  
	//Action command
	action.moveToElement(ele).build().perform();
	Thread.sleep(3000);
	
	//Windows
	driver.findElement(By.linkText("Windows")).click();
	Thread.sleep(3000);
	
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Amrutha selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Windows.html");
	   
  }
  
  

  @AfterTest
  public void afterTest() {
  }

}
