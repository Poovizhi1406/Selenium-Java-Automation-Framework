package day2Selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		driver.findElement(By.id("j_idt87:j_idt89")).click();
		
		driver.findElement(By.id("j_idt87:j_idt91")).click();
		Thread.sleep(2000);
		
		String text = driver.findElement(By.id("j_idt87:msg_container")).getText();
		System.out.println(text);
		
		driver.findElement(By.id("j_idt87:j_idt91")).click();
		Thread.sleep(2000);
		String text1 = driver.findElement(By.id("j_idt87:msg_container")).getText();
		System.out.println(text1);
		
		
		String langStrings [] = {"Python", "Java"};
		
		List<WebElement> Languages = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td"));
		
		for (int i =0; i<langStrings.length; i++) {
		for ( WebElement lang :Languages)
		{
			String langName = lang.findElement(By.tagName("label")).getText();
			WebElement langCheckBox = lang.findElement(By.tagName("div"));
			if (langName.equals(langStrings[i]))
			{
				langCheckBox.click();
			}
		}
		}
		
		Thread.sleep(4000);
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		Thread.sleep(1000);
		String fClick = driver.findElement(By.xpath("/html[1]/body[1]/div[6]")).getText();
		System.out.println(fClick);
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();
		
		Thread.sleep(2000);
		String Sclick = driver.findElement(By.xpath("//html[1]/body[1]/div[6]/div[1]/div[1]")).getText();
		System.out.println(Sclick);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ui-icon ui-icon-closethick']")).click();
		
		Thread.sleep(2000);
		String Tclick = driver.findElement(By.xpath("//p[normalize-space()='State = 0']")).getText();
		System.out.println(Tclick);
		
		driver.findElement(By.id("j_idt87:j_idt100"));
		
		
		Thread.sleep(1000);
		driver.quit();
	}

}
