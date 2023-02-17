package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateANewAccount {
	public static void main(String[] args) {
		  ChromeDriver driver=new ChromeDriver();
			  driver.get("https://www.facebook.com/");
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			  driver.findElement(By.name("firstname")).sendKeys("Anish");
			  driver.findElement(By.name("lastname")).sendKeys("k");
			  driver.findElement(By.name("reg_email__")).sendKeys("9566901569");
			  driver.findElement(By.name("reg_passwd__")).sendKeys("akk@1234");
			  WebElement ele = driver.findElement(By.name("birthday_day"));
			  Select selectDay=new Select(ele) ;
			  selectDay.selectByValue("10");
			  WebElement element = driver.findElement(By.id("month"));
			  Select selectMonth=new Select(element) ;
			  selectMonth.selectByVisibleText("Mar");
			  WebElement element2 = driver.findElement(By.id("year"));
			  Select selectYear=new Select(element2) ;
			  selectYear.selectByVisibleText("2002");
			  driver.findElement(By.xpath("//label[text()='Male']")).click();
			  driver.close();
	}

}
