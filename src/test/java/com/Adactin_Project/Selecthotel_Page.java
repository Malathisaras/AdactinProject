package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel_Page {

	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;

	public Selecthotel_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio() {
		return radio;
	}
	
	@FindBy(id="continue")
	private WebElement continuebtn;

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	
}
