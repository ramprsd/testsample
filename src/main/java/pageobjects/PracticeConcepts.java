package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

import java.util.ArrayList;
import java.util.List;

public class PracticeConcepts extends BaseCode {

    private static Actions a= new Actions(driver);
    private static WebElement eyTable = driver.findElement(By.cssSelector(".infobox.vcard"));// css selector
    private static WebElement eyRevenue = driver.findElement(By.className("wikitable"));

    public static void iterateColumnValuesTest(){

       // int columnSize = eyTable.findElements(By.tagName("th")).size();

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

        List <String> colTwo = new ArrayList<String>();
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

        return driver.findElement(By.xpath("//table[@class='wikitable']////td[notmalize-space(text()='"+txt+"')]")).getText();

    }
}
