package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEELA\\java-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
	WebElement Search=driver.findElement(By.id("twotabsearchtextbox"));
	
	WebElement SearchButton=driver.findElement(By.id("nav-search-submit-text"));
	Search.sendKeys("Phones");
	SearchButton.click();
	
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
