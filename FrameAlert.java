package week4.day1;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifcations");
		EdgeDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='hxt-spm-clickable']")).click();
		driver.switchTo().frame("dummy-chat-button-iframe");
		driver.findElement(By.id("dummy-chat-button")).click();
		driver.switchTo().frame("ShopifyChat");
		driver.findElement(By.xpath("//textarea[@class='composer-bar__message-text ']")).sendKeys("Hi");
		driver.findElement(By.xpath("//button[contains(@class,'chat-app--close-button')]")).click();
		driver.switchTo().defaultContent();

		driver.findElement(By.partialLinkText("URBAN FIT X SMART WATCH")).click();
		driver.findElement(By.xpath("//div[@class='hxt-spm-clickable']")).click();
		driver.findElement(By.xpath("//div[@class='wk_zipfinder_input']/input")).sendKeys("600119");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='wk_zipfinder_btn']/input")).click();
		driver.findElement(By.xpath("//button[@value='Add to Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[@class='success-message show-cart'])[2]")).click();
		driver.findElement(By.xpath("//div[@class='hxt-spm-clickable']")).click();
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert message:"  + alert.getText());
		alert.accept();


	}

}
