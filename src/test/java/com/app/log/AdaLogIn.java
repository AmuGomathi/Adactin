package com.app.log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.AdaBa;

public class AdaLogIn extends AdaBa {
	
	 public static WebElement getUsername() { 
	    	return driver.findElement(By.id("username"));
	    	}

	    public static WebElement getPassword()  {
	    	return driver.findElement(By.id("password")); 
	    	}

	    public static WebElement getLogin() { 
	    	return driver.findElement(By.id("login"));
	    	}

	
	
	

}

