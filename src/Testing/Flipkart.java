package Testing;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart
	{
	 static
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium Server\\Selenim java-3.141.59\\Chromedriver2\\chromedriver.exe");
			
	 }

	 public static void main(String[] args) throws InterruptedException 
	 {
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com");
	  
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Thread.sleep(3000);
	  WebElement text = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		text.sendKeys("8839712968");
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("Aman@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("HP Laptops");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(5000);
	  //driver.close();
	 
	 
	 }
	 
	}