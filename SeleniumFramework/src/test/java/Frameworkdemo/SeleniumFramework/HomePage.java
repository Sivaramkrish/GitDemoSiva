package Frameworkdemo.SeleniumFramework;


import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobject.LandingPage;
import Pageobject.LoginPage;

public class HomePage extends Base {
	 
	@Test(dataProvider = "getData")
	public void basepagenavigate(String UserName, String Password) throws IOException
	{
		
		driver = InitilizeDriver();
		driver.get(prop.getProperty("url"));
			
		LandingPage lp = new LandingPage(driver);
		LoginPage log = new LoginPage(driver);
		
		
		//driver.get("http://www.qaclickacademy.com");
		lp.getlogin().click();
		log.emailid().sendKeys(UserName);
		log.password().sendKeys(Password);
		log.login_button().click();
		
		
		
	}
	
	
	@DataProvider  
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "test";
		data[0][1] = "pass";
		data[1][0] = "test1";
		data[1][1] = "pass1";
		return data;
	}

}
