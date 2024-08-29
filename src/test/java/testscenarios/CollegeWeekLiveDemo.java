package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollegeWeekLiveDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(9000);
		driver.findElement(By.name("firstName")).sendKeys("Pooja");
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("submit")).click();
		

	}

}
