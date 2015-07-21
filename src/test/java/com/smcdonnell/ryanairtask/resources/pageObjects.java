package com.smcdonnell.ryanairtask.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


/**
 * Created by ShaneMcD on 18/07/2015.
 */
public class pageObjects {


    public static WebElement flightOrigin(WebDriver driver)
    {
        return driver.findElement(By.name("SearchInput$Orig"));
    }

    public static WebElement dropDownOriginOption(WebDriver driver)
    {
        return driver.findElement
                (By.xpath("//.[@name='SearchInput$Orig']//*[contains(text(),'Dublin T1 (DUB)')]"));
    }

    public static WebElement dropDownDestinationOption(WebDriver driver)
    {
        return driver.findElement
                (By.xpath("//.[@name='SearchInput$Dest']//*[contains(text(),'London (Stansted) (STN)')]"));
    }

    public static WebElement departDateSelect(WebDriver driver)
    {
        return driver.findElement(By.name("SearchInput$DeptDate"));
    }

    public static WebElement returnDateSelect(WebDriver driver)
    {
        return driver.findElement(By.name("SearchInput$RetDate"));
    }

    public static WebElement noOfAdults(WebDriver driver)
    {
        return driver.findElement( By.xpath(".//*[@id='SearchInput_PaxTypeADT']//*[.=2]"));
    }

    public static WebElement searchButton(WebDriver driver)
    {
        return driver.findElement( By.name("SearchInput$ButtonSubmit"));
    }

    public static WebElement contButton(WebDriver driver)
    {
        return driver.findElement(By.xpath(".//*[@id='SelectInput_ButtonSubmit']"));
    }

    public static WebElement firstDropDownTitleOption(WebDriver driver)
    {
        return driver.findElement(By.xpath("//.[@id='title_0']//*[.='Mr']"));
    }

    public static WebElement firstPassengerNameTextField(WebDriver driver)
    {
        return driver.findElement(By.xpath(".//*[@id='firstname_0']"));
    }

    public static WebElement firstPassengerLastNameTextField(WebDriver driver)
    {
        return driver.findElement(By.xpath(".//*[@id='lastname_0']"));
    }

    public static WebElement secondDropDownTitleOption(WebDriver driver)
    {
        return driver.findElement(By.xpath("//.[@id='title_1']//*[.='Mrs']"));
    }

    public static WebElement secondPassengerNameTextField(WebDriver driver)
    {
        return driver.findElement(By.xpath(".//*[@id='firstname_1']"));
    }

    public static WebElement secondPassengerlastNameTextField(WebDriver driver)
    {
        return driver.findElement(By.xpath(".//*[@id='lastname_1']"));
    }

    public static WebElement seatSelect(WebDriver driver)
    {
        return driver.findElement
                (By.xpath(".//*[@class='aircraft rightpanel ng-scope']//*[@class='Open']//*"));
    }

    public static WebElement seats(WebDriver driver)
    {
        return driver.findElement
               (By.xpath(".//*[@class='ng-binding'][contains(text(),'1 x Seat')]"));
    }
}
