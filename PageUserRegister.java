package ua.com.automatpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUserRegister {
    private WebDriver driver;

    public PageUserRegister(WebDriver driver) {
        this.driver = driver;
    }

    public void selectState(String text) {
        WebElement stateDropdown = driver.findElement(By.id("id_state"));
        Select value = new Select(stateDropdown);
        value.selectByVisibleText(text);
    }

    public void enterFirstNameField() {
        WebElement enterFirstName = driver.findElement(By.id("customer_firstname"));
        enterFirstName.sendKeys("Jane");
    }

    public void enterLastNameTField() {
        WebElement enterLastName = driver.findElement(By.id("customer_lastname"));
        enterLastName.sendKeys("Jones");
    }

    public void enterPasswordToField() {
        WebElement enterPassword = driver.findElement(By.name("passwd"));
        enterPassword.sendKeys("123123");
    }

    public void enterFirstNameInAddress() {
        WebElement enterPassword = driver.findElement(By.id("firstname"));
        enterPassword.sendKeys("Jane");
    }

    public void enterLastNameInAddress() {
        WebElement enterLastName = driver.findElement(By.id("lastname"));
        enterLastName.sendKeys("Jonny");
    }

    public void enterCompanyInAddress() {
        WebElement enterCompany = driver.findElement(By.id("company"));
        enterCompany.sendKeys("TestCompany");
    }

    public void enterAddressInAddress() {
        WebElement enterAddress1 = driver.findElement(By.xpath("//input[@id='address1']"));
        enterAddress1.sendKeys("Germany");
    }

    public void enterCityInAddress() {
        WebElement enterCity = driver.findElement(By.id("city"));
        enterCity.sendKeys("Berlin");
    }

    public void enterPostCodeInAddress() {
        WebElement enterPostCode = driver.findElement(By.id("postcode"));
        enterPostCode.sendKeys("07936");
    }

    public void enterOtherInAddress() {
        WebElement enterOther = driver.findElement(By.id("other"));
        enterOther.sendKeys("other text");
    }

    public void enterPhoneInAddress() {
        WebElement enterPhone = driver.findElement(By.id("phone"));
        enterPhone.sendKeys("777444333");
    }

    public void enterPhoneMobileInAddress() {
        WebElement enterPhoneMobile = driver.findElement(By.id("phone_mobile"));
        enterPhoneMobile.sendKeys("+34444445789");
    }

    public void enterAliasInAddress() {
        WebElement enterAlias = driver.findElement(By.id("alias"));
        enterAlias.sendKeys("al");
    }

    public void submitRegisterButton() {
        WebElement clickRegisterButton = driver.findElement(By.id("submitAccount"));
        clickRegisterButton.click();
    }

    public void errorDisplayedMesage() {
        WebElement errorMessage  = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        errorMessage.isDisplayed();
    }

    public void myAccountPageIsDisplayed() {
        WebElement myAccountPage = driver.findElement(By.xpath("//i[@class='icon-list-ol']"));
        myAccountPage.isDisplayed();
    }
}
