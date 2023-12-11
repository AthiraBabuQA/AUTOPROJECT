package logopagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepkg.Basecls;

public class Logopagecls extends Basecls {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"secondaryNavWrapper\"]/nav/div/a/span")
	WebElement shopnow;

	@FindBy(xpath = "//*[@id=\"primaryNavigation\"]/div/span/strong[1]/a")
	WebElement signin;
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement emailid;
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[4]/div/button")
	WebElement loginbttn;
	@FindBy(xpath="//*[@id=\"primaryNavigation\"]/div/ul[1]/li[2]/a")
	WebElement clicknewproduct;
	@FindBy(xpath="//*[@id=\"nxt-content\"]/div/div[2]/div[3]/div[2]/h5/a")
	WebElement selectpen;
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/form/button")
	WebElement cart;
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div[2]/div[2]/div/div/button")
	WebElement submitforqueue;
	@FindBy(xpath="//*[@id=\"quote-contact-name\"]")
	WebElement name;
	@FindBy(xpath="//*[@id=\"quote-contact-email\"]")
	WebElement mailid;
	@FindBy(xpath="//*[@id=\"quote-contact-phone\"]")
	WebElement phno;
	@FindBy(xpath="//*[@id=\"quote-contact-address-street1\"]")
	WebElement address;
	@FindBy(xpath="//*[@id=\"quote-contact-address-city\"]")
	WebElement city;
	@FindBy(xpath="//*[@id=\"quote-send-modal\"]/div/div/form/div[5]/div[2]/div/button")
	WebElement state;
	@FindBy(xpath="//*[@id=\"quote-send-modal\"]/div/div/form/div[5]/div[2]/div/div/div[2]/button[2]")
	WebElement selectstate;
	@FindBy(xpath="//*[@id=\"quote-contact-address-postal\"]")
	WebElement postalcode;
	@FindBy(xpath="//*[@id=\"quote-send-modal\"]/div/div/form/div[5]/div[4]/div/button")
	WebElement country;
	@FindBy(xpath="//*[@id=\"quote-send-modal\"]/div/div/form/div[5]/div[4]/div/div/div[2]/button[3]")
	WebElement selectcountry;
	@FindBy(xpath="//*[@id=\"quote-send-modal\"]/div/div/div[2]/label")
	WebElement submitbttn;
	public Logopagecls(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void shop()
	{
		shopnow.click();
		signin.click();
	}
	public void setValues(String email, String pass) {
		
		emailid.sendKeys(email);
		password.sendKeys(pass);
	}
		
	public void loginn() 
	{
		
		loginbttn.click();
		clicknewproduct.click();
		selectpen.click();
	}
    public void addtocart()
    {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200)", "");
        cart.click();
    }
    public void checkout()
    {
    	submitforqueue.click();
    	name.sendKeys("Athi");
        mailid.sendKeys("athi@gmail.com");
        phno.sendKeys("8989897890");
    	address.sendKeys("qwert");
    	city.sendKeys("kochi");
    	state.click();
    	selectstate.click();
    	postalcode.sendKeys("123456");
    	country.click();
    	selectcountry.click();
    	submitbttn.click();
    }

}
