package project1;

//import java.awt.Window;
//import java.sql.Driver;
//import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formfillup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver =new ChromeDriver();
       driver.manage().window().maximize();
       Thread.sleep(2000);
driver.get("https://www.demoblaze.com/index.html");

driver.findElement(By.linkText("Monitors")).click();
//driver.findElement(By.linkText("Apple monitor 24]")).click();
driver.findElement(By.xpath("//a[normalize-space()='ASUS Full HD']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//a[normalize-space()='Add to cart']")).click();
Thread.sleep(5000);
driver.switchTo().alert().getText();
driver.switchTo().alert().accept();
driver.findElement(By.id("cartur")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
Thread.sleep(3000);
driver.findElement(By.id("name")).sendKeys("Shaik khaleed");
driver.findElement(By.id("country")).sendKeys("India");
driver.findElement(By.id("city")).sendKeys("Guntur ");
driver.findElement(By.xpath("//input[@id='card']")).sendKeys("1234567");
driver.findElement(By.id("month")).sendKeys("March");
driver.findElement(By.id("year")).sendKeys("2024");
Thread.sleep(5000);
driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();
Thread.sleep(5000);
driver.switchTo().alert().getText();
driver.switchTo().alert().accept();
Thread.sleep(5000);
driver.close();

	
	}
	

}
