package day2Selinium;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
	
		String daele = driver.findElement(By.id("j_idt88:j_idt92")).getAttribute("class");
		String da = driver.getTitle();
		System.out.println(da);
		
		if (daele.contains("disabled"))
				{
			System.out.println("Yes... Disabled");
				}else
				{
					System.out.println("No.. Not Disabled");
				}
		
		
		WebElement findPosition = driver.findElement(By.id("j_idt88:j_idt94"));
		Point location = findPosition.getLocation();
		System.out.println(location);
		
		String buttonColor = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background");
		System.out.println(buttonColor);
		
		WebElement size = driver.findElement(By.id("j_idt88:j_idt98"));
		System.out.println(size.getCssValue("height"));
		System.out.println(size.getCssValue("width"));
		
		WebElement b4Hover = driver.findElement(By.id("j_idt88:j_idt100"));
		String ValueB4Hover = b4Hover.getCssValue("background-color");
		System.out.println(ValueB4Hover);
		
		Thread.sleep(2000);
		
		Actions action = new Actions (driver);
		action.moveToElement(b4Hover).perform();
		
		
		WebElement aftHover = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[2]/button[1]/span[1]"));
		String ValueaftHover = aftHover.getCssValue("background-color");
		System.out.println(ValueaftHover);
		
		String widthOfBox = driver.findElement(By.id("j_idt88:j_idt102:j_idt104")).getAttribute("width");		
		System.out.println(widthOfBox);
		
		driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
		
		List<WebElement> countButtons = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div"));
		System.out.println(countButtons.size());
		Thread.sleep(1000);
		driver.quit();
	}

}
