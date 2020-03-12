package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {



        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");


        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get(urls.get(0));
        String title0 = driver.getTitle().replaceAll("\\s+", "").toLowerCase();

        if (urls.get(0).contains(title0)){
            System.out.println(urls.get(0)+" contains "+ title0 + " pass");
        }else{
            System.out.println(urls.get(0)+" does not contain "+ title0 + " fail");
        }

        driver.quit();


        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.get(urls.get(1));
        String title1 = driver1.getTitle().replaceAll("\\s+", "").toLowerCase();

        if (urls.get(1).contains(title1)){
            System.out.println(urls.get(1)+" contains "+ title1+ " pass");
        }else{
            System.out.println(urls.get(1)+" does not contain "+ title1 + " fail");
        }

        driver1.quit();


        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver2 = new ChromeDriver();
        driver2.get(urls.get(2));
        String title2 = driver2.getTitle().replaceAll("\\s+", "").toLowerCase();

        if (urls.get(2).contains(title2)){
            System.out.println(urls.get(2)+" contains "+ title2 +" pass");
        }else{
            System.out.println(urls.get(2)+" does not contain "+ title2 + " fail");
        }
        driver2.quit();


        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver3 = new ChromeDriver();
        driver3.get(urls.get(3));
        String title3 = driver3.getTitle().replaceAll("\\s+", "").toLowerCase();

        if (urls.get(3).contains(title3)){
            System.out.println(urls.get(3)+" contains "+ title3 + " pass");
        }else{
            System.out.println(urls.get(3)+" does not contain "+ title3 + " fail");
        }

        driver3.quit();


        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver4 = new ChromeDriver();
        driver4.get(urls.get(3));
        String title4 = driver4.getTitle().replaceAll("\\s+", "").toLowerCase();


        if (urls.get(4).contains(title4)){
            System.out.println(urls.get(4)+" contains "+ title4 + " pass");
        }else{
            System.out.println(urls.get(4)+" does not contain "+ title4 + " fail");
        }

        driver4.quit();

    }
}
