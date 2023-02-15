package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class TextBox {
	
	public static void main(String[] args) {
	
	 EdgeDriver driver=new EdgeDriver();
	 driver.get("https://leafground.com/select.xhtml;jsessionid=node0297llw43prfo1hkr9eef8nsf102385.node0");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
	// driver.findElement(By.xpath("//span[text()='Text Box']")).click();
	 driver.findElement(By.xpath("//i[@class='pi pi-fw pi-check-square layout-menuitem-icon']")).click();
     driver.findElement(By.xpath("//input[@name='j_idt88:name']")).sendKeys("K.Anish");
     driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']")).clear();
     driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']")).sendKeys("Chennai");
     driver.findElement(By.xpath("//input[@name='j_idt88:j_idt95']")).clear();
     driver.findElement(By.xpath("//input[@name='j_idt106:j_idt116_input']")).sendKeys("10.03.2002");
     boolean enabled = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt93']")).isEnabled();
     System.out.println(enabled);	 
}
	

}
