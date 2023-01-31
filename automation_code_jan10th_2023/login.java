package automation_code_jan10th_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement checkbox = driver.findElement(By.name("dropdown-toggle"));
		
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isSelected());
		System.out.println(checkbox.isEnabled());
		if(checkbox.isEnabled()&&checkbox.isDisplayed()  ) {
			
			
			
			checkbox.click();
		}



	}

}
