package ru.DevWebteacher;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJava {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver","C:/selenium/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://school-dev.mos.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Московская электронная школа"));

        
    }
}
