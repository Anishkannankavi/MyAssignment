package weekly.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
	public static void main(String[] args) {
		//launch the browser
				ChromeDriver driver=new ChromeDriver();
				// launch the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				//maximize the window
				driver.manage().window().maximize();
				//  Enter UserName 
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				
				// Password Using Id Locator
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				  // Click on Login Button using Class Locator
				driver.findElement(By.className("decorativeSubmit")).click();
				  //Click on CRM/SFA Link
				driver.findElement(By.linkText("CRM/SFA")).click();
				//   Click on Leads Button
				driver.findElement(By.linkText("Leads")).click();
			//	  Click on Create Lead 
				driver.findElement(By.partialLinkText("Creat")).click();
				 // Enter CompanyName Field Using id Locator
				 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("INFOSYS");
				  //Enter FirstName Field Using id Locator
				 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ansish");
				  // Enter LastName Field Using id Locator
				  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kannan");
				  		  // Enter FirstName(Local) Field Using id Locator
				  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("K");
				  // Enter Department Field Using any Locator of Your Choice
				  driver.findElement(By.name("departmentName")).sendKeys("Testing Team");
				  // Enter Description Field Using any Locator of your choice 
				  driver.findElement(By.id("createLeadForm_description")).sendKeys("nill");
				  // Enter your email in the E-mail address Field using the locator of your choice
				  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anishkannan569@gmail.com");		  
				  // Select State/Province as NewYork Using Visible Text
				  WebElement findElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				  Select SelectName=new Select(findElement);
				  SelectName.selectByVisibleText("New York");
				  // Click on Create Button
				  driver.findElement(By.name("submitButton")).click();
				   //  Get the Title of Resulting Page(refer the video)  using driver.getTitle()
				  System.out.println( driver.getTitle());
	               //  Click on Duplicate button
				  driver.findElement(By.linkText("Duplicate Lead")).click();
	              //  Clear the CompanyName Field using .clear() And Enter new CompanyName
				  driver.findElement(By.id("createLeadForm_companyName")).clear();
				  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
	              //  Clear the FirstName Field using .clear() And Enter new FirstName
				  driver.findElement(By.id("createLeadForm_firstName")).clear();
				  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajay");
	              //  Click on Create Lead Button
				  driver.findElement(By.className("smallSubmit")).click();
	               //  Get the Title of Resulting Page(refer the video)  using driver.getTitle()
				  System.out.println("The Page Title is -"+ driver.getTitle());


	}

}
