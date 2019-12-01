package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SEARCHFIELD = "lst-ib";
    //Selenium jest w headerze, mozna zmienic zeby wygladalo jak przegladarka
    //obiekt user agent
    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.google.com");

//        WebElement searchField = driver.findElement(By.id(SEARCHFIELD));
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Selenium");
        searchField.submit();
    }
}

//        System.setProperty("webdriver.gecko.driver", "c:\\Selenium-drivers\\Firefox\\geckodriver.exe");
//        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.OPERA);