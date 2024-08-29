package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
  @Test
  public void f() {
	  WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("pooja12345@gmail.com");
		driver.findElement(By.name("pass123")).sendKeys("pooja@123");
		driver.findElement(By.name("login")).click();
  }
}
