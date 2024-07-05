package stepdefenitionfile;

import io.cucumber.java.en.Given;
import pageobjects.PracticeConcepts;

public class TestSteps {

    @Given("user iterates the column values")
    public void iterateColumnValues(){

        PracticeConcepts.iterateColumnValuesTest();

    }

}
