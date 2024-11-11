package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page {
WebDriver driver;
@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[1]/div/div[2]/div[2]/button")
WebElement loginbutton ;
@FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[4]/div[1]/form/div[2]/fieldset/span/div")
WebElement email ;
@FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[4]/div[1]/form/div[4]/fieldset/span/div/input")
WebElement password ;
@FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[4]/div[1]/form/div[7]/button")
WebElement login ; 
@FindBy (xpath="/html/body/div[1]/div/div[1]/div/div[1]/div/div[1]/div[4]/a/div/div/span")


WebElement explore;
@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[1]/input")
WebElement searchbar;
@FindBy(xpath="//*[@id=\"searchBoxContainer\"]/div/div/div[1]/input")
WebElement search;
  
public void page( WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void myaccount()
{
	loginbutton.click();
}

public void setvalues(String username,String Password) {
	email.sendKeys(username);
	password.sendKeys(Password);
}
public void login() {
	login.click();
}
public void search() {
	explore.click();
	searchbar.sendKeys("sunset");
	search.click();
}
}
