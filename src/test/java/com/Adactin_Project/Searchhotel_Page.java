package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel_Page {

	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	public Searchhotel_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(id="hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}
	
	@FindBy(id="room_type")
	private WebElement roomtype;

	public WebElement getRoomtype() {
		return roomtype;
	}
	
	@FindBy(id="room_nos")
	private WebElement roomnos;

	public WebElement getRoomnos() {
		return roomnos;
	}
	
	@FindBy(id="adult_room")
	private WebElement adults;

	public WebElement getAdults() {
		return adults;
	}
	
	public WebElement getChilds() {
		return childs;
	}

	@FindBy(id="child_room")
	private WebElement childs;
	
	@FindBy(id="Submit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
}
