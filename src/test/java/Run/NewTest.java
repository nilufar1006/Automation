package Run;

import org.testng.annotations.Test;

import Pages.facebook.Home;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

public class NewTest {
	//Third executed annotation
	public WebDriver driver;
  @Test
  public void f() {
	  //open the facebook site and verify the login function .
	  
	  Home ob=new Home(driver);
	  ob.emailofinput();
	  ob.passwrdoffield();
	  ob.Signingin();
	  
  }

	   
//First executed annotation
  @BeforeClass
  public void beforeClass() {
	  Driver("Chrome", "https://www.facebook.com");
  }
//Fifth executed annotation
  @AfterClass
  public void afterClass() {
	  driver.close();
  
  }

  public  void Driver(String browser,String URI) {
   if(browser.equalsIgnoreCase("Chrome")) {
   String director= System.getProperty("user.dir");
   
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Coding\\Trainingsession\\Drivers\\chromedriver.exe");
   System.setProperty("webdriver.chrome.driver", director+"\\Drivers\\chromedriver.exe");

   driver=new ChromeDriver();
    driver.get(URI);
    driver.manage().window().maximize();
    
   }else if (browser.equalsIgnoreCase("Firefox")) {
    String director= System.getProperty("user.dir");
    System.setProperty("webdriver.gecko.driver", director+"\\Drivers\\geckodriver.exe");
    driver=new FirefoxDriver();
    
    driver.get(URI);
    driver.manage().window().maximize();
   }
   
  }
   


}
