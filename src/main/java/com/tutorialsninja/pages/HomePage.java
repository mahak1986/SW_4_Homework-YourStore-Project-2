package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utility {

    By topMenu =(By.cssSelector(".collapse.navbar-collapse.navbar-ex1-collapse"));
    public String findAllTabsInTopMenu (){
        List<WebElement> searchResults = driver.findElements(topMenu);
        ArrayList<String> searchResult = new ArrayList<>();
        for (WebElement e : searchResults) {//e object of webElement
            searchResult.add(e.getText());
        }
        for (String result : searchResult) {
            System.out.println(result);
            return result;
        }
        return null;
    }

    By desktopTab = (By.xpath("//a[text()='Desktops']"));
    public void mouseHoverOnDesktopTab(){
        mouseHoverToElement(desktopTab);
    }
    By clickOnDesktopTab = (By.xpath("//a[text()='Desktops']"));
    public void clickOnDesktopTab(){
        clickOnElement(clickOnDesktopTab);
    }
    By clickOnShowAllDesktops = (By.xpath("//a[text()='Show AllDesktops']"));
    public void clickOnShowAllDesktops(){
        clickOnElement(clickOnShowAllDesktops);
    }
    By mouseHoverOnLaptopsAndNotebooksTab = (By.xpath("//a[text()='Laptops & Notebooks']"));
    public void mouseHoverOnLaptopsAndNotebooksTab(){

        mouseHoverToElement(mouseHoverOnLaptopsAndNotebooksTab);
    }
    By clickOnLaptopsAndNotebooksTab = (By.xpath("//a[text()='Laptops & Notebooks']"));
    public void clickOnLaptopsAndNotebooksTab(){
        clickOnElement(clickOnLaptopsAndNotebooksTab);
    }
    By clickOnShowAllLaptopsAndNotebooks = (By.xpath("//a[text()='Show AllLaptops & Notebooks']"));
    public void clickOnShowAllLaptopsAndNotebooks(){
        clickOnElement(clickOnShowAllLaptopsAndNotebooks);
    }

    By mouseHoverOnCurrencyDropDownAndClick = (By.xpath("//span[text()='Currency']"));
    public void mouseHoverOnCurrencyDropDownAndClick(){
        mouseHoverToElementAndClick(mouseHoverOnCurrencyDropDownAndClick);
    }

    By mouseHoverOnPoundSterlingAndClick= (By.xpath("//button[text()='£Pound Sterling']"));
    public void mouseHoverOnPoundSterlingAndClick(){

        mouseHoverToElementAndClick(
                mouseHoverOnPoundSterlingAndClick);
    }
    By mouseHoverOnComponents = (By.xpath("//a[text()='Components']"));
    public void mouseHoverOnComponents(){

        mouseHoverToElement(mouseHoverOnComponents);
    }
    By clickOnComponents = (By.xpath("//a[text()='Components']"));
    public void clickOnComponents(){

        clickOnElement(clickOnComponents);
    }
    By clickOnShowAllComponents = (By.xpath("//a[text()='Show AllComponents']"));
    public void clickOnShowAllComponents(){

        clickOnElement(clickOnShowAllComponents);
    }
    By verifyComponentsText = By.xpath("//h2[normalize-space()='Components']");

    public String verifyComponentsText() {
        return getTextFromElement(verifyComponentsText);
    }
}

