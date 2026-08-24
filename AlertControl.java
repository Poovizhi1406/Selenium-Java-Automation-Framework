package day2Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertControl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		driver.switchTo().alert().accept();
		
		String boxText = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(boxText);
		
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		driver.switchTo().alert().dismiss();
		
		String boxText1 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(boxText1);
		
		driver.findElement(By.id("j_idt88:j_idt95")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt88:j_idt98")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt88:j_idt100")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt101']//a[@aria-label='Close']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Poovizhi");
		driver.switchTo().alert().accept();
		
		String confirmResult = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(confirmResult);

		driver.findElement(By.id("j_idt88:j_idt106")).click();
		Thread.sleep(5000);
//		driver.findElement(By.id("j_idt88:j_idt109")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("j_idt88:j_idt106")).click();
		
		WebElement noButto  = driver.findElement(By.xpath("//span[normalize-space()='No']"));
		noButto.click();
		String noText = driver.findElement(By.xpath("//span[normalize-space()='No']")).getText();
		System.out.println("User Clicked : " + noText);
		
		
		driver.findElement(By.id("j_idt88:j_idt111")).click();
		Thread.sleep(2000);
		String max = driver.findElement(By.id("j_idt88:j_idt112_content")).getText();
		System.out.println(max);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-newwin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("j_idt88:j_idt111")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt112']//a[@aria-label='Close']")).click();
	
		Thread.sleep(3000);
		driver.quit();
	}

}
