package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEELA\\java-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com");
				driver.manage().window().maximize();
				WebElement CreateAnAccounts= driver.findElement(By.linkText("Create New Account"));
				CreateAnAccounts.click();
				Thread.sleep(6000);
				

	}

}
