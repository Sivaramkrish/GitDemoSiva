package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By Login = By.xpath("//*[@id=\'homepage\']/header/div[1]/div/nav/ul/li[4]/a/span");
	By logo = By.xpath("/html/body/app-root/div/header/div[2]/div/div/div[1]/div/a/img");

	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public WebElement getlogin()
	{
		return driver.findElement(Login);
	}
	
	public WebElement logo()
	{
		return driver.findElement(logo);
	}
	
	
}
