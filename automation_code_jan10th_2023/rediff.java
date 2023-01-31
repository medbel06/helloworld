package automation_code_jan10th_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();;
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		//driver.findElement(By.className("signin")).click();
		//driver.findElement(By.id("login1")).sendKeys("Mohamedboudguig");
		//driver.findElement(By.id("password")).sendKeys("Medbdg0707@");
		//driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.partialLinkText("Rediff")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Shop")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Money")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Business")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Videos")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Shop")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		
		

		

	}

}
