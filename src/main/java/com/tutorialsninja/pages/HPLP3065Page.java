package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class HPLP3065Page extends Utility {
    By verifyHp3056ProductText = By.xpath("//a[normalize-space()='HP LP3065']");
    public String verifyHp3056ProductText() {

        return getTextFromElement(verifyHp3056ProductText);
    }
    By clickOnAddToCartButton = (By.xpath("//button[@id='button-cart']"));
    public void clickOnAddToCartButton(){
        clickOnElement(clickOnAddToCartButton);
    }
    By verifyProductHPLP3065ToYourShoppingCart = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    public String verifyProductHPLP3065ToYourShoppingCart() {
        return getTextFromElement(verifyProductHPLP3065ToYourShoppingCart);
    }
    By clickOnShoppingLink = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    public void clickOnShoppingLink() {
        clickOnElement(clickOnShoppingLink);
    }
}
