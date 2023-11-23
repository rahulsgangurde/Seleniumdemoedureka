package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\chrome driver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			
			driver.findElement(By.id("input")).click();
			Thread.sleep(3000);
			System.out.println("Success");
			driver.quit();
			
		}

}