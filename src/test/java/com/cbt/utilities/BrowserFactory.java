package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {



    public static WebDriver getDriver(String browserName) {
        String os = System.getProperty("os.name");
        System.out.println(os);
        if(os.equalsIgnoreCase("Mac OS X") && browserName.equalsIgnoreCase("edge")){
            return null;
        }

        if (browserName.equalsIgnoreCase("chrome")) {
            //to fix [1583364253.062][SEVERE]: Timed out receiving message from renderer: 0.100
            WebDriverManager.chromedriver().version("79.0").setup();
            return new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().setup();
            return new OperaDriver();
        } else if (browserName.equalsIgnoreCase("safari")) {
                return new SafariDriver();
        } else {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }





    }
}