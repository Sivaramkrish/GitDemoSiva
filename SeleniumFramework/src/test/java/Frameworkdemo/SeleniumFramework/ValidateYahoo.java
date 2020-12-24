package Frameworkdemo.SeleniumFramework;


import java.io.IOException;

import org.testng.annotations.Test;




public class ValidateYahoo extends Base {
	 
	@Test
	public void basepagenavigate() throws IOException
	{
		
		driver = InitilizeDriver();
		driver.get("https://ca.yahoo.com/?p=us");
			
			
	}
	
	
	
	

}
