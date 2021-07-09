package LinkedIn;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testing
	{
	 static
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium Server\\Selenim java-3.141.59\\Chromedriver2\\chromedriver.exe");
			
	 }

	 public static void main(String[] args) throws InterruptedException 
	 {
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.linkedin.com​");
	  
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Thread.sleep(3000);
	  WebElement Email = driver.findElement(By.xpath("//input[@id='session_key']"));
	  Email.sendKeys("amankumartiwari7@gmail.com");
	  
	  WebElement pwd = driver.findElement(By.xpath("//input[@id='session_password']"));
	  Thread.sleep(3000);
	  
	  pwd.sendKeys("Aman@123");
	  Thread.sleep(2500);
	  
	  driver.findElement(By.xpath("//button[@class='sign-in-form__submit-button']")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//div[@class='msg-overlay-list-bubble__convo-card-content-wrapper fl']")).click();
	  Thread.sleep(3000);
	  WebElement to = driver.findElement(By.xpath("//div[@class='msg-form__contenteditable t-14 t-black--light t-normal flex-grow-1 full-height notranslate']"));
	  
	  to.sendKeys("Hii Priyanka It's just a Test of STQA Project 2 - Test 2");
	  
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//button[@class='msg-form__send-button artdeco-button artdeco-button--1']")).click();
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[@id='ember343']")).click();
	  Thread.sleep(2500);
	  //driver.close();
	 
	 
	 }
	 
	}