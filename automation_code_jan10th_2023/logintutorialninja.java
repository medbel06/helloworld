package automation_code_jan10th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintutorialninja {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//div[@class='pull-left']/following-sibling::div[@id='top-links']/descendant::span[@class='caret']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[contains(@class, 'list-inline')]//descendant::a[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class, 'form-group')]//child::input[@id='input-email']")).sendKeys("dnaskd@gmail.com");
		driver.findElement(By.xpath("//div[contains(@class, 'form-group')]//child::input[@id='input-password']")).sendKeys("dnaskd@gmail.com");
		driver.findElement(By.xpath("//div[contains(@class, 'well')]/descendant::input[3]")).click();

		
		
	}

}
