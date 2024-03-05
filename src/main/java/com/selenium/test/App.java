package com.selenium.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
    	 WebDriverManager.chromedriver().setup();
         
         
         ChromeOptions chromeOptions = new ChromeOptions();
      
        //chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--headless");
         
      WebDriver  driver = new ChromeDriver(chromeOptions);
      
      //get the url of the jenkins project
    //  driver.get("http://localhost:8081/contact.html");
      driver.get("http://54.90.161.198:8084/contact.html");

      
      
      
      
      //enable 3 minute wait time
      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      
      
      
      //Locate user name and enter details
      driver.findElement(By.id("inputName")).sendKeys("loki");
      try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
      
      //Locate last name and enter details
      driver.findElement(By.id("inputNumber")).sendKeys("12345");
      
      driver.findElement(By.id("inputMail")).sendKeys("email@email.com");
      driver.findElement(By.id("inputMessage")).sendKeys("message");

      try 
      {
  		Thread.sleep(1000);
  	} 
      catch (InterruptedException e) 
      
      {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}  
      //Locate login button for facebook and enter details
      driver.findElement(By.id("my-button")).click();

      try {
    	  
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
      
      driver.quit();
      System.out.println("Script run successfully");
    }
}
