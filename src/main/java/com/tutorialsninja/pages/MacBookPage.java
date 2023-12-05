package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MacBookPage extends Utility {
    By addToCartButton = ((By.xpath("//button[@id='button-cart']")));
    public void addToCartButton(){
        clickOnElement(addToCartButton);
    }
    By verifySuccessText = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    public String verifySuccessText(){
        return getTextFromElement(verifySuccessText);
    }
    By clickOnShoppingCart = (By.xpath("//a[text()='shopping cart']"));
    public void clickOnShoppingCart(){
        clickOnElement(clickOnShoppingCart);
    }
    By verifyShoppingCartText1 = (By.xpath(("//h1[contains(text(),'Shopping Cart')]")));

    public String verifyShoppingCartText1() {
        return getTextFromElement(verifyShoppingCartText1);
    }

    By verifyMacBookText = By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");

    public String verifyMacBookText() {
        return getTextFromElement(verifyMacBookText);

    }

    //Change quantity to 2
    By quantityOption = (By.cssSelector("input[value='1']"));

    public void updateQuantityOption() {
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a");
        sendTextToElement(quantityOption, "2");
    }

    By updateMacBookCart = (By.xpath("//tr[1]//button[@data-original-title = 'Update']"));

    public void clickOnUpdateMacBookCart() {
        clickOnElement(updateMacBookCart);
    }

    By verifyTotalPriceText = (By.xpath("(//td[contains(text(),'£737.45')])[4]"));

    public String verifyTotalPriceText() {
        return getTextFromElement(verifyTotalPriceText);
    }
    By clickOnCheckOutButton = (By.xpath("//span[normalize-space()='Checkout']"));
    public void clickOnCheckOutButton(){
        clickOnElement(clickOnCheckOutButton);
    }
}


