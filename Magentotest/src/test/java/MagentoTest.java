
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest 
{
	@Test
	public void main() {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		d.navigate().to("https://www.magento.com");
		Welcome w=new Welcome(d);
		w.welcome();
		Login l=new Login(d);
		l.email("naveen.kmr@yahoo.com");
		l.pass("Welcometo123");
		l.login();
		Mainpage p=new Mainpage(d);
		p.Logout();
		
	}

}
