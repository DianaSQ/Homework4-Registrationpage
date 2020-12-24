package ua.com.automatpractice.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartSummary {
    private WebDriver driver;

    public ShoppingCartSummary(WebDriver driver) {
        this.driver = driver;
    }

    public void increasingItemCount(){
        WebElement increaseCount = driver.findElement(By.className("icon-plus"));
        increaseCount.click();
    }

    public void deleteItemsfromCart(){
        WebElement deleteItem = driver.findElement(By.id("2_7_0_0"));
        deleteItem.click();
    }

    public void verifyTotalAmountAndTax(){
        Assert.assertTrue("Должно быть $54.00",driver.findElement(By.xpath("//td[text()='$54.00']")).getText().contains("$54.00") );
        Assert.assertTrue("Должно быть $2.00",driver.findElement(By.xpath("//td[text()='$2.00']")).getText().contains("$2.00"));
        Assert.assertTrue("Должно быть $56.00",driver.findElement(By.xpath("//td[text()='$56.00']")).getText().contains("$56.00"));
    }

}
