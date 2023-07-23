package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPg {
	WebDriver d;
	By Cemail=By.xpath("//*[@id=\"email_mobile\"]");
	By Cpswd=By.xpath("//*[@id=\"Password\"]");
	By Csignin=By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div/div[1]/form/div[4]/button/span");
	By Co=By.xpath("//*[@id=\"root\"]/main/header/div[2]/nav/ul/li[2]/div[1]/a"); //men column
	By Sli=By.xpath("//*[@id=\"root\"]/main/header/div[2]/nav/ul/li[2]/div[2]/div[2]/div/div[1]/div/ul/li[3]/a"); //slides
	By Cp=By.xpath("//a[@href='/echo-stucco-unisex-slide.html']"); //product
	By Cs=By.xpath("//button[@title='W12']"); //size
	By Ct=By.xpath("//button[@type='submit']"); //Selection button
	By cart=By.xpath("//*[@id=\"root\"]/main/header/div[2]/div[2]/div[2]/button/div/img[2]"); //cart
	By check=By.xpath("//*[@id=\"miniCartTrigger\"]/div/div[3]/button[1]"); //checkout
	public LoginPg(WebDriver d)
	{
		this.d=d;
	}
	public void set(String email,String password)
	{
		d.findElement(Cemail).sendKeys(email);
		d.findElement(Cpswd).sendKeys(password);
	}
	public void button()
	{
		d.findElement(Csignin).click();
	}
	public void option()
	{
		d.findElement(Co).click();
	}
	public void slide()
	{
		d.findElement(Sli).click();
	}
	public void product()
	{
		d.findElement(Cp).click();
	}
	public void size()
	{
		d.findElement(Cs).click();
	}
	public void selection()
	{
		d.findElement(Ct).click();
	}
	public void cartt()
	{
		d.findElement(cart).click();
	}
	public void checkk()
	{
		d.findElement(check).click();
	}

}
