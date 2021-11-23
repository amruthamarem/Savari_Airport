package classroom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Information_Commands {
	
	public WebDriver driver;
	
	
  @Test(priority = 1)
  public void gmail() throws Exception {
	  
	   String str1 = driver.findElement(By.linkText("Gmail")).getText();
	   Thread.sleep(3000);
	  System.out.println(str1);
	  
  }
  
  @Test(priority = 2)
  public void google_image( ) throws Exception {
	  
	  String str2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).getAttribute("alt");
	  Thread.sleep(3000);
	  System.out.println(str2);
	  
  }
  
  @Test(priority = 3)
  public void searchbutton() throws Exception {
	  
	  String str3 = driver.findElement(By.name("btnk")).getAttribute("value");
	  Thread.sleep(3000);
	  System.out.println(str3);
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Amrutha selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	    
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
  }

  
}
