package ua.com.automatpractice.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageItemsList{
    private WebDriver driver;

    public PageItemsList (WebDriver driver)
    {
        this.driver=driver;
    }

    public void switchToListView(){
        WebElement listView = driver.findElement(By.xpath("//i[@class='icon-th-list']"));
        listView.click();
    }

    public  void addToCardItem(){
        WebElement addItem = driver.findElement(By.xpath("//a[@title='Add to cart']"));
        addItem.click();
    }
 public void proceedToSummarySection(){
        WebElement summarySection = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
        summarySection.click();
 }


 public void verifyCartEmpty(){
        WebElement emptyCart = driver.findElement(By.className("ajax_cart_no_product"));
        emptyCart.isDisplayed();
 }
}
