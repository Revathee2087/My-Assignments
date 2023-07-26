package week2.day1.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) throws InterruptedException {
        
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");

	    driver.manage().window().maximize();	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    
	    driver.findElement(By.linkText("Accounts")).click();
	    
	    driver.findElement(By.linkText("Create Account")).click();
	   
	    driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
	    
	   
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    
	    driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Test");
	    
	    driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Nanmangalam");
	    
	    driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("1000000");
	    driver.findElement(By.name("industryEnumId")).click();
		 Select indus=new Select(driver.findElement(By.name("industryEnumId")));
		 indus.selectByVisibleText("Computer Software");
		 Thread.sleep(2000);
		 driver.findElement(By.name("ownershipEnumId")).click();
		 Select owner=new Select(driver.findElement(By.name("ownershipEnumId")));
		 owner.selectByVisibleText("S-Corporation");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("dataSourceId")).click();
		 Select data=new Select(driver.findElement(By.name("dataSourceId")));
		 data.selectByValue("LEAD_EMPLOYEE");
		 Thread.sleep(2000);
		 driver.findElement(By.name("marketingCampaignId")).click();
		 Select market=new Select(driver.findElement(By.name("marketingCampaignId")));
		 market.selectByIndex(5);
		 Thread.sleep(2000);
		 driver.findElement(By.id("generalStateProvinceGeoId")).click();
		 Select state=new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		 state.selectByValue("TX");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		

		 
	}

}



