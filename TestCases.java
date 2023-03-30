package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01()throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        

        // Launch Chrome :
        // Load URL  https://play.google.com/store/games
        driver.get("https://play.google.com/store/games");
        // Wait for 30 seconds 
        Thread.sleep(3000); 
        // Click on the search Button Using Locator "XPath":"(//div[@class='VfPpkd-Bz112c-Jh9lGc'])[1]" 
        driver.findElementByXPath("(//div[@class='VfPpkd-Bz112c-Jh9lGc'])[1]/ ..").click();
        Thread.sleep(1000);
        
        // Click on Search Bar Using Locator "Class" Name "HWAcU"
        WebElement searchbar =  driver.findElementByClassName("HWAcU");
        searchbar.click();
        // Enter "myntra" in the search box :
        searchbar.sendKeys("myntra");
        // Click on 1st suggested result Using Locator "XPath":"(//div[@class='FfLSic'])[1]"
        driver.findElementByXPath("(//div[@class='FfLSic'])[1]").click();
        Thread.sleep(3000);
        // Print the first search result Using Locator "XPath":"(//span[@class='DdYX5'])[1]"
        WebElement searchResult = driver.findElementByXPath("(//span[@class='DdYX5'])[1]");
        Thread.sleep(1000);
        System.out.println("The Search result is : " + searchResult.getText());

    }


}
