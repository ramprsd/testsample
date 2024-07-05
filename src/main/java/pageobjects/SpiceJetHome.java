package pageobjects;

import org.openqa.selenium.By;
import reusable.BaseCode;

public class SpiceJetHome extends BaseCode {

    public static void slectFrom(){
            driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/descendant::div/descendant::div/child::input")).click();

    }

    public static void selectValueFromDropdown(String cityName){

        driver.findElement(By.xpath("//div[text()='"+cityName+"']")).click();

    }
}
