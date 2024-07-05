package pageobjects;

import org.openqa.selenium.By;
import reusable.BaseCode;

public class SalesForceLoginPage extends BaseCode {

    public static void enterUserName(String userName){
        driver.findElement(By.id("username")).sendKeys(userName);

    }

    public static void enterPassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);

    }

    public static void clickLoginButton(){
        driver.findElement(By.id("Login")).click();

    }

    public static String getErrorMessage() {

        String actualResult = driver.findElement(By.id("error")).getText();
        return actualResult;
    }
}

