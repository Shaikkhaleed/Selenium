package project1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.name("password")).sendKeys("secret_sauce");
Thread.sleep(2000);
driver.findElement(By.id("login-button")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']//*[name()='svg']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath(" //a[normalize-space()='CHECKOUT']")) .click();              
Thread.sleep(3000);
driver.findElement(By.id("first-name")).sendKeys("Shaik ");
driver.findElement(By.id("last-name")).sendKeys("Khaleed");
driver.findElement(By.id("postal-code")).sendKeys("522005");
driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[normalize-space()='FINISH']")).click();
Thread.sleep(5000);
driver.close();
	}

}
