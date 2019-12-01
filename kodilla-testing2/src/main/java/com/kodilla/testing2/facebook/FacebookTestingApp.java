package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {

    public static final String XPATH_NAME = "//div[@class=\"clearfix _58mh\"]/div/div/div/input";
    public static final String XPATH_SURNAME = "//div[@class=\"clearfix _58mh\"]/div[2]/div/div/input";
    public static final String XPATH_EMAIL = "//div[@class=\"mbm _a4y\"]/div/div/input";
    public static final String XPATH_EMAIL_CONFIRM = "//div[@class=\"_5-ah\"]/div/div/div/input";
    public static final String XPATH_PASSWORD = "//div[@class=\"mbm _br- _a4y\"]/div/div/input";
    public static final String XPATH_DAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement inputName = driver.findElement(By.xpath(XPATH_NAME));
        inputName.sendKeys("Selenium Name");

        WebElement inputSurname = driver.findElement(By.xpath(XPATH_SURNAME));
        inputSurname.sendKeys("Selenium Surname");

        WebElement inputEmail = driver.findElement(By.xpath(XPATH_EMAIL));
        inputEmail.sendKeys("Selenium@selenium.com");

        WebDriverWait wait = new WebDriverWait(driver, 1);
        WebElement test = wait.until(x -> x.findElement(By.xpath(XPATH_EMAIL_CONFIRM)));

        WebElement confirmEmail = driver.findElement(By.xpath(XPATH_EMAIL_CONFIRM));
        confirmEmail.sendKeys("Selenium@selenium.com");

        WebElement inputPassword = driver.findElement(By.xpath(XPATH_PASSWORD));
        inputPassword.sendKeys("Selenium");

        Select selectBoard;
        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        selectBoard = new Select(selectDay);
        selectBoard.selectByIndex(8);
        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        selectBoard = new Select(selectMonth);
        selectBoard.selectByIndex(5);
        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        selectBoard = new Select(selectYear);
        selectBoard.selectByIndex(32);

        //searchField.submit();
    }
}
