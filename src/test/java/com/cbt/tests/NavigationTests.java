package com.cbt.tests;

import com.cbt.utilities.StringUtility;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;


public class NavigationTests {

    public static void main(String[] args) {



        HW("safari");
        HW("firefox");
        HW("chrome");




    }

    public static void HW(String name){

        WebDriver driver = BrowserFactory.getDriver(name);
        driver.get("https://google.com");
        String title = driver.getTitle();


        driver.navigate().to("http://etsy.com");
        String title1 = driver.getTitle();


        driver.navigate().back();

        StringUtility.verifyEquals(title,driver.getTitle());

        driver.navigate().forward();

        StringUtility.verifyEquals(title1,driver.getTitle());

        driver.quit();

    }
}