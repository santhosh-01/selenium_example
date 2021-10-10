package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work\\Selinium\\Drivers\\Chromedriver\\chromedriver.exe");                  

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://leafground.com/pages/table.html");
		
		System.out.println(driver.findElements(By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/th")).size());
		
		System.out.println(driver.findElements(By.xpath("//*[@id=\"table_id\"]/tbody/tr")).size());
		
		List<WebElement> allRows = driver.findElements(By.xpath("//*[@id=\"table_id\"]/tbody/tr"));
		
		int min = 100,i = 0, ind=-1;
		for (WebElement webElement : allRows) {
			if(webElement.findElements(By.tagName("td")).size()!=0) {
				List<WebElement> row = webElement.findElements(By.tagName("td"));
				if(row.get(0).getText().equals("Learn to interact with Elements")) {
					System.out.println(row.get(1).getText());
				}
				String str = row.get(1).getText();
				if(Integer.parseInt(str.substring(0, str.length()-1))<min) {
					min = Integer.parseInt(str.substring(0, str.length()-1));
					ind = i;
				}
			}
			i+=1;
		}
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+(ind+1)+"]/td[3]/input")).click();
		
	}

}
