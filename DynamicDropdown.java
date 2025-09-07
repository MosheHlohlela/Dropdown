package dropdownlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		// use index to locate the destination FROM NODE page
		//driver.findElement(By.xpath("//(a[@value='MAA'])[1]")).click();
		Thread.sleep(1000);
		// use index to locate the destination TO NODE page
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		
		
		
	}

}
