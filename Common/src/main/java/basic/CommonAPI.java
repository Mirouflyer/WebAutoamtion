package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;
    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url){
    System.setProperty("webdriver.chrome.driver","/Users/mirouflyer/mirou-workspace/Automation_test1/Common/driver/chromedriver");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.navigate().to(url);
    driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeUp(){
        driver.close();
    }
            }


