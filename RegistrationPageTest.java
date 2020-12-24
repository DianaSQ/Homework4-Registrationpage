package com.automationpractice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import ua.com.automatpractice.pages.*;
import ua.com.automatpractice.pages.PageItemsList;

public class RegistrationPageTest extends BaseClass{
    private MainPage mainPage;
    private AuthentificationPage authentificationPage;
    private PageUserRegister pageUserRegister;
    private PageItemsList pageItemsList;
    private ShoppingCartSummary shoppingCartSummary;



    @BeforeClass
    public static void beforeRegistrationPageTest(){
        chrome.navigate().to("http://automationpractice.com/index.php");

    }

     @Before
     public void setupPages(){
         mainPage = new MainPage(chrome);
         authentificationPage = new AuthentificationPage(chrome);
         pageUserRegister = new PageUserRegister(chrome);
         pageItemsList = new PageItemsList(chrome);
         shoppingCartSummary = new ShoppingCartSummary(chrome);
     }



    @Test
    public void testOpenRegistrationPage(){
    mainPage.pressSignButton();
    authentificationPage.enterEmailField();
    authentificationPage.pressCreateAccountButton();
   boolean iSCreateUserPageDisplayed = chrome.findElement(By.cssSelector(".page-heading")).isDisplayed();
  Assert.assertTrue("Create Account page should contain title", iSCreateUserPageDisplayed);
    }


    @Test
    public void testRegistrationWithPasswordfieldError(){
        mainPage.pressSignButton();
        authentificationPage.enterEmailField();
        authentificationPage.pressCreateAccountButton();
        pageUserRegister.enterFirstNameField();
        pageUserRegister.enterLastNameTField();
        pageUserRegister.enterFirstNameInAddress();
        pageUserRegister.enterLastNameInAddress();
        pageUserRegister.enterCompanyInAddress();
        pageUserRegister.enterAddressInAddress();
        pageUserRegister.enterCityInAddress();
        pageUserRegister.selectState("Alabama");
        pageUserRegister.enterPostCodeInAddress();
        pageUserRegister.enterOtherInAddress();
        pageUserRegister.enterPhoneInAddress();
        pageUserRegister.enterPhoneMobileInAddress();
        pageUserRegister.enterAliasInAddress();
        pageUserRegister.submitRegisterButton();
        pageUserRegister.errorDisplayedMesage();
    }

   @Test
    public void testSuccessfullRegisterUser() {
       mainPage.pressSignButton();
       authentificationPage.enterEmailField();
       authentificationPage.pressCreateAccountButton();
       pageUserRegister.enterFirstNameField();
       pageUserRegister.enterLastNameTField();
       pageUserRegister.enterPasswordToField();
       pageUserRegister.enterFirstNameInAddress();
       pageUserRegister.enterLastNameInAddress();
       pageUserRegister.enterCompanyInAddress();
       pageUserRegister.enterAddressInAddress();
       pageUserRegister.enterCityInAddress();
       pageUserRegister.selectState("Alabama");
       pageUserRegister.enterPostCodeInAddress();
       pageUserRegister.enterOtherInAddress();
       pageUserRegister.enterPhoneInAddress();
       pageUserRegister.enterPhoneMobileInAddress();
       pageUserRegister.enterAliasInAddress();
       pageUserRegister.submitRegisterButton();
       pageUserRegister.myAccountPageIsDisplayed();
    }

    @Test
    public void testWithSearchAndAddingItemToCArt(){
        mainPage.fillSearchField();
        mainPage.submitSearchField();
       pageItemsList.switchToListView();
       pageItemsList.addToCardItem();
       pageItemsList.proceedToSummarySection();
        shoppingCartSummary.increasingItemCount();
        shoppingCartSummary.verifyTotalAmountAndTax();
       shoppingCartSummary.deleteItemsfromCart();
        pageItemsList.verifyCartEmpty();
    }

    }


