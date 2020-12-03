package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Asertion {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEELA\\java-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEELA\\java-workspace\\Trainingsession\\Drivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	WebElement CreateNewAccounts= driver.findElement(By.linkText("Create new account"));
boolean button=	CreateNewAccounts.isDisplayed();
System.out.println(button);
WebElement ds=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
String textheading=ds.getText();
System.out.println(textheading);

		
		

	}

}
