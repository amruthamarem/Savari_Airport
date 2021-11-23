package bestPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Practice {

	public WebDriver driver;
	

 @Test
  public void student() {
	  //Enter on name
	 driver.findElement(By.id("firstName")).sendKeys("Roy");
	 driver.findElement(By.id("lastName")).sendKeys("Matrix");
	  
	 //Enter on email id
	 driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("roymatrix@gmail.com");
	 
	 //Enter Gender
	 driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
	 
	 //Enter on mobile number
	 driver.findElement(By.id("userNumber")).sendKeys("9912345678");
	 
	 //Enter on date of birth
	 driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]")).click();
	 
	 
	  //Enter on subjects
	 driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).click();
driver.findElement(By.xpath("//div[contains(text(),'Maths')]")).sendKeys("Maths");

	 //Enter on hobbies
	driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();

	//Enter on picture
	driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]")).click();
	
	//Enter on current address
     driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("bapuji colony");
     
     //Enter on select state and city
     new Select(driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"))).selectByVisibleText("Rajasthan");
     new Select(driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]"))).selectByVisibleText("Jaipur");
     
     //Enter on submit
     driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
 }
     
@BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Amrutha selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  
	  
  }

  
  @AfterTest
  public void afterTest() {
	  
	  //driver.quit();
	  //driver.close();
  }
  
}

