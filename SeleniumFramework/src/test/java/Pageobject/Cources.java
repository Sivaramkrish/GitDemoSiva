package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cources {

	public WebDriver driver;
	
	By cources = By.xpath("/html/body/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[2]/a");
	
	//By cources = By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/courses']");
//By cources = By.linkText("Courses");
	
	
	
	public Cources(WebDriver driver) {
		this.driver = driver;
	}

	public  WebElement cources()
	{
		return driver.findElement(cources);
		
	}
}
	
	