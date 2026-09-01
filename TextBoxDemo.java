package day2Selinium;
 import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxDemo {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/input.xhtml");
		
		driver.findElement(By.id("j_idt88:name")).sendKeys("Poovizhi");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("India");
		
		WebElement disable = driver.findElement(By.id("j_idt88:j_idt93"));
		if(!disable.isEnabled())
		{
			System.out.println("working properly");
			
		}else {
			System.out.println("not working");
		}
		
		
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		
		
		WebElement retrieve = driver.findElement(By.id("j_idt88:j_idt97"));
		
		String valueretriever = retrieve.getAttribute("value");
		System.out.println(valueretriever);
		
		
		WebElement emailAndTab = driver.findElement(By.id("j_idt88:j_idt99"));
		emailAndTab.sendKeys("poogo@gmail.com" + Keys.TAB);
		
		
		WebElement abtYrsf = driver.findElement(By.id("j_idt88:j_idt101"));
		abtYrsf.sendKeys("Learning Java with selenium");
		
		WebElement TextEditor = driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']//p"));
		TextEditor.sendKeys("Learning Java with selenium");
		
		WebElement enterkey = driver.findElement(By.id("j_idt106:thisform:age"));
		enterkey.sendKeys(Keys.ENTER);
		
		String findText = driver.findElement(By.id("j_idt106:thisform:j_idt110_error-detail")).getText();
		if (findText.equals("Age is mandatory"))
		{
			System.out.println("working properly");
		}else
		{
			System.out.println("not working properly");
		}
		
		
		WebElement axes = driver.findElement(By.id("j_idt106:float-input"));
		Point location = axes.getLocation();
		
		System.out.println(location.getX() +":"+ location.getY());
		
		axes.click();
		
		WebElement changeaxes = driver.findElement(By.id("j_idt106:j_idt113"));
		Point location2 = changeaxes.getLocation();
		
		System.out.println(location2.getX()+":" + location2.getY());
		
		WebElement clickoption = driver.findElement(By.id("j_idt106:auto-complete_input"));
		clickoption.sendKeys("Poovizhi");
	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/span[1]/ul[1]/li")));
		
		List<WebElement> optionclick = driver.findElements(By.xpath("/html[1]/body[1]/span[1]/ul[1]/li"));
		optionclick.get(2).click();
		
		
		WebElement dob = driver.findElement(By.id("j_idt106:j_idt116_input"));
		dob.sendKeys("10/14/1998");
	
		
		List<WebElement> listofdob = driver.findElements(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/table[1]"));
		
		listofdob.get(listofdob.size()-1).click();	
		
		WebElement spinelemts = driver.findElement(By.id("j_idt106:j_idt118_input"));
		spinelemts.sendKeys("5");
		
		WebElement spinclick = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/span[3]/a[1]/span[1]"));
		spinclick.click();
	
		spinclick.click();
		
		spinclick.click();
		
		
		WebElement slider = driver.findElement(By.id("j_idt106:slider"));
		slider.sendKeys("20");
	
		WebElement confirm = driver.findElement(By.id("j_idt106:j_idt122"));
		confirm.click();
		
		WebElement closeButton = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/button[13]"));
		if(closeButton.getText().equals("Close"))
		{
			System.out.println("Close button appears");
		}else
		{
			System.out.println("Close button doesn't appears");
		}
	
		List<WebElement> keyBoardElements = driver.findElements(By.xpath("/html[1]/body[1]/div[4]/div[1]/button[13]"));
		for (WebElement closeBut: keyBoardElements)
		{
			if(closeBut.getText().equals("Close"))
					closeBut.click();
		}
	
		
		WebElement toolBars = driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']//p"));
		toolBars.sendKeys("Its working");
		
		
	
		driver.quit();
	}

}
