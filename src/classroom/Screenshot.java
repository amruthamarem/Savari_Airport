package classroom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class Screenshot {
	public WebDriver driver;
	
  @Test
  public void alertsscreen() throws Exception {
	  
	  driver.findElement(By.id("alertButton")).click();
	  
	  Thread.sleep(3000);
	  
	  String str = driver.switchTo().alert().getText();
	  
	  System.out.println(str);
	  
	  Thread.sleep(3000);
	  
	  driver.switchTo().alert().accept();
	  
	  String ATM = "home screen";
	  
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  org.openqa.selenium.io.FileHandler.copy(scrFile, new File("D:\\Amrutha selenium\\Screenshot\\"+ATM+",png"));
	    
	  
  }
  
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
 System.setProperty("webdriver.chrome.driver", "D:\\Amrutha selenium\\chromedriver.exe");  
	  
	  driver = new ChromeDriver();
	  
	  driver.get("https://demoqa.com/alerts");
	  
	  String ATM = "Hyse";
	  
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  org.openqa.selenium.io.FileHandler.copy(scrFile, new File("D:\\Amrutha selenium\\Screenshot\\"+ATM+".png"));
	  
	  
  }
  

  @AfterTest
  public void afterTest() throws Exception {
	  
	  String ATM = "Amru";
	  
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(scrFile, new File("D:\\Amrutha selenium\\Screenshot\\"+ATM+".png"));
	  
	  driver.quit();
	  
	  
  }

}
