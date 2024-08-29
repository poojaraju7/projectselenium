package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TermsAndConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.findElement(By.linkText("terms & conditions")).click();
		
		//click on signup link
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.linkText("Sign Up")).click();
		
		
		//click on need help?
		driver.get("https://autotestdata.com/");
		driver.findElement(By.partialLinkText("p?")).click();
		

	}

}
