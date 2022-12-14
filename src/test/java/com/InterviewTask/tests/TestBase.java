package com.InterviewTask.tests;

import com.InterviewTask.utils.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected WebDriver driver;
    protected Faker faker = new Faker();
    protected Actions actions;
    protected Alert alert;
//    protected WebDriverWait wait = new WebDriverWait(driver,10);


    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
        actions = new Actions(driver);

    }



    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
