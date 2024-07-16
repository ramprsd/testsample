package stepdefenitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.PracticeConcepts;

import static reusable.BaseCode.driver;

public class TestSteps {

    @Given("user iterates the column values")
    public void iterateColumnValues(){

        PracticeConcepts.iterateColumnValuesTest();

    }

    @When("drag and drop the element")
    public void dragAndDrop() {

        PracticeConcepts.dragAndDrop();

    }

    @Given("select droppable")
    public void selectDroppable() {
        PracticeConcepts.dropablePage();
    }


    @When("click cancel button")
    public void clickButtonAndConfrim() {
        PracticeConcepts.cancelAlert();
    }

    @Given("select alert with ok and cancel")
    public void selectAlertWithOkAndCancel() {
        PracticeConcepts.selectOKandCancel();
        PracticeConcepts.selectButton();
    }

}
