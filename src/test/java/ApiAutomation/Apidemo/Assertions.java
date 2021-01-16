package ApiAutomation.Apidemo;

import static io.restassured.RestAssured.given;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Assertions {

	@Test
	public void run() {
		DesiredCapabilities caps=DesiredCapabilities.htmlUnit();
		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52039252\\Desktop\\chromedriver.exe");	
		
	WebDriver driver=new ChromeDriver(caps);
	
	
	//Wait wait1=new FluentWait(driver).withTimeout(Duration.ofSeconds(24)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://facebook.com");
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Actions action =new Actions(driver);
	action.contextClick(driver.findElement(By.xpath("//body/div[@id='u_0_2']/div[@id='globalContainer']/div[@id='content']/div[1]/div[1]/img[1]"))).build().perform();
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9717950731" + Keys.TAB);
	
	
  // driver.switchTo().activeElement().sendKeys("Deadpool@42" + Keys.TAB);
   //driver.switchTo().activeElement().sendKeys(Keys.ENTER);
      //driver.findElement(By.xpath("")).click();

      // Enter text "q" and perform keyboard action "Enter"
      
    
  }}
	
