

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mainpage 
{
	WebDriver driver;
	By logout=By.linkText("Log Out");
	
	Mainpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Logout()
	{
		driver.findElement(logout).click();
	}

}
