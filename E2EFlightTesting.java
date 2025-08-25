package dropdownlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2EFlightTesting {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	     driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//a[@value='DEL']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXZ']")).click();
	     driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-active']")).click();
	     driver.findElement(By.id("divpaxinfo")).click();
	     Thread.sleep(1000);
	     for (int i = 1; i < 5; i++) { // Initialize, Condition and increment
	            driver.findElement(By.id("hrefIncAdt")).click();
	        }
	        driver.findElement(By.id("btnclosepaxoption")).click();  
	        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			Select dropdown = new Select(staticDropdown);
			dropdown.selectByIndex(3);
			System.out.println(dropdown.getFirstSelectedOption().getText());
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.close();
		    
	        
	}

}
