package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEELA\\java-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement CreateAnAccount=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		CreateAnAccount.click();
		//WebElement Sign=driver.findElement(By.xpath("(//*[text()='Sign Up'])[3]"));
		//Sign.click();
		WebElement Sign=driver.findElement(By.xpath("(//*[contains(text(),'Sign')])[6]"));
		Sign.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
