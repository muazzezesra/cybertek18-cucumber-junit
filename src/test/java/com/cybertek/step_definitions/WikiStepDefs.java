package com.cybertek.step_definitions;

import com.cybertek.pages.wikiSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class WikiStepDefs {
    WebDriver driver = Driver.getDriver();
    wikiSearchPage wikiSearchPage = new wikiSearchPage();

    @Given("User is on the Wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {
        driver.get("https://www.wikipedia.org");
    }

    @When("User searches {string} in the wiki search page")
    public void user_searches_in_the_wiki_search_page(String string) {
        wikiSearchPage.searchBox.sendKeys(string);
        wikiSearchPage.searchButton.click();
    }

    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String string) {
        Assert.assertTrue(driver.getTitle().contains(string));
    }

    @Then("User should see {string} in the main header")
    public void user_should_see_in_the_main_header(String expected) {

        String actualHeaderText = wikiSearchPage.mainHeaderAfterSearch.getText();

        Assert.assertEquals(actualHeaderText, expected);
    }


    @Then("User should see {string} in the image header")
    public void user_should_see_in_the_image_header(String string) {
      String actualHeader = wikiSearchPage.imageHeaderAfterSearch.getText();
      Assert.assertEquals(actualHeader,string);
    }

}
