package Pac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;


public class WebHome1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Autoto-generated method stu
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sree0\\OneDrive\\Desktop\\browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://userinyerface.com/");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[4]/p/a")).click();
		Thread.sleep(5000);
		
		List<WebElement>suggList = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div/div[1]/div[1]/a"));
		 
		Thread.sleep(5000);
		 String u = driver.getCurrentUrl();
		 if(u.equals("https://userinyerface.com/game.html"))
		 {
			 System.out.print("Test case passed");
		 }
		 else
		 {
			 System.out.print("Test case failed"); 
		 }
		 driver.quit(); 
	}

}
		