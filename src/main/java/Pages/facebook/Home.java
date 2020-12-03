package Pages.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;
	@FindBy(name = "email")
	WebElement emailfieldkeys;
	@FindBy(name ="pass")
	WebElement passwdfieldkeys;
	@FindBy(name = "login")
	WebElement sign;
	public Home(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}

}
