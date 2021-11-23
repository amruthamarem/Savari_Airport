package classroom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Boolean_Oneway {
	public WebDriver driver;
  @Test
  public void options() {
	  //Switching to Round trip
	  driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/div/div/label[2]/span")).click();
	  
	  //Print condition True or False
	    boolean printcondition = driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/div/div/label[2]/span")).isDisplayed();
	    
	    System.out.println(printcondition);
	
	     WebElement element = driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/div/div/label[2]/span"));
	     
	     if (element.isEnabled()) {
	    	 
	    	 System.out.println("Pass");
			
		} else { System.out.println("Fail");

		}
	    
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\\\Amrutha selenium\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https:/savaari.com");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	    	    
  }

}
