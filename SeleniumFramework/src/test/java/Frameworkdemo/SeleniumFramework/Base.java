package Frameworkdemo.SeleniumFramework;


import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver InitilizeDriver() throws IOException
	{
		//chrome
		//firefox
		//ie
		
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\SeleniumJavaDemo\\SeleniumFramework\\src\\test\\java\\data.properties");
	
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		
		if (browsername.equalsIgnoreCase("chrome") )
			
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else 
		{
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		return driver;
		
	}
	public void getScreeenShotPath(String tesCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
 		File source = ts.getScreenshotAs(OutputType.FILE);
		String DestinationFile  = System.getProperty("user.dir")+"\\reports\\"+tesCaseName+".png";
		FileUtils.copyFile(source, new File(DestinationFile));
	}

}
