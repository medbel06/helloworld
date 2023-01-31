package automation_code_jan10th_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String actualtitle ="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String actualurl="https://www.rediff.com/";
		String expectedtitle=driver.getTitle();
		String expecteurl=driver.getCurrentUrl();
		
		
		
		if(actualtitle.equals(expectedtitle) && actualurl.equals(expecteurl)) {
			
			driver.findElement(By.className("signin")).click();
		}else {System.out.println("ether url or tile is wrong");}
		
		System.out.println("*******************************************");
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String actualtitle1 ="Rediffmail";
		String actualurl1="https://mail.rediff.com/cgi-bin/login.cgi";
		
		String expectedtitle1=driver.getTitle();
		String expecteurl1=driver.getCurrentUrl();
		
if(actualtitle1.equals(expectedtitle1) && actualurl1.equals(expecteurl1)) {
			
			driver.findElement(By.id("login1")).sendKeys("Mohamedboudguig");
			driver.findElement(By.id("password")).sendKeys("Medbdg0707@");
			driver.findElement(By.className("signinbtn")).click();


		}else {System.out.println("ether url or tile is wrong");}
		
		System.out.println("*******************************************");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String actualtitle2 ="Rediffmail";
		String actualurl2="https://f5mail.rediff.com/ajaxprism/container?angular=1&els=b417b5d1bdc556f307df681eb27c4eae&user_size=1";
		
		String expectedtitle2=driver.getTitle();
		String expecteurl2=driver.getCurrentUrl();
		Thread.sleep(2000);
		
if(actualtitle2.equals(expectedtitle2) && actualurl2.equals(expecteurl2)) {
			
			
			driver.findElement(By.className("rd_logout")).click();


		}else {System.out.println("ether url or tile is wrong");}
		
		System.out.println("*******************************************");
		
	}

}
