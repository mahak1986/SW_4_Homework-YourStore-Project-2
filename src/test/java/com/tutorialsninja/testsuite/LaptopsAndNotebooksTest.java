package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends BaseTest {
    HomePage homePage = new HomePage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    MacBookPage macBookPage = new MacBookPage();
    MacBookCheckOutPage macBookCheckOutPage = new MacBookCheckOutPage();


    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        homePage.mouseHoverOnLaptopsAndNotebooksTab();
        homePage.clickOnShowAllLaptopsAndNotebooks();
        laptopsAndNotebooksPage.productNameInAplhabeticalOrder("Price (High > Low)");

    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnCurrencyDropDownAndClick();
        homePage.mouseHoverOnPoundSterlingAndClick();
        homePage.mouseHoverOnLaptopsAndNotebooksTab();
        homePage.clickOnLaptopsAndNotebooksTab();
        homePage.clickOnShowAllLaptopsAndNotebooks();
        laptopsAndNotebooksPage.productNameInAplhabeticalOrder("Price (High > Low)");
        laptopsAndNotebooksPage.clickOnMacBook();
        String expected = "MacBook";
        Assert.assertEquals(laptopsAndNotebooksPage.verifyMacBookText(), expected, "Error");
        macBookPage.addToCartButton();
        Thread.sleep(2000);
        String expected1 = "Success: You have added MacBook to your shopping cart!\n×";
        Assert.assertEquals(macBookPage.verifySuccessText(), expected1, "Error Message");
        macBookPage.clickOnShoppingCart();
        String expected2 = "Shopping Cart  (0.00kg)";
        Assert.assertEquals(macBookPage.verifyShoppingCartText1(), expected2, "Error Message");
        String expected3 = "MacBook";
        Assert.assertEquals(macBookPage.verifyMacBookText(), expected3, "Error Message");
        Thread.sleep(2000);
        macBookPage.updateQuantityOption();
        macBookPage.clickOnUpdateMacBookCart();
        String expected4 = "£737.45";
        Assert.assertEquals(macBookPage.verifyTotalPriceText(), expected4, "Error Message");
        macBookPage.clickOnCheckOutButton();
        Thread.sleep(2000);
        String expected5 = "Checkout";
        Assert.assertEquals(macBookCheckOutPage.verifyCheckOutText(), expected5, "Error Message");
        String expected6 = "New Customer";
        Assert.assertEquals(macBookCheckOutPage.VerifyNewCustomerText(), expected6, "Error Message");
        Thread.sleep(2000);
        macBookCheckOutPage.clickOnGuestCheckoutRadioButton();
        macBookCheckOutPage.clickOnContinueTabOnCheckOutPage();
        macBookCheckOutPage.enterFirstName("Mahak");
        macBookCheckOutPage.enterlastName("Agarwal");
        macBookCheckOutPage.enterEmail("mahak123@gmail.com");
        macBookCheckOutPage.enterPhoneNumber("07945889876");
        macBookCheckOutPage.enterAddress("123 Wayfair Street");
        macBookCheckOutPage.enterCity("Tokyo");
        macBookCheckOutPage.enterPostcode("WX1 2SX");
        Thread.sleep(2000);
        macBookCheckOutPage.inputState();
        macBookCheckOutPage.enterRegion("Aberdeen");
        macBookCheckOutPage.clickOnContinueTabOnCheckOutPage1();
        macBookCheckOutPage.addCommentsOnCheckOutPage("Successful");
        macBookCheckOutPage.clickOnTermsAndConditions();
        macBookCheckOutPage.clickOnContinueButtonPostCommentButton();
        Thread.sleep(2000);
        String expected7 = "Warning: Payment method required!\n×";
        Assert.assertEquals(macBookCheckOutPage.verifyPaymentMethodRequiredText(), expected7, "Error Message");

    }
}

