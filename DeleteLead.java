package week2.day2.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

		public static void main(String[] args) throws InterruptedException {
		      
			ChromeDriver driver= new ChromeDriver();
				
			driver.get("http://leaftaps.com/opentaps/control/main");

			    driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   
			    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			    driver.findElement(By.id("password")).sendKeys("crmsfa");
			    driver.findElement(By.className("decorativeSubmit")).click();
			    driver.findElement(By.linkText("CRM/SFA")).click();
			    driver.findElement(By.linkText("Leads")).click();
			   driver.findElement(By.linkText("Find Leads")).click();
			   driver.findElement(By.linkText("Phone")).click();
			   driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("646346");
			   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			   
			  driver.findElement(By.xpath("//a[text()='10155']")).click();
			  driver.findElement(By.xpath("//a[text()='Delete']")).click();
			  driver.findElement(By.linkText("Find Leads")).click();
			  driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10155");
			  driver.findElement(By.linkText("//button[text()='Find Leads']")).click();
			  String records=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
			 if(records.contains("No records to display"))
			 {
			  
			  System.out.println("\"No records to display");}
			 driver.close();
			 
			  
		
			 
			   
	}
}

/*http://leaftaps.com/opentaps/control/main
	 

	

	16	Click find leads button
	17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
	18	Close the browser (Do not log out)
*/
