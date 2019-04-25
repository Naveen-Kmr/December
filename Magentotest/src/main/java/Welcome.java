

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome
{
	WebDriver driver;
	By myacc=By.linkText("My Account");
	
	Welcome(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void welcome()
	{
		driver.findElement(myacc).click();
	}

}
