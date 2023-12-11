package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Basecls {
	 public static  WebDriver driver;
		@BeforeTest
		public void setup()
		{
		    driver=new ChromeDriver();
			driver.get("https://www.yourlogo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
			
		}

}
