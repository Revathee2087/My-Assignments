package week2.day1.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");

	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
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
	   
	   driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Thiyagarajan");
	   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thiyagarajan");
	   driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("trevathy.2087@gmail.com");
	   driver.findElement(By.className("smallSubmit")).click();
	   //String title=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
	   //System.out.println("Title is "+title);
	   Thread.sleep(3000);
	   driver.findElement(By.linkText("Duplicate Lead")).click();
	
	   
	   driver.findElement(By.id("createLeadForm_companyName")).clear();
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
	   driver.findElement(By.id("createLeadForm_firstName")).clear();
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bharathy");
	   
	   driver.findElement(By.className("smallSubmit")).click();
	   Thread.sleep(3000);
	   
	   String title=driver.getTitle();
	   
	   System.out.println("Title is "+title);
	   if(title.equalsIgnoreCase("View Lead | opentaps CRM")) {
	        System.out.println("Title verified");
	    }else {
	        System.out.println("Title not verified");
	    }
	   
	}

}

