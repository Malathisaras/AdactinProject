package com.Adactin_Project;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class Runner_Class extends Base_Class {	
	public static WebDriver driver=Base_Class.getBrowser("chrome");
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);	
	static Logger log=Logger.getLogger(Runner_Class.class);
		public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		log.info("Adactin Practice process Starting");
		driver.get("https://www.google.com/");	
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
		getURL(url);
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		inputValueElement(pom.getLp().getUsername(),username);
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		inputValueElement(pom.getLp().getPassword(),password);
		clickOnElement(pom.getLp().getLogin());
		String location = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLocation();
		dropdown("byvalue",pom.getSp().getLocation(),location);
		String hotels = File_Reader_Manager.getInstanceFRM().getInstanceCR().getHotels();
		dropdown("byvalue",pom.getSp().getHotels(),hotels);
		String roomtype = File_Reader_Manager.getInstanceFRM().getInstanceCR().getRoomtype();
		dropdown("byvalue",pom.getSp().getRoomtype(),roomtype);
		String roomnos = File_Reader_Manager.getInstanceFRM().getInstanceCR().getRoomnos();
		dropdown("byvalue",pom.getSp().getRoomnos(),roomnos);
		String adults = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAdults();
		dropdown("byvalue",pom.getSp().getAdults(),adults);
		String childs = File_Reader_Manager.getInstanceFRM().getInstanceCR().getChilds();
		dropdown("byvalue",pom.getSp().getChilds(),childs);
		clickOnElement(pom.getSp().getSubmit());
		click(pom.getSh().getRadio());
		clickOnElement(pom.getSh().getContinuebtn());
		String fname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getfname();
		inputValueElement(pom.getBp().getFname(),fname);
		String lname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLname();
		inputValueElement(pom.getBp().getLname(),lname);
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		inputValueElement(pom.getBp().getAddress(),address);
		String ccnum = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCcnum();
		inputValueElement(pom.getBp().getCcnum(),ccnum);
		String cctype = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCctype();
		dropdown("byvalue",pom.getBp().getCctype(),cctype);
		String cmonth = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCmonth();
		dropdown("byvalue",pom.getBp().getCcmonth(),cmonth);
		String cyear = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCcyear();
		dropdown("byvalue",pom.getBp().getCcyear(),cyear);
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvv();
		inputValueElement(pom.getBp().getCvv(),cvv);
		clickOnElement(pom.getBp().getBookbtn());
		Thread.sleep(5000);
		clickOnElement(pom.getConfirm().getItinerary());
		log.info("Adactin practice process completed");
		quit();
	}
}
