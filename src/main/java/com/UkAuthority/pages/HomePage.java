package com.UkAuthority.pages;


import com.UkAuthority.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;


public class HomePage extends Utility {


    Logger log = Logger.getLogger("");

    @CacheLookup
    @FindBy(xpath = "//div[@id='search-wrapper']//input[@name='q']")
    WebElement searchByKeyword;

    @CacheLookup
    @FindBy(xpath = "//*[@id='search-wrapper']/div/form/div/div/div[1]/div[1]/div[2]/input")
    WebElement searchByLocation;

    @CacheLookup
    @FindBy(xpath = "//*[@id='search-wrapper']/div/form/div/div/div[2]/div[2]/div[1]/input")
    WebElement searchJobsButton;

    @CacheLookup
    @FindBy(xpath = "//*[@id='content']/div/h1/span")
    WebElement verifyText;

    public HomePage() {


        PageFactory.initElements(driver, this);
    }

    public void enterInSearchByKeywordField(String keyword) {
        log.info("Entering in Search by Keyword :");
        sendTextToElement(searchByKeyword, keyword);

    }

    public void enterInSearchByLocationField(String location) {
        log.info("Entering in Search by Location :");
        sendTextToElement(searchByLocation, location);

    }

    public void clickOnSearchJobsButton() {
        log.info("Clicking on Search Job Button");
        clickOnElement(searchJobsButton);
    }


    public String verifyResultText() {
        log.info("Verifying actual text " +getTextFromElement(verifyText));
              return getTextFromElement(verifyText);
    }


}
