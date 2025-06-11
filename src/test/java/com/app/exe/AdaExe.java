package com.app.exe;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.app.base.AdaBa;
import com.app.book.AdaBookHotel;
import com.app.log.AdaLogIn;
import com.app.search.AdaSearchHotel;
import com.app.select.AdaSelectHotel;



public class AdaExe extends AdaBookHotel {
	
	public static void main(String[] args)  {

    	AdaBa.launchBrowser();

		// Login
    	AdaBa.inputText(AdaLogIn.getUsername(), AdaBa.getProperty("username"));
		AdaBa.inputText(AdaLogIn.getPassword(), AdaBa.getProperty("password"));
		AdaLogIn.getLogin().click();

		// Search hotel
		AdaBa.selectDropdown(AdaSearchHotel.getLocation(), AdaBa.readExcel(1, 0));
		AdaBa.selectDropdown(AdaSearchHotel.getHotels(), AdaBa.readExcel(2, 1));
		AdaBa.selectDropdown(AdaSearchHotel.getRoomType(), AdaBa.readExcel(3, 2));
		AdaBa.selectDropdown(AdaSearchHotel.getRoomNos(), AdaBa.readExcel(4, 3));
		AdaBa.inputText(AdaSearchHotel.getCheckInDate(), AdaBa.readExcel(1, 6));
		AdaBa.inputText(AdaSearchHotel.getCheckOutDate(), AdaBa.readExcel(1, 7));
		AdaBa.selectDropdown(AdaSearchHotel.getAdultRoom(), AdaBa.readExcel(4, 4));
		AdaBa.selectDropdown(AdaSearchHotel.getChildRoom(), AdaBa.readExcel(4, 5));


		AdaSearchHotel.getSubmitButton().click();
		
		AdaSelectHotel.getRadioBtn().click();
		AdaSelectHotel.getContinueBtn().click();

		// Enter booking details
		AdaBa.inputText(AdaBookHotel.getFirstName(), AdaBa.readExcel(1, 8));
		AdaBa.inputText(AdaBookHotel.getLastName(), AdaBa.readExcel(1, 9));
		AdaBa.inputText(AdaBookHotel.getAddress(), AdaBa.readExcel(1, 10));
		AdaBa.inputText(AdaBookHotel.getCreditCardNo(), AdaBa.readExcel(1, 11));

		AdaBa.selectDropdown(AdaBookHotel.getCardType(), AdaBa.readExcel(2, 12));
		AdaBa.selectDropdown(AdaBookHotel.getExpMonth(), AdaBa.readExcel(1, 13));
		AdaBa.selectDropdown(AdaBookHotel.getExpYear(), AdaBa.readExcel(1, 14));
		AdaBa.inputText(AdaBookHotel.getCVV(), AdaBa.readExcel(1, 15));

		AdaBookHotel.getBookNow().click();

		WebDriverWait wait = new WebDriverWait(AdaBa.driver, Duration.ofSeconds(30));
		
		
		WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_no")));
		String orderNumber=orderNo.getAttribute("value");
		System.out.println(orderNumber);
		
        
    

    }


}
