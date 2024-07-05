package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

public class PracticeConcepts extends BaseCode {

    private static Actions a= new Actions(driver);
    private static WebElement eyTable = driver.findElement(By.cssSelector(".infobox vcard"));// css selector
    private static WebElement eyRevenue = driver.findElement(By.className("wikitable"));

    public static void iterateColumnValuesTest(){

        int columnSize = eyTable.findElements(By.tagName("th")).size();

        for (int i=0;i<columnSize;i++){

            String colOneValue = eyTable.findElements(By.tagName("th")).get(i).getText();
            System.out.println(colOneValue);

        }
        for(int k = 1;k<eyTable.findElements(By.tagName("tr")).size();k++){

            String colTwoValue = eyTable.findElements(By.tagName("tr")).get(k).getText();
            System.out.println(colTwoValue);
        }



    }

    public static String getSpecificValue(int row, int col){

        return  driver.findElement(By.xpath("//table[@class='wikitable']//tr["+row+"]//td["+col+"]")).getText();

    }

    public static String getEntireValue(int col){

        return driver.findElement(By.xpath("//table[@class='wikitable']//tr//td["+col+"]")).getText();

    }

    public static String getValuesByName(String txt){

        return driver.findElement(By.xpath("//table[@class='wikitable']////td[notmalize-space(text()='"+txt+"')]")).getText();

    }
}
