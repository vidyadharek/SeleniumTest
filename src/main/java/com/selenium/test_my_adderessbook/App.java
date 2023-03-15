package com.selenium.test_my_adderessbook;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
        //load driver or set location of driver
    	  System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    	   
    	    //object of chrome options
    	    ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
    	    chromeOptions.addArguments("--remote-allow-origins=*");
            chromeOptions.addArguments("--disable-dev-shm-usage");
            chromeOptions.addArguments("--disable-extensions");
            chromeOptions.addArguments("--disable-gpu");
            chromeOptions.addArguments("--no-sandbox");
           // driver = webdriver.Chrome(options=chrome_options);
        
       // chrome_options = Options()
       // chrome_options.add_argument("--disable-extensions")
      //  chrome_options.add_argument("--disable-gpu")
      //  chrome_options.add_argument("--no-sandbox")
      //  driver = webdriver.Chrome(options=chrome_options)
            
    	    //pass the varibale to the driver
    	    WebDriver driver = new ChromeDriver(chromeOptions);
    	   
    	    System.out.println("selenium test case started");
    	   
    	    // open the web browser and enter application url
    	    driver.get("http://localhost:8081/");
        	
        	//wait for page to load
        	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        	
        	driver.findElement(By.className("carousel-control-prev")).click();
    	    
        	Thread.sleep(5000);
    	    
    	    driver.findElement(By.className("carousel-control-next")).click();
    	    
    	    Thread.sleep(5000);
    	    
    	    driver.findElement(By.className("carousel-control-prev")).click();
        	Thread.sleep(5000);
        	//quite the driver
    	driver.quit();
    	
    	System.out.println("Test cases executed");
    }
}
