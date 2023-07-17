package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\MavenBDDcucumber\\cucumber1\\Browsers\\geckodriver-v0.32.2-win64\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://admin-demo.nopcommerce.com");
//	driver.findElement(By.id("Email"));
//	driver.findElement(By.id("Password"));
//	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//	driver.findElement(By.xpath("//a[text()='Logout']")).click();
}
}
