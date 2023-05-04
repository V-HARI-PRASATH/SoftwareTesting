import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("bag");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Thread.sleep(1000);
		for(String s:driver.getWindowHandles())
		{
			driver.switchTo().window(s);
		}
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(1000);
		WebElement a= driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
		a.click();
		a.sendKeys(Keys.ARROW_DOWN);
		a.sendKeys(Keys.ARROW_DOWN);
		a.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span")).getText(), "Added to Cart");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"sc-subtotal-amount-activecart\"]/span")).getText(),"  13,497.00");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("9360777518");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("hari@2003");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		Thread.sleep(1000);
		System.out.print(driver.findElement(By.xpath("//*[@id=\"a-page\"]/section/div/div[4]/form/label/span")).getText());
  }
}
