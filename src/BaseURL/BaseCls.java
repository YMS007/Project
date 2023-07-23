package BaseURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseCls {
	public WebDriver d;
	@BeforeClass
	public void setup()
	{
		d=new ChromeDriver();
		d.get("https://www.crocs.in/sign-in");
		d.manage().window().maximize();
	}
}
