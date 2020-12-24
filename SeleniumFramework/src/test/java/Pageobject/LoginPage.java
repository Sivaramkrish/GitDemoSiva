package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By email = By.id("user_email");
	By password =By.id("user_password");
	By login_button = By.xpath("//*[@id=\"hero\"]/div/form/div[3]/input");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public  WebElement emailid()
	{
		return driver.findElement(email);
		
	}
	
	public  WebElement password()
	{
		return driver.findElement(password);
		
	}
	
	public  WebElement login_button()
	{
		return driver.findElement(login_button);
		
	}
	
	
}
