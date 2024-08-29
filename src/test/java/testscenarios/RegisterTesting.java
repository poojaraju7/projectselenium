package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTesting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://practice.automationtesting.in/my-account/");
		Thread.sleep(9000);
		//driver.findElement(By.name("username")).sendKeys("seenu4selenium@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("seenu4selenium@123");
		//driver.findElement(By.id("rememberme")).click();
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.name("email")).sendKeys("seenu4selenium@gmail.com");
		driver.findElement(By.name("password")).sendKeys("seenu4selenium@123");
		driver.findElement(By.name("register")).click();
		

	}

}