package day2Selinium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHandling {

	public static void main(String[] args)  throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			
			
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
					
					
			driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
			
			driver.manage().window().maximize();
			
			String FirstWindow= driver.getWindowHandle();
			//Thread.sleep(3000); 
		
			//WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement SecondWindow = driver.findElement(By.id("newWindowBtn"));
			SecondWindow.click();
			
			Set<String> manyWindows = driver.getWindowHandles();
			
		for (String newOpen : manyWindows)
		{
			if (!newOpen.equals(FirstWindow))
			{
				driver.switchTo().window(newOpen);
			//	Thread.sleep(2000);
				driver.close();
			}
		}
		
		
		driver.switchTo().window(FirstWindow);
		
	//	Thread.sleep(3000);
		
		WebElement tabElement = driver.findElement(By.id("newTabsBtn"));
		tabElement.click();
		
	//	Thread.sleep(3000);
		
		driver.switchTo().window(FirstWindow);
		
	//	Thread.sleep(10000);
		driver.quit();
			
			
	}

}
