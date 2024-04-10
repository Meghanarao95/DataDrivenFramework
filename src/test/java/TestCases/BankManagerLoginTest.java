package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;

public class BankManagerLoginTest extends BaseTest {

	@Test
	public void loginAsBankManager() throws InterruptedException {

		
	    log.debug("Inside login test");
		driver.findElement(By.xpath(OR.getProperty("bmlBTN"))).click();
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("addcustBTN"))),"Login not Successful");
		
		log.debug("login successfully executed");
	}
}
