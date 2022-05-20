package com.carsguide.steps;

import com.carsguide.pages.UsedCarPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class UsedCarSteps {
    @And("^I click Used link$")
    public void iClickUsedLink() {
        new UsedCarPage().clickOnUsed();
    }

    @Then("^I navigate to Used Cars For Sale page$")
    public void iNavigateToUsedCarsForSalePage() {
        String expectedText= "Used Cars For Sale";
        String actualText = new UsedCarPage().verifyUsedCarForSaleText();
        Assert.assertEquals(expectedText,actualText);
    }
}
