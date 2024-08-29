package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		
		Select fromcity = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
		fromcity.selectByVisibleText("Boston");
		
		Select city = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
		city.selectByVisibleText("London");
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();

	}

}
