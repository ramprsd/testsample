package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;
import org.junit.Assert;

import java.util.Set;

public class AmazonHomePage extends BaseCode {

    private static WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));
    private static WebElement signinElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
    private static Actions a= new Actions(driver);

    public static void enterSearchKeyword(String productSearch){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productSearch);

    }

    public static void clickSearchButton(){
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public static void clickSignInButton(){

        driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();

    }


    public static void handleByIndex(int index){
        Select category = new Select(categoryElement);
        category.selectByIndex(index);

    }

    public static void handleByValue(String val){
        Select category = new Select(categoryElement);
        category.selectByValue(val);

    }

    public static void handleByText(String txt){
        Select category = new Select(categoryElement);
        category.selectByVisibleText(txt);

    }

    public static int getDropDownSize(){

        return categoryElement.findElements(By.tagName("option")).size();
    }

    public static String getDropdownValues(int index){

        return categoryElement.findElements(By.tagName("option")).get(index).getText();

    }

    public static void mouseOverClick(){


        a.clickAndHold(signinElement).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
        //driver.findElement(By.partialLinkText("Baby W")).click();


    }

    public static void verifyBabyWishlistPage(){

        Set<String> windowProperty = driver.getWindowHandles();

        for(String a:windowProperty){
            driver.switchTo().window(a);
            System.out.println(a);
            if(driver.getTitle().equals("not equal")){
                break;
            }
        }

        System.out.println(driver.getTitle());
        Assert.assertEquals("",driver.getTitle());

        driver.switchTo().defaultContent();

    }


}
