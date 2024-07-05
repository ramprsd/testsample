package reusable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseCode {

    public static WebDriver driver;
    public static Properties prop;

    public static void browserInvocation() throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/main/resources/configuration/config.properties"));

        prop = new Properties();
        prop.load(fis);

        if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else if(prop.getProperty("browser").equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }
        else{
            throw new InvalidArgumentException("Invalid Browser name provided");
        }
        driver.manage().window().maximize();
        driver.navigate().to(prop.getProperty("salesforceURL"));


    }

}
