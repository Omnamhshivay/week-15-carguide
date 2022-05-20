package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarPage.class.getName());
    public NewAndUsedCarPage(){
        PageFactory.initElements(driver,this);}
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement newAndUsedCarSearchText;
    @CacheLookup
    @FindBy(id = "makes")
    WebElement Make;
    @CacheLookup
    @FindBy(id = "models")
    WebElement Models;
    @CacheLookup
    @FindBy(id = "locations")
    WebElement Location;
    @CacheLookup
    @FindBy(id = "priceTo")
    WebElement Price;
    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement findMyNextCarButton;
    @CacheLookup
    @FindBy(id = "uhf-make")
    WebElement makeText;

    public String verifyNewAndUsedCarText(){
        return getTextFromElement(newAndUsedCarSearchText);
    }

    public void selectMakeFromDropDown(String make){
        log.info("Select car make "+Make.toString());
         selectByVisibleTextFromDropDown(Make,make);
    }
    public void selectModelFromDropDown(String model){
        log.info("Select car model "+ Models.toString());
        selectByVisibleTextFromDropDown(Models,model);
    }
    public void selectLocationFromDropDown(String location){
        log.info("Select location "+ Location.toString());
        selectByVisibleTextFromDropDown(Location,location);
    }
    public void selectPriceFromDropDown(String price){
        log.info("Select price "+Price.toString());
        selectByVisibleTextFromDropDown(Price,price);
    }
    public void clickOnFindMyNextCarButton(){
        log.info("Click on find my next cat button "+ findMyNextCarButton.toString());
        clickOnElement(findMyNextCarButton);
    }
    public String getMakeText(){
        log.info("Get make text "+makeText.toString());
        return getTextFromElement(makeText);
    }

}
