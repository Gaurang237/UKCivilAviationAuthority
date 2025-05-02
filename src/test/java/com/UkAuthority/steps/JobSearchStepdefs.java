package com.UkAuthority.steps;

import com.UkAuthority.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class JobSearchStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("I enter in Search by Keyword field {string}")
    public void iEnterInSearchByKeywordField(String keyword) {
        new HomePage().enterInSearchByKeywordField(keyword);
    }


    @And("^I Click on Search Button$")
    public void iClickOnSearchButton() {
        new HomePage().clickOnSearchJobsButton();
    }


    @And("I enter in Search by Location field {string}")
    public void iEnterInSearchByLocationField(String location) {
        new HomePage().enterInSearchByLocationField(location);
    }


    @Then("User should see result successfullly {string}")
    public void userShouldSeeResultSuccessfullly(String text) {
        Assert.assertEquals(text, new HomePage().verifyResultText());
    }
}
