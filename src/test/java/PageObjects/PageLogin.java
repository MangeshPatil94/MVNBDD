package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin
{
public WebDriver driver1;

public PageLogin(WebDriver driver)
{
PageFactory.initElements(driver,this);
driver1=driver;
}

@FindBy(id="Email")
@CacheLookup
WebElement textEmail;

@FindBy(id="Password")
@CacheLookup
WebElement textPassword;

@FindBy(xpath="//button[@type=\"submit\"]")
@CacheLookup
WebElement btnLogin;


@FindBy(xpath="//a[text()='Logout']")
@CacheLookup
WebElement btnLogout;

public void setUserName(String User)
{   textEmail.clear();
	textEmail.sendKeys(User);
}
public void setPassword(String pwd)
{   textPassword.clear();
	textPassword.sendKeys(pwd);
}
public void clickonLogin()
{
	btnLogin.click();
}
public void clickonLogout()
{
	btnLogout.click(); 
}
}
