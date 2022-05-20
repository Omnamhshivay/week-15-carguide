package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCarPage extends Utility {
    private static final Logger log = LogManager.getLogger(UsedCarPage.class.getName());
    public UsedCarPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement usedCars;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Used Cars For Sale')]")
    WebElement usedCarForSaleText;

    public void clickOnUsed(){
        clickOnElement(usedCars);
    }
    public String verifyUsedCarForSaleText(){
        return getTextFromElement(usedCarForSaleText);
    }


}
