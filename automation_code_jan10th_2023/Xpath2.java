package automation_code_jan10th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		  driver.findElement(By.xpath("//input[contains(@id,'input-firstname')]")).sendKeys("mohamed");
		  driver.findElement(By.xpath("//input[contains(@id,'input-lastname')]")).sendKeys("adas");
		  driver.findElement(By.xpath("//input[contains(@id,'input-email')]")).sendKeys("mohamased@safs.com");
		  driver.findElement(By.xpath("//input[contains(@id,'input-telephone')]")).sendKeys("545645");
		  driver.findElement(By.xpath("//input[contains(@id,'input-password')]")).sendKeys("545645");
		  driver.findElement(By.xpath("//input[contains(@id,'input-confirm')]")).sendKeys("545645");
		  driver.findElement(By.xpath("//input[contains(@name,'agree')]")).click();
		  driver.findElement(By.xpath("//input[contains(@class,'btn btn-primary')]")).click();


	}

}
