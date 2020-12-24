package ua.com.automatpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthentificationPage {
    private WebDriver driver1;

    public AuthentificationPage(WebDriver driver1){
        this.driver1=driver1;
    }

    public void enterEmailField(){
        WebElement emailField = driver1.findElement(By.id("email_create"));
        emailField.sendKeys("test+12@test.com");
    }

    public void pressCreateAccountButton(){
        WebElement createAccountButton = driver1.findElement(By.xpath("//i[@class='icon-user left']"));
        createAccountButton.click();
    }

}
