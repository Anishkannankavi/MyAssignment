package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		
		//launch Chrome browser
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//load the application ulr
		driver.get("http://leaftaps.com/opentaps/control/main\r\n");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anish");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("kka");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Freasher");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5 L");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("956694");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is testleaf organisation");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Good Organisation");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("K");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("25");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("T");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("541");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("205");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anishkannan569@gamil.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9566901569");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("anish");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("anish");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("kannan");
		driver.findElement(By.name("generalAddress1")).sendKeys("2/12, Nadu street");
		driver.findElement(By.name("generalAddress2")).sendKeys("pavithiram");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Namakkal");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("637021");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("637021");
		//driver.findElement(By.name("submitButton")).click();
		
	
		
		
		
	}

	

}
