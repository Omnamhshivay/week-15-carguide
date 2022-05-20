package com.carsguide.steps;

import com.carsguide.pages.HomePage;
import com.carsguide.pages.NewAndUsedCarPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CarSearchSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverOnBuyAndSell();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCarsTab();
    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        String expectedText="New & Used Car Search - carsguide";
        String actualText =new NewAndUsedCarPage().verifyNewAndUsedCarText();
        Assert.assertEquals(expectedText,actualText);
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make)  {
        new NewAndUsedCarPage().selectMakeFromDropDown(make);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model)  {
        new NewAndUsedCarPage().selectModelFromDropDown(model);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location)  {
        new NewAndUsedCarPage().selectLocationFromDropDown(location);

    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price)  {
        new NewAndUsedCarPage().selectPriceFromDropDown(price);

    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarPage().clickOnFindMyNextCarButton();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make)  {
        String expectedText = "Make";
        String actualText = new NewAndUsedCarPage().getMakeText();

    }
}
