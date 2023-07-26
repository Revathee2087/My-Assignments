package week2.day1.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
       ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");

	    driver.manage().window().maximize();	
	
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    Thread.sleep(3000);
	    
	   driver.findElement(By.linkText("Leads")).click();
	   driver.findElement(By.linkText("Create Lead")).click();
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Revathy");
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thiyagarajan");
	   Thread.sleep(2000);
	   driver.findElement(By.name("dataSourceId")).click();
	 Select sourceid=new Select(driver.findElement(By.name("dataSourceId")));
	 sourceid.selectByVisibleText("Employee");
	 Thread.sleep(2000);
	 driver.findElement(By.name("marketingCampaignId")).click();
	 Select market=new Select(driver.findElement(By.name("marketingCampaignId")));
	 market.selectByValue("9001");
	 Thread.sleep(2000);
	 driver.findElement(By.name("ownershipEnumId")).click();
	 Select owner=new Select(driver.findElement(By.name("ownershipEnumId")));
	 owner.selectByIndex(5);
	 Thread.sleep(2000);
	 driver.findElement(By.name("generalCountryGeoId")).click();
	 Select country=new Select(driver.findElement(By.name("generalCountryGeoId")));
	 country.selectByVisibleText("India");
	 Thread.sleep(2000);
	 driver.findElement(By.name("submitButton")).click();
	 Thread.sleep(3000);

	String title= driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
	System.out.println("Title is "+title);
	 
	    	          
	    
	    
	    
	    
	    
	    
	}    

}
