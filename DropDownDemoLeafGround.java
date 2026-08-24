package day2Selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemoLeafGround {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement element = driver.findElement(By.className("ui-selectonemenu"));
		System.out.println(element.getSize());
		Select select = new Select(element);
		//select.selectByIndex(2);
		//select.selectByValue("Playwright"); - this method not working
		select.selectByVisibleText("Playwright");
	
		WebElement countryElement = driver.findElement(By.id("j_idt87:country_label"));
		countryElement.click();
				
		List <WebElement> elementsCountry = driver.findElements(By.xpath("/html[1]/body[1]/div[5]/div[1]/ul[1]/li"));
		
		for (WebElement ele : elementsCountry)
		{
			if (ele.getText().equals("India"))
			{
				ele.click();
						}
			
		}
		Thread.sleep(2000);
		
		
		
			WebElement cityElement = driver.findElement(By.id("j_idt87:city"));
			cityElement.click();
	
			List<WebElement> chooseCity = driver.findElements(By.xpath("/html[1]/body[1]/div[8]/div[1]/ul[1]/li"));
			for (WebElement city :chooseCity)
			{
				if (city.getText().equals("Delhi"))
						{
							city.click();
						}
							}
			
			
			Thread.sleep(1000);
			
			
			String arr []= {"AWS", "Appium","Selenium WebDriver"};
			
			for (int i =0; i<arr.length; i++)
				
			{
				WebElement courseElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/button[1]"));
				courseElement.click();
				Thread.sleep(2000);
				List<WebElement> selectCourse = driver.findElements(By.xpath("/html[1]/body[1]/span[1]/ul[1]/li"));
				
				for (WebElement course :selectCourse)
				{
					if (course.getText().equals(arr[i]))
						course.click();					
					
					Thread.sleep(1000);
					
				}
			}
			
			
			WebElement langElement = driver.findElement(By.id("j_idt87:lang"));
			langElement.click();
			
			Thread.sleep(3000);
			
			List <WebElement> languages = driver.findElements(By.xpath("/html[1]/body[1]/div[6]/div[1]/ul[1]/li"));
			
			
			
			for (WebElement lang :languages)
			{
				if(lang.getText().equals("Tamil"))
				{
					Thread.sleep(1000);
					lang.click();
				}
			}
			
			WebElement tamilWord = driver.findElement(By.id("j_idt87:value"));
			tamilWord.click();
			
			List<WebElement> chooseWord = driver.findElements(By.xpath("/html[1]/body[1]/div[8]/div[1]/ul[1]/li"));
			
			chooseWord.get(3).click();			
			
			Thread.sleep(2000);
			driver.quit();
		}
}


