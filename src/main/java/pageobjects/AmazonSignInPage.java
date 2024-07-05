package pageobjects;

import org.openqa.selenium.By;
import reusable.BaseCode;

public class AmazonSignInPage extends BaseCode {

    public static void enterEmailOrMobile(String email){

        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(email);

    }

    public static void clickContinue(){
        driver.findElement(By.xpath("//input[@id='continue']")).click();

    }

    public static void enterPassword(String password){

        driver.findElement(By.id("ap_password")).sendKeys(password);

    }

    public static void clickSignin(){

        driver.findElement(By.id("signInSubmit")).click();
    }

}
