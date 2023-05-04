import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		Thread.sleep(1000);;
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("9360777518");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("hari@2003");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div")).click();
		Thread.sleep(1000);
		System.out.print(driver.findElement(By.xpath("//*[@id=\"a-page\"]/section/div/div[4]/form/label")).getText());
  }
}
