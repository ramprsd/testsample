package javabasics;

import org.apache.commons.collections4.functors.CatchAndRethrowClosure;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BaseCode;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

public class ExceptionExample extends BaseCode {

    public static void main(String[] args) throws IOException {

        String a = "$2";
        int b = 10;
        BaseCode.browserInvocation();

        try {
            driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
            driver.findElement(By.xpath("//div[text()='Modify Search']")).click();
//            int c = Integer.parseInt(a);
//            System.out.println(b + c);
        }
        catch(NumberFormatException k){

            String va = a.substring(1);
            int v = Integer.parseInt(va);
            System.out.println(b + v);

        }
        catch(NoSuchElementException j){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));
            driver.findElement(By.xpath("//div[text()='Modify Search']")).click();
        }
        finally{
            System.out.println("End of Code");
        }

    }

}
