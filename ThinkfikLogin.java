package Pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ThinkfikLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");


		System.setProperty("webdriver.chrome.driver", "C:\browsers\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://a1qa.thinkific.com/users/sign_in");
		driver.manage().window().maximize();
	
		 driver.findElement(By.id ("user[email]")).sendKeys("a.nelluru@qa-academy.by");
		 driver.findElement(By.name("user[password]")).sendKeys("ANUSREE&0852&");
		 //driver.get("https://a1qa.thinkific.com/enrollments");
		driver.findElement(By.xpath("//*[@id=\"sign_in_55943d83a0\"]/div[6]/button")).click();	
		
		 String u = driver.getCurrentUrl();
		 if(u.equals("https://a1qa.thinkific.com/enrollments"))
		 {
			 System.out.print("Test case passed");
		 }
		 else
		 {
			 System.out.print("Test case failed"); 
		 }
		 driver.close();
	

	}
         
}
