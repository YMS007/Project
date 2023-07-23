package Test;

import org.testng.annotations.Test;

import BaseURL.BaseCls;
import Page.LoginPg;

public class LoginTest extends BaseCls{
	@Test
	public void verifyLoginWithValidCred() throws InterruptedException
	{
	LoginPg ob=new LoginPg(d);
	ob.set("yohanmsaj1999@gmail.com","Qwerty@123");
	ob.button();
	Thread.sleep(3000);
	ob.option();
	Thread.sleep(3000);
	ob.slide();
	Thread.sleep(3000);
	ob.product();
	Thread.sleep(3000);
	ob.size();
	Thread.sleep(3000);
	ob.selection();
	Thread.sleep(3000);
	ob.cartt();
	Thread.sleep(3000);
	ob.checkk();
	}
	
}
