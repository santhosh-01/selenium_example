package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.UserRolePageObjects;

public class TestUserRole extends CommonFunctions {
	
	static Logger logger = Logger.getLogger(TestUserRole.class);
	
	public void moveToUserRole() {
		Actions actions = new Actions(driver);
		actions.moveToElement(UserRolePageObjects.adminLink);
		actions.moveToElement(UserRolePageObjects.userManagementLink);
		actions.moveToElement(UserRolePageObjects.UsersLink);
		actions.click().build().perform();
	}
	
	public void selectUserRole() {
		Select select = new Select(UserRolePageObjects.userRole);
		select.selectByIndex(1);
	}
	
	public void selectUserStatus() {
		Select select = new Select(UserRolePageObjects.userStatus);
		select.selectByIndex(1);
	}
	
	@Test
	public void checkUserRole() {
		PageFactory.initElements(driver, UserRolePageObjects.class);
		logger.info("Navigating to Users Page");
		moveToUserRole();
		logger.info("Selecting the users role");
		selectUserRole();
		logger.info("Selecting the status");
		selectUserStatus();
		UserRolePageObjects.searchButton.click();
		
		logger.info("Verification");
		Assert.assertEquals(UserRolePageObjects.resultList.get(2).getText(), "Admin");
		Assert.assertEquals(UserRolePageObjects.resultList.get(4).getText(), "Enabled");
		
		logger.info("End of TestUserRole Test Case");
	}

}
