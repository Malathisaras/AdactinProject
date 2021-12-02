package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;
	
@FindBy(xpath="//*[@id=\"username\"]")
private WebElement username;

public Login_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getUsername() {
	return username;
}
@FindBy(name="password")
private WebElement password;

public WebElement getPassword() {
	return password;
}

@FindBy(id="login")
private WebElement login;
	
public WebElement getLogin() {
	return login;
}
}