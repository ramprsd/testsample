package reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCode {

    public static WebDriver driver;

    public static void browserInvocation(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.navigate().to("https://www.spicejet.com/");
        //driver.navigate().to("https://login.salesforce.com/");
        driver.navigate().to("https://www.amazon.in/");
        System.out.println(driver.getTitle());
    }

}
