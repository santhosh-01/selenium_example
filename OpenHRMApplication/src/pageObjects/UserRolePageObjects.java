package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRolePageObjects {
	
	@FindBy(xpath = "//*[@id=\"menu_admin_viewAdminModule\"]")
	public static WebElement adminLink;
	
	@FindBy(xpath = "//*[@id=\"menu_admin_UserManagement\"]")
	public static WebElement userManagementLink;
	
	@FindBy(xpath = "//*[@id=\"menu_admin_viewSystemUsers\"]")
	public static WebElement UsersLink;
	
	@FindBy(id = "searchSystemUser_userType")
	public static WebElement userRole;
	
	@FindBy(id = "searchSystemUser_status")
	public static WebElement userStatus;
	
	@FindBy(id = "searchBtn")
	public static WebElement searchButton;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr/td")
	public static List<WebElement> resultList;

}
