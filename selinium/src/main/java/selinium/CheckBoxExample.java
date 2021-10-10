package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work\\Selinium\\Drivers\\Chromedriver\\chromedriver.exe");                  

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/checkbox.html");

		WebElement ele = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input"));
		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[4]/input"));
		WebElement ele3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[5]/input"));
		ele.click();
		ele1.click();
		ele2.click();
		ele3.click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input")).isSelected());
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input")).click();
		
		String[] s= {"//*[@id=\'contentblock\']/section/div[4]/div[1]/input","//*[@id=\"contentblock\"]/section/div[4]/div[2]/input","//*[@id=\"contentblock\"]/section/div[4]/div[3]/input","//*[@id=\"contentblock\"]/section/div[4]/div[4]/input","//*[@id=\'contentblock\']/section/div[4]/div[5]/input"};
		for(String str: s) {
			driver.findElement(By.xpath(str)).click();
		}
	}

}
