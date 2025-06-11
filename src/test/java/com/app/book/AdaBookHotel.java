package com.app.book;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.select.AdaSelectHotel;

public class AdaBookHotel extends AdaSelectHotel{
	
	 public static WebElement getFirstName() {
	    	return driver.findElement(By.id("first_name")); 
	    	}

	    public static WebElement getLastName() {
	    	return driver.findElement(By.id("last_name")); 
	    	}

	    public static WebElement getAddress() { 
	    	return driver.findElement(By.id("address"));
	    	}

	    public static WebElement getCreditCardNo() { 
	    	return driver.findElement(By.id("cc_num")); 
	    	}

	    public static WebElement getCardType() { 
	    	return driver.findElement(By.id("cc_type"));
	    	}

	    public static WebElement getExpMonth() { 
	    	return driver.findElement(By.id("cc_exp_month"));
	    	}

	    public static WebElement getExpYear() {
	    	return driver.findElement(By.id("cc_exp_year"));
	    	}

	    
	    
	    public static WebElement getCVV() { 
	    	return driver.findElement(By.id("cc_cvv"));
	    	}

	    public static WebElement getBookNow() {
	    	return driver.findElement(By.id("book_now"));
	    	}

	    public static WebElement getOrderNo() {
	    	return driver.findElement(By.id("order_no"));
	    	}


}


