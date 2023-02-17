package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenAAccount {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("REGISTERED_BY"));
		Select selectMatrimony=new Select(element);
		selectMatrimony.selectByValue("1");
		driver.findElement(By.id("NAME")).sendKeys("Anish.K");
		driver.findElement(By.xpath("//input[@name='GENDER']")).click();
		WebElement element2 = driver.findElement(By.id("DOBDAY"));
		Select selectDay=new Select(element2);
		selectDay.selectByIndex(10);
		WebElement element3 = driver.findElement(By.id("DOBMONTH"));
		Select selectMonth=new Select(element3);
		selectMonth.selectByIndex(3);
		WebElement element4 = driver.findElement(By.id("DOBYEAR"));
		Select selectYear=new Select(element4);
		selectYear.selectByValue("2002");
		WebElement element5 = driver.findElement(By.className("selectfield"));
        Select selectReligion=new Select(element5);
        selectReligion.selectByIndex(1);
        WebElement element6 = driver.findElement(By.id("MOTHERTONGUE"));
        Select selectMotherTongue=new Select(element6);
        selectMotherTongue.selectByVisibleText("Tamil");
        WebElement findElement5 = driver.findElement(By.xpath("//select[@id='COUNTRY']"));
        Select selectCountry = new Select(findElement5);
        selectCountry.selectByVisibleText("India");
        driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9626202638");
        driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("xyz@gmail.com");
        //driver.close();

}

}
