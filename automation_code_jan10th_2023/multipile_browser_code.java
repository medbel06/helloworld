package automation_code_jan10th_2023;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipile_browser_code {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();;
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		driver.quit();
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();;
		driver1.get("https://www.youtube.com/");
		driver1.quit();
		WebDriver driver2 = new EdgeDriver();
		driver2.manage().window().maximize();;
		driver2.get("https://www.youtube.com/");
		driver2.quit();
		

	}

}
