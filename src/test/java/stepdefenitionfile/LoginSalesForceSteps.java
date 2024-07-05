package stepdefenitionfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;+
import pageobjects.SalesForceLoginPage;
import reusable.BaseCode;

public class LoginSalesForceSteps extends BaseCode {


    @Given("user navigates to salesforce url")
    public void launchUrl(){
        BaseCode.browserInvocation();

    }

    @And("user click the login button")
    public void clickLoginButton(){
        SalesForceLoginPage.clickLoginButton();

    }

    @Then("user should navigate to homepage")
    public void homepage(){


    }

    @Then("user validate the error message")
    public void errorMessage(){

        String expectedResult = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        String actualResult = SalesForceLoginPage.getErrorMessage();

        //Assert.assertEquals(expectedResult,actualResult);

        if (expectedResult.equals(actualResult)){

            Assert.assertTrue(true);
            System.out.println("Same error message - Success");
        }else{
            Assert.assertTrue(false);
            System.out.println("Failed");
        }

    }

    @When("user enters the username {string} and password {string}")
    public void enterUserAndPassword(String userName, String password){
        SalesForceLoginPage.enterUserName(userName);
        SalesForceLoginPage.enterPassword(password);

    }


}
