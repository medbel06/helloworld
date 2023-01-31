package automation_code_jan10th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tutorialninja_xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='container']/descendant::ul[@class='list-inline']/descendant::span[@class='caret']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='pull-left']/following-sibling::div[@id='top-links']/descendant::a[3]")).click();

		driver.findElement(By.xpath("//input[@id ='input-firstname']")).sendKeys("mohamed");
		  driver.findElement(By.xpath("//input[@id ='input-lastname']")).sendKeys("nefw");
		  driver.findElement(By.xpath("//input[@id ='input-email']")).sendKeys("dnaskd@gmail.com");
		  driver.findElement(By.xpath("//input[@id ='input-telephone']")).sendKeys("16489754");
		  driver.findElement(By.xpath("//input[@id ='input-password']")).sendKeys("dnaskd@gmail.com");
		  driver.findElement(By.xpath("//input[@id ='input-confirm']")).sendKeys("dnaskd@gmail.com");
		  driver.findElement(By.xpath("//input[@name ='agree']")).click();
		  driver.findElement(By.xpath("//input[@class ='btn btn-primary']")).click();
	}

}
