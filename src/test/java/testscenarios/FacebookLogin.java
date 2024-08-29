package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("pooja12345@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pooja@123");
		driver.findElement(By.name("login")).click();
		
		
	
	
	}

}
