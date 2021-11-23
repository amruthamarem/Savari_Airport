package HighLevelBases;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Assert_Verify {
	public WebDriver driver;
	
  @Test
  public void fun() {
	//correct title is "Home - Software Testing Material" 
	  //We took title as "Material" to make the test fail
	  
	  String ActualTitle = "Material";
	  String ExpectedTitle = driver.getTitle();
	  
	  //1St Statement
	  System.out.println("Assertion Starts here...");
	  
	  try {
		  //2nd Statement----- Comparing condition verification should move
		 Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	} catch (Throwable t) {
		//3rd Statement
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("A Blog is for Software Testers");
			}
	  driver.quit();
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Amrutha selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.softwaretestingmaterial.com");
	  driver.manage().window().maximize();
	    
  }

  @AfterTest
  public void afterTest() {
  }

}
