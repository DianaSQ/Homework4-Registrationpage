package ua.com.automatpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver)
    {
        this.driver=driver;
    }


    public void pressSignButton(){
        WebElement signInButton = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
        signInButton.click();

    }

    public void fillSearchField(){
        WebElement searchField = driver.findElement(By.id("search_query_top"));
        searchField.clear();
        searchField.sendKeys("Blouse");
    }

    public void submitSearchField(){
        WebElement submitField = driver.findElement(By.xpath("//button[@name='submit_search']"));
        submitField.click();
    }


}

