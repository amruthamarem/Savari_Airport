package bestPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TestNGSavaari {
	
	public WebDriver driver;
	
	
@Test(priority = 1)
  public void airport() {
	//Click on Airport
	  driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[1]/div[3]/a/span")).click();
	  
  }
  
  @Test(priority = 2)
  public void searchtravel() throws Exception {
	  
	//Enter City name
			driver.findElement(By.id("fromCityList")).sendKeys("Delhi");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-home[1]/div[1]/app-home-container[1]/div[1]/div[1]/div[2]/app-local[1]/div[1]/form[1]/div[1]/div[2]/ngb-typeahead-window[1]/button[1]/ngb-highlight[1]")).click();
			
			//Select dropdown value
			new Select(driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-local/div/form/div[2]/div[2]/select"))).selectByVisibleText("Cab to the Airport");
					
					driver.findElement(By.id("search_places")).sendKeys("jantar");
					Thread.sleep(6000);
					driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-home[1]/div[1]/app-home-container[1]/div[1]/div[1]/div[2]/app-local[1]/div[1]/form[1]/div[3]/div[2]/div[1]/ng4geo-autocomplete[1]/div[1]/ul[1]/li[1]/a[1]")).click();
					

					//Calander
					driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-local/div/form/div[4]/div[1]/div/p-calendar[1]/span/input")).click();
					driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-local/div/form/div[4]/div[1]/div/p-calendar[1]/span/div/div/div/div[2]/table/tbody/tr[5]/td[3]/span")).click();
					
					
					new Select(driver.findElement(By.id("pickUpTime"))).selectByVisibleText("5:00 PM");
					
					driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-local/div/form/div[5]/div/div[1]/button")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Amrutha selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://savaari.com");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  //driver.quit();
	  //driver.close();
	  
 }

}
