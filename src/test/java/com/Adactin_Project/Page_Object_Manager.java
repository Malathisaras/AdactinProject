package com.Adactin_Project;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {
	public WebDriver driver;
	private Login_Page lp;
	private Searchhotel_Page sp;
	private Selecthotel_Page sh;
	private Bookhotel_Page bp;
	private Bookingconfirm_Page confirm;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}

	public Login_Page getLp() {
		if(lp==null)
		{
			lp=new Login_Page(driver);
		}
		return lp;
	}

	public Searchhotel_Page getSp() {
		if(sp==null)
		{
			sp=new Searchhotel_Page(driver);
		}
		return sp;
	}

	public Selecthotel_Page getSh() {
		if(sh==null)
		{
			sh=new Selecthotel_Page(driver);
		}
		return sh;
	}

	public Bookhotel_Page getBp() {
		if(bp==null)
		{
			bp=new Bookhotel_Page(driver);
		}
		return bp;
	}

	public Bookingconfirm_Page getConfirm() {
		if(confirm==null)
		{
			confirm=new Bookingconfirm_Page(driver);
		}
		return confirm;
	}

	
	
}
