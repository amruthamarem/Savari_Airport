package classroom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Popupwindow {
	
	public WebDriver driver;
	
	
  @Test
  public void windowpopup() throws Exception {
	  
	  //Click on Separate Window
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(3000);
	  
	  //Click button
	  driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
	  
	  //Comeback to parent window handle
	  String moveto_parentwindow = driver.getWindowHandle();
	  
	  
	  //Child window handle
	  for( String child_win_handle : driver.getWindowHandles()) {
		  driver.switchTo().window(child_win_handle);
		  
		  }
	  
	   //Click on BlogButton
	  driver.findElement(By.linkText("Blog")).click();
	  Thread.sleep(3000);
	  
	  driver.close();
	  
	  //Again switch focus back to parent window
	  driver.switchTo().window(moveto_parentwindow);
	  Thread.sleep(3000);
	  
	  //Click on Home button 
	  driver.findElement(By.linkText("Home")).click();
	    
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Amrutha selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
