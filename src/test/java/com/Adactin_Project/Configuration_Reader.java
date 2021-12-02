package com.Adactin_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws Throwable
	{
	File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Adactin_Project\\Configuration.properties");
	FileInputStream fis=new FileInputStream(f);
	p=new Properties();
	p.load(fis);
	}
public String getURL() {
String url = p.getProperty("url");
return url;
}
public String getUsername() {
	String username = p.getProperty("username");
	return username;

}
public String getPassword() {
	String password = p.getProperty("password");
	return password;

}
public String getLocation() {
	String location = p.getProperty("location");
	return location;

}
public String getHotels() {
	String hotels = p.getProperty("hotels");
	return hotels;

}
public String getRoomtype() {
	String roomtype = p.getProperty("roomtype");
	return roomtype;

}
public String getRoomnos() {
String roomno = p.getProperty("roomnos");
return roomno;

}
public String getAdults() {
	String adults = p.getProperty("adults");
	return adults;

}
public String getChilds() {
	String childs = p.getProperty("childs");
return childs;	

}
public String getfname() {
	String fname = p.getProperty("first_name");
	return fname;

}
public String getLname() {
	String lname = p.getProperty("last_name");
	return lname;
	

}
public String getAddress() {
	String address = p.getProperty("address");
	return address;

}
public String getCcnum() {
	String ccnum = p.getProperty("ccnum");
	return ccnum;

}
public String getCctype() {
	String cctype = p.getProperty("cctype");
	return cctype;

}
public String getCmonth() {
	String ccmonth = p.getProperty("ccmonth");
	return ccmonth;

}
public String getCcyear() {
	String ccyear = p.getProperty("ccyear");
	return ccyear;
	
}
public String getCvv() {

String cvv = p.getProperty("cvv");
return cvv;

}
}

