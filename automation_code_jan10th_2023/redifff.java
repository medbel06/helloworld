package automation_code_jan10th_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redifff {

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
		System.out.println("title of this page "+driver.getTitle());
		System.out.println("url  of this page "+driver.getCurrentUrl());
		driver.findElement(By.partialLinkText("Rediff")).click();
		System.out.println("title of this page "+driver.getTitle());
		System.out.println("url  of this page "+driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Shop")).click();
		System.out.println("title of this page "+driver.getTitle());
		System.out.println("url  of this page "+driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.linkText("Money")).click();
		System.out.println("title of this page "+driver.getTitle());
		System.out.println("url  of this page "+driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Business")).click();
		System.out.println("title of this page "+driver.getTitle());
		System.out.println("url  of this page "+driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Videos")).click();
		System.out.println("title of this page "+driver.getTitle());
		System.out.println("url  of this page "+driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Shop")).click();
		System.out.println("title of this page "+driver.getTitle());
		System.out.println("url  of this page "+driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(5000);
		

	}

}
