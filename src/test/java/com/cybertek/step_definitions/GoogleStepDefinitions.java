package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals("Actual title does not match with the expected title!",actualTitle,expectedTitle);
    }



    @When("User searches {string}")
    public void user_searches(String string) {
        WebElement searchBox = googleSearchPage.searchBox;
        searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("User should see {string} in the title")
    public void user_should_see_in_the_title(String string) {

        String expectedtitle = string+" - Google Search";
        String actualtitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualtitle,expectedtitle);
    }


    @Then("User should see About link")
    public void user_should_see_about_link() {

       boolean aboutlink = googleSearchPage.aboutLink.isDisplayed();
       Assert.assertTrue(aboutlink);
    }
    @Then("User clicks About link")
    public void user_clicks_about_link() {
      googleSearchPage.aboutLink.click();
    }
    @Then("User should see title Google - About Google, Our Culture & Company News")
    public void user_should_see_title_google_about_google_our_culture_company_news() {
       String actualtitle = Driver.getDriver().getTitle();
       String expectedtitle = "Google - About Google, Our Culture & Company News";
       Assert.assertEquals(actualtitle,expectedtitle);
    }

}
