package com.cbt.utilities;

public class BrowserFactory {
    public static void main(String[] args) {


        getDriver("opera");


    }



public static WebDriver getDriver(String browserName){

    String os = System.getProperty("os.name");
    System.out.println(os);
    if (browserName.equalsIgnoreCase("chrome")) {
        //to fix [1583364253.062][SEVERE]: Timed out receiving message from renderer: 0.100
        WebDriverManager.chromedriver().version("79.0").setup();
        return new ChromeDriver();

    }else if (browserName.equalsIgnoreCase("opera")) {
        WebDriverManager.operadriver().setup();
        return new OperaDriver();
    }else if (browserName.equalsIgnoreCase("edge")){
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    } else{
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();

    }



}



}
