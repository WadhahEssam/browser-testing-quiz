package testBanking;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class testBanking {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Eclipse workspace\\435108270\\geckodriver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		// going to the site
		driver.get("http://www.altoromutual.com");
		driver.manage().window().maximize();
		
		// press signin
		driver.findElement(By.id("_ctl0__ctl0_LoginLink")).click();
		
		// log in to the website
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("Demo1234");
		driver.findElement(By.name("btnSubmit")).click();

		// change to checking
		Select selectChecking = new Select(driver.findElement(By.name("listAccounts")));
		selectChecking.selectByVisibleText("1001160140 Checking");
		driver.findElement(By.id("btnGetAccount")).click();
		
		// click on transfere funds
		driver.findElement(By.id("_ctl0__ctl0_Content_MenuHyperLink3")).click();
		driver.findElement(By.id("transferAmount")).sendKeys("2500");
		driver.findElement(By.id("transfer")).click();

	}
}
