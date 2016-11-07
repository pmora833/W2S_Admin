package admin_W2S;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://stg.cintell.org/dashboard");
		driver.findElement(By.id("form-email")).sendKeys("pmorasocialtesting@gmail.com");
		driver.findElement(By.id("form-password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()=' Create from Data ']")).click();
		Thread.sleep(6000);
		driver.findElement(By.linkText("Upload from CSV")).click();
		System.out.println("xxxxxxxxx");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Click here to select file']")).click();
		System.out.println("YYYYYYYYYYYY");
		Runtime.getRuntime().exec("C:\\Users\\veera\\Desktop\\CSV Upload.exe");
		driver.findElement(By.xpath("//div[@class='modal-footer']/button[text()='Upload']")).click();

	}

}
