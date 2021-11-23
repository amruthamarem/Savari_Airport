package HighLevelBases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Frames {
	public WebDriver driver;
	public Actions action;
	
  @Test
  public void clickable() {
	  
	  //iFrame concept by using id or webelement
	  driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	  
	  //Elements which needs to drag
	  WebElement DragFrom = driver.findElement(By.id("draggable"));
	  
	  //Elements which needs to drop
	  WebElement DropTo = driver.findElement(By.id("droppable"));
	  
	  //Using action class for drag and drop
	  action = new Actions(driver);
	  
	  // Dragged and dropped.
		action.dragAndDrop(DragFrom, DropTo);
		action.build().perform();
	    
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Amrutha selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.manage().window().maximize();
	      
  }

  @AfterTest
  public void afterTest() {
  }

}
