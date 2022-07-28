package mindtree.Project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.Select;

public class SBA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        
        driver.findElement(By.xpath("//a[@href='/hovers']")).click();
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[@href='/inputs']")).click();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234");
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        Select s=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        s.selectByVisibleText("Option 2");
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[@href='/upload']")).click();
      // driver.findElement(By.xpath("//div[@id='drag-drop-upload']")).click();
        driver.findElement(By.xpath("//input[@id='file-submit']"));
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[@href='/tables']")).click();
        WebElement print=driver.findElement(By.xpath("(//table[contains(@id,'table1')]//td[3])[1]"));
        String Email=print.getText();
        System.out.println(Email);
        WebElement print1=driver.findElement(By.xpath("(//table[contains(@id,'table1')]//td[5])[1]"));
        String Website=print1.getText();
        System.out.println(Website);
        driver.navigate().back();
        
        driver.findElement(By.xpath("//a[@href='/key_presses']")).click();
        driver.findElement(By.xpath("//input[@id='target']")).sendKeys("p");
        WebElement print2=driver.findElement(By.xpath("//p[@id='result']"));
        String value=print2.getText();
        System.out.println(value);
        driver.navigate().back();
        
       
        
        
        
        
       

	}

}
