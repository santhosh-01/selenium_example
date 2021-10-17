package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.DashboardPageObjects;
import pageObjects.LoginPageObjects;

public class TestPendingLeaveRequest extends CommonFunctions {

	static Logger logger = Logger.getLogger(TestPendingLeaveRequest.class);
	
	public void login() {
		logger.info("logging into the applocation");
		PageFactory.initElements(driver,LoginPageObjects.class);
		LoginPageObjects.userName.sendKeys(properties.getProperty("username"));
		LoginPageObjects.password.sendKeys(properties.getProperty("password"));
		LoginPageObjects.loginButton.click();
	}
	
	public String getLeaveRequests() {
		logger.info("Getting the pending leave request");
		PageFactory.initElements(driver, DashboardPageObjects.class);
		String message = DashboardPageObjects.pendingLeaveRequests.getText();
		return message;
	}

	@Test
	public void verifyPendingLeaveRequests() throws InterruptedException {
		login();
		String message = getLeaveRequests();
		logger.info("Verification");
		Assert.assertEquals(message, "No Records are Available");
		logger.info("End of TestPendingLeaveRequest");
	}

}
