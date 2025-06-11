package com.app.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.log.AdaLogIn;

public class AdaSearchHotel extends AdaLogIn {
	

    public static WebElement getLocation() { 
    	return driver.findElement(By.id("location"));
    	}

    public static WebElement getHotels() { 
    	return driver.findElement(By.id("hotels"));
    	}

    public static WebElement getRoomType() {
    	return driver.findElement(By.id("room_type"));
    	}

    public static WebElement getRoomNos() {
    	return driver.findElement(By.id("room_nos")); 
    	}

    public static WebElement getAdultRoom() {
    	return driver.findElement(By.id("adult_room"));
    	}

    public static WebElement getChildRoom() {
    	return driver.findElement(By.id("child_room")); 
    	}

    public static WebElement getCheckInDate() { 
    	return driver.findElement(By.id("datepick_in"));
    	}

    public static WebElement getCheckOutDate() {
    	return driver.findElement(By.id("datepick_out"));
    	}

    public static WebElement getSubmitButton() {
    	return driver.findElement(By.id("Submit")); 
    	}


	
}
