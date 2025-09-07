package dropdownlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownwhileloop {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);

        // Using while loop to increase adults count to 5
        /*
        int i = 1;
        while (i < 5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        */
        // OR you can use for loop instead of while loop — pick one

        
        for (int i = 1; i < 5; i++) { // Initialize, Condition and increment
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        

        driver.findElement(By.id("btnclosepaxoption")).click();
        
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.close();
    }
}
