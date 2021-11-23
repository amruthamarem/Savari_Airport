package classroom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Autoit {
	public WebDriver driver;
	public Actions action;
  @Test
  public void fun() throws Exception {
	  
		/*
		 * WebElement ele = driver.findElement(By.id("myFile"));
		 * ele.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\quality.jpg");
		 */
	  
	  driver.findElement(By.id("myFile")).click();
	  Thread.sleep(10000);
	  
	  Runtime.getRuntime().exec("D:\\Amrutha selenium\\hyse.autoit.exe");
    
  }
  
  
@BeforeTest
  public void beforeTest() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Amrutha selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	    
  }

  @AfterTest
  public void afterTest() {
  }

}
