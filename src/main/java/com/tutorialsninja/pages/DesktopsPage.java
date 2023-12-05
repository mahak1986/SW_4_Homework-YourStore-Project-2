package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {
    By verifyDesktopsText = By.xpath("//h2[normalize-space()='Desktops']");

    public String verifyDesktopTextOnDesktopPage() {
        return getTextFromElement(verifyDesktopsText);
    }

    By productNameInAplhabeticalOrder = By.id("input-sort");

    public void productNameInAplhabeticalOrder(String name) {
        selectByVisibleText(productNameInAplhabeticalOrder, name);

    }

    public boolean verifyProductsInAlphabeticalOrder() {
        // Find the elements representing the product prices
        List<WebElement> productElements = driver.findElements(By.id("input-sort"));

        // Get the prices and store them in an array or list
        List<String> products = new ArrayList<>();
        for (WebElement element : productElements) {
            String products1 = element.getText();
        }
        // Verify if the prices are sorted in ascending order
        List<String> sortedProducts = new ArrayList<>(products);
        Collections.sort(sortedProducts);
        return products.equals(sortedProducts);
    }
    By clickOnSortByTab = (By.xpath("//select[@id='input-sort']"));
    public void clickOnSortByTab(){
        clickOnElement(clickOnSortByTab);
    }
    By productNameAToZ = (By.xpath("//select[@id='input-sort']"));
    public void productNameAToZ(String name) {

        selectByVisibleText(productNameAToZ, name);
    }
    By clickOnHp3056Product = (By.xpath("//a[text()='HP LP3065']"));
    public void clickOnHp3056Product(){
        clickOnElement(clickOnHp3056Product);
    }
    By verifyHp3056ProductText = By.xpath("//a[normalize-space()='HP LP3065']");
    public String verifyHp3056ProductText() {
        return getTextFromElement(verifyHp3056ProductText);
    }
}
