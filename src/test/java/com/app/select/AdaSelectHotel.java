package com.app.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.search.AdaSearchHotel;

public class AdaSelectHotel extends AdaSearchHotel{

	 public static WebElement getRadioBtn() {
	    	return driver.findElement(By.id("radiobutton_0")); 
	    	}

	    public static WebElement getContinueBtn() {
	    	return driver.findElement(By.id("continue")); 
	    	}

	
}


