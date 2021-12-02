package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel_Page {
	public WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement fname;

	public Bookhotel_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFname() {
		return fname;
	}
	
	@FindBy(id="last_name")
	private WebElement lname;

	public WebElement getLname() {
		return lname;
	}
	
	@FindBy(id="address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(id="cc_num")
	private WebElement ccnum;

	public WebElement getCcnum() {
		return ccnum;
	}
	@FindBy(id="cc_type")
	private WebElement cctype;

	public WebElement getCctype() {
		return cctype;
	}
	
	@FindBy(id="cc_exp_month")
	private WebElement ccmonth;

	public WebElement getCcmonth() {
		return ccmonth;
	}
	
	@FindBy(id="cc_exp_year")
	private WebElement ccyear;

	public WebElement getCcyear() {
		return ccyear;
	}
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;

	public WebElement getCvv() {
		return cvv;
	}
	
	@FindBy(id="book_now")
	private WebElement bookbtn;

	public WebElement getBookbtn() {
		return bookbtn;
	}
	
	
	
	

}
