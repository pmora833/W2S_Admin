package admin_W2S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_W2S {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.walk2shop.com/w2sadmin/");
		 driver.findElement(By.id("emailid")).sendKeys("admin@walk2shop.in");
	        driver.findElement(By.id("password")).sendKeys("w2s@dmin");
	        driver.findElement(By.id("submit")).click();
	        Thread.sleep(4000);
	        driver.findElement(By.id("//li[@class='dropdown']/a/span[@class='glyphicon glyphicon-user']")).click();
	        driver.findElement(By.xpath("//li/a[text()='Logout']")).click();
	}

}
