package stepdefenitionfile;

import io.cucumber.java.en.Given;
import pageobjects.SpiceJetHome;

public class SpiceJetSteps {
    @Given("user selects the value in from and to dropdown")
    public void selectFromDeopdown() {
        SpiceJetHome.slectFrom();
        SpiceJetHome.selectValueFromDropdown("MAA");
        SpiceJetHome.selectValueFromDropdown("CJB");

    }
}
