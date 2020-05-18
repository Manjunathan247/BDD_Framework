package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.ActionsHelp;

public class LoginPage {
	
	private WebDriver driver;
	ActionsHelp ah;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement navigation;
	
	@FindBy(xpath="//div[@id='nav-flyout-ya-signin']/a")
	private WebElement signIn;
	
	@FindBy(name="email")
	private WebElement emailField;
	
	@FindBy(id="continue")
	private WebElement continueButton;
	
	@FindBy(name="password")
	private WebElement passwordField;
	
	@FindBy(id="signInSubmit")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signIn()
	{
		ah = new ActionsHelp(driver);
		ah.moveToElement(navigation);
		signIn.click();
	}
	
	public void mailId(String mail)
	{
		emailField.sendKeys(mail);
		continueButton.click();
	}
	
	public void password(String password)
	{
		passwordField.sendKeys(password);
		loginButton.click();
	}

}
