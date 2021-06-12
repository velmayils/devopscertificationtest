package com.edureka.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

    public static void main(String[] args) {
        WebDriver browser;
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        browser = new ChromeDriver(options);
        browser.get("http://35.154.34.137:8081/index.php");
        WebElement button = browser.findElement(By.id("About Us"));
        assert(button.isDisplayed());
        System.out.println("Button about is there: " + button.isDisplayed());
        button.click();
        assert(button.getText().equals("about"));
        browser.close();
    }
}
