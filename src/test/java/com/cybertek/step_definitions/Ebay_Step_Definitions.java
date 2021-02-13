package com.cybertek.step_definitions;

import com.cybertek.pages.Ebay_Home;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Ebay_Step_Definitions {

    @Given("User is on the page")
    public void user_is_on_the_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Electronics"));

    }
    @When("User sends {string} to search bar")
    public void user_sends_to_search_bar(String string) {

        Ebay_Home ebay_home = new Ebay_Home();
        ebay_home.searchButton.sendKeys(string+ Keys.ENTER);
    }
    @Then("Title should contain {string}")
    public void title_should_contain(String string) {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = string;

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
        //
    }

}
