package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EtsyStepDefinitions {

    private WebDriver driver = Driver.getDriver();
    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @Given("User is on the etsy home page")
    public void user_is_on_the_etsy_home_page() {
        driver.get("https://www.etsy.com");
    }

    @Then("User should see title is as expected")
    public void user_should_see_title_is_as_expected() {
       String actualTitle = driver.getTitle();
       String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
       Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Then("User types {string} in the search box")
    public void user_types_in_the_search_box(String searchValue) {
            etsySearchPage.searchBox.sendKeys(searchValue);
    }

    @Then("User clicks to search button")
    public void user_clicks_to_search_button() {
            etsySearchPage.searchButton.click();
    }

    @Then("User should see {string} in the etsy title")
    public void user_should_see_in_the_etsy_title(String string) {
            Assert.assertTrue(driver.getTitle().contains(string));
    }


}
