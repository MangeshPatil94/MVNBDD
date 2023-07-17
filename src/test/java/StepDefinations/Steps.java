package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.PageLogin;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.*;

public class Steps
{
	public WebDriver driver;
	public PageLogin lp;
	@Given("user lonch Firefox Browser")
	public void user_lonch_firefox_browser() 
	{System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\MavenBDDcucumber\\cucumber1\\Browsers\\geckodriver-v0.32.2-win64\\geckodriver.exe");
	 driver= new FirefoxDriver();
	 lp=new PageLogin(driver); 
	}

	@When("user open URL {string};")
	public void user_open_url(String url)
	{
	  driver.get(url);
	}

	@When("Enter email as {string} and Password as {string}")
	public void enter_email_as_and_password_as(String email, String pwd)
	{
	   lp.setUserName(email);
	   lp.setPassword(pwd);
	}

	@When("click on Login")
	public void click_on_login() 
	{
	 lp.clickonLogin();
	}

	@Then("page Title should be {string}")
	public void page_title_should_be_dashboard_nop_commerce_administration(String title) 
	{
//		if (driver.getPageSource().contains("Login was unsuccessful"))
//		{
//			driver.close();
//			Assert.assertEquals(title,true);
//		}
//		else
//		{
//			Assert.assertEquals(title,driver.getTitle());
//		}
	  String acttitle = driver.getTitle();
	  if(title.equals(acttitle))
	  {
		 System.out.println("title is correct");
	  }
	   
	}

	@When("user click on log out link")
	public void user_click_on_log_out_link() throws InterruptedException
	{
		Thread.sleep(2000);
	 lp.clickonLogout();
	}

	@Then("page Title should be\"Your store. Login\"")
	public void page_title_shuld_be_your_store_login(String title) throws InterruptedException 
	{Thread.sleep(2000);
		String acttitle = driver.getTitle();
		  if(title.equals(acttitle))
		  {
			 System.out.println("title is correct");
		  }  
		  else
		  {
			  System.out.println("title isn't correct"); 
		  }
	}

	@Then("close browser")
	public void close_browser() throws InterruptedException 
	{
		Thread.sleep(2000);
	 driver.close();   
	}


	        

}
