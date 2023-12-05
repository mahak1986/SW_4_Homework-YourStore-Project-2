package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HPLP3065CheckOutPage;
import com.tutorialsninja.pages.HPLP3065Page;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DesktopsTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    HPLP3065Page hplp3065Page = new HPLP3065Page();
    HPLP3065CheckOutPage hplp3065CheckOutPage = new HPLP3065CheckOutPage();


    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        homePage.mouseHoverOnDesktopTab();
        homePage.clickOnDesktopTab();
        homePage.clickOnShowAllDesktops();
        desktopsPage.productNameInAplhabeticalOrder("Name: Z to A");
        // Storing jackets names in list
        List<WebElement> desktopsNames = driver.findElements(By.xpath("//option[@value='https://tutorialsninja.com/demo/index.php?route=product/category&path=20&sort=pd.name&order=DESC']"));
        List<String> desktopsNameListBefore = new ArrayList<>();
        for (WebElement names : desktopsNames) {
            desktopsNameListBefore.add(names.getText());
            System.out.println(names.getText());
        }
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        homePage.mouseHoverOnCurrencyDropDownAndClick();
        homePage.mouseHoverOnPoundSterlingAndClick();
        homePage.mouseHoverOnDesktopTab();
        homePage.clickOnShowAllDesktops();
        desktopsPage.clickOnSortByTab();
        desktopsPage.productNameAToZ("Name (A - Z)");
        desktopsPage.clickOnHp3056Product();
        String expected3 = "HP LP3065";
        Assert.assertEquals(desktopsPage.verifyHp3056ProductText(), expected3, "Error Message");
        String year = "2027";
        String month = "November";
        String date = "23";
        clickOnElement(By.xpath("//span[@class = 'input-group-btn']//button[@class = 'btn btn-default']")); // open the calendar
        while (true) {
            //inspect April 2021
            String monthYear = getTextFromElement(By.xpath("//div[@class = 'datepicker-days']//th[@class = 'picker-switch']"));
            System.out.println(monthYear);
            String[] a = monthYear.split(" ");
            String mon = a[0];
            String yer = a[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker-days']//th[@class = 'next']"));
            }
        }
        // Select the date
        List<WebElement> allDates = driver.findElements(By.xpath("//tbody/tr/td"));
        for (WebElement dt : allDates) {
            if (dt.getText().equalsIgnoreCase(date)) {
                dt.click();
                break;
            }
        }
        hplp3065Page.clickOnAddToCartButton();
        String expected4 = "Success: You have added HP LP3065 to your shopping cart!";
        Assert.assertEquals(hplp3065Page.verifyProductHPLP3065ToYourShoppingCart(),expected4,"Error Message");
        hplp3065Page.clickOnShoppingLink();
        String expected5 = "HP LP3065";
        Assert.assertEquals(hplp3065CheckOutPage.verifyHPLP3065ProductNameOnCheckOutPage(),expected5,"Error Message");
        String expected6 = "2027-11-23";
        Assert.assertEquals(hplp3065CheckOutPage.verifyDeliveryDate(),expected6,"Error Message");
        String expected7 = "Product21";
        Assert.assertEquals(hplp3065CheckOutPage.verifyByModel21(),expected7,"Error Message");
        String expected8 = "£74.73";
        Assert.assertEquals(hplp3065CheckOutPage.verifyTotalPrice(),expected8,"Error Message");

    }


}




