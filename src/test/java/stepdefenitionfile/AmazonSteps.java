package stepdefenitionfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import pageobjects.AmazonHomePage;
import pageobjects.AmazonSignInPage;
import reusable.BaseCode;

import java.io.FileNotFoundException;
import java.io.IOException;


public class AmazonSteps{


    @Given("user should navigate to URL")
    public void launchUrl() throws IOException {
        BaseCode.browserInvocation();
        
    }

    @When("user enters the keyword {string} and click on search button")
    public void enterSearchKeyword(String productSearch) {
        AmazonHomePage.enterSearchKeyword(productSearch);
        AmazonHomePage.clickSearchButton();

    }

    @Then("user gets the valid results")
    public void validateResults() {


    }

    @When("user clicks the signin button on home page")
    public void signinButtonOnHome() {

        AmazonHomePage.clickSignInButton();
    }

    @And("user enters credentials")
    public void userEntersCredentials() {

        AmazonSignInPage.enterEmailOrMobile("ramprasad@gmail.com");
        AmazonSignInPage.clickContinue();
        AmazonSignInPage.enterPassword("password");
        AmazonSignInPage.clickSignin();

    }

    @When("user selects the value from category dropdown")
    public void selectCategory() {

        for(int i=0; i < AmazonHomePage.getDropDownSize() ; i++){

           String val=AmazonHomePage.getDropdownValues(i);
            System.out.println(val);

        }

    }

    @Then("verify navigation to baby wishlist")
    public void verifyNavigationToBabyWishlist() {

        AmazonHomePage.verifyBabyWishlistPage();


    }

    @Given("user clicks the baby wishlist")
    public void clickTheBabyWishlist() {
        AmazonHomePage.mouseOverClick();

    }
}
