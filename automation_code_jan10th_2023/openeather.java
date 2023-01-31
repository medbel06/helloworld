package automation_code_jan10th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openeather {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://home.openweathermap.org/users/sign_in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'user_email')]")).sendKeys("med.belmouden@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'user_password')]")).sendKeys("4Nrd*Nm6b#Yms.#");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		
		
		
		
		
	}

}
