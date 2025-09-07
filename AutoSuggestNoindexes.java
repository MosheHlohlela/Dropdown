package dropdownlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestNoindexes {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	     driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//a[@value='DEL']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXZ']")).click();

	}

}
