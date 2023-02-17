package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateBankAccount {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://uibank.uipath.com/register-account");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Anish");
	WebElement element = driver.findElement(By.xpath("//select[@name='title']"));
	Select selectTitle=new Select(element);
	selectTitle.selectByVisibleText("Mr");
	driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("K");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kannan");
	WebElement element2 = driver.findElement(By.xpath("//select[@name='gender']"));
	Select selectGender=new Select(element2);
	selectGender.selectByIndex(0);
	WebElement element3 = driver.findElement(By.xpath("//select[@name='employmentStatus']"));
	Select selectEmploymentStatus=new Select(element3);
	selectEmploymentStatus.selectByVisibleText("Full-time");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Anish");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@gamil.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc1234");
	driver.close();
}
}
