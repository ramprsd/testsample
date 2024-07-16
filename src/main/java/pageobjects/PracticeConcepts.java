package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

import java.util.ArrayList;
import java.util.List;

public class PracticeConcepts extends BaseCode {

    private static Actions a= new Actions(driver);


    public static void iterateColumnValuesTest(){

       // int columnSize = eyTable.findElements(By.tagName("th")).size();
        WebElement eyTable = driver.findElement(By.cssSelector(".infobox.vcard"));// css selector
        WebElement eyRevenue = driver.findElement(By.className("wikitable"));

        List <WebElement> webEl = eyTable.findElements(By.tagName("th"));

        List <String> colOne = new ArrayList<String>();

        for(WebElement g:webEl){
            colOne.add(g.getText());
        }

//        for (int i=0;i<columnSize;i++){
//
//            String colOneValue = eyTable.findElements(By.tagName("th")).get(i).getText();
//            colOne.add(colOneValue);
//
//        }

        System.out.println(colOne);

        List <String> colTwo = new ArrayList<>();
        for(int k = 1;k<eyTable.findElements(By.tagName("tr")).size();k++){

            colTwo.add(eyTable.findElements(By.tagName("tr")).get(k).getText());

        }
        System.out.println(colTwo);

    }

    public static String getValueFromTable(int row, int col){

        return  driver.findElement(By.xpath("//table[@class='wikitable']//tr["+row+"]//td["+col+"]")).getText();

    }

    public static String getValueFromTable(int col){

        return driver.findElement(By.xpath("//table[@class='wikitable']//tr//td["+col+"]")).getText();

    }

    public static String getValueFromTable(String txt){

        return driver.findElement(By.xpath("//table[@class='wikitable']////td[normalize-space(text()='"+txt+"')]")).getText();

    }

    public static void dropablePage(){
        driver.findElement(By.xpath("//a[text()='Droppable']")).click();
    }

    public static void dragAndDrop(){

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
        a.dragAndDrop(source,target).build().perform();
        driver.switchTo().defaultContent();

    }

    public static void selectOKandCancel(){
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
    }
    public static void selectButton(){
        driver.findElement(By.xpath("//div[@id='CancelTab']/button")).click();
    }

    public static void cancelAlert(){
        driver.switchTo().alert().getText();

        driver.switchTo().alert().dismiss();
        //driver.switchTo().alert().accept();
        //Assert.assertEquals(""); -- use for Text Alert
    }
}
