package HighLevelBases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assert {
	public WebDriver driver;
	
  @Test
  public void fun() {
	  //Correct title is "Welcome : Mercury Tours"
	  //We took as "Mercury Tours" to make the test fail
	  
	  String ActualTitle = "Mercury Tours";
	  String Expected = driver.getTitle();
	  
	  //1st Statement
	  System.out.println("Assertion Starts here....");
	  
	  //2nd Statement
	  assert

	  
	  //3rd Statement
	  System.out.println("A Blog for Software Testers");
	  driver.quit(); 
	  
  }
  
  	

@BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Amrutha selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  
	  
  }
  
  @AfterTest
  public void afterTest() {
  }

}
