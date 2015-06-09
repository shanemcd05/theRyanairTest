package com.smcdonnell.ryanairtask;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by ShaneMcD on 01/06/2015.
 */
public class mainTest {

    WebDriver driver= new FirefoxDriver();


    @Given("I am on the Ryanair Search page")
    public void goToRyanairSearchPage()throws Throwable  {

        driver.navigate().to("https://www.bookryanair.com/SkySales/Booking.aspx?#Search");
        Assert.assertTrue("Title should start with Search",
                driver.getTitle().startsWith("Search"));

    }

   // @When("I search for flights")
   @When("^I search for flight \"(.*?)\" to \"(.*?)\"$")
    public void searchForFlight(String origin, String destination) throws Throwable {

        WebElement flightOrigin = driver.findElement(By.name("SearchInput$Orig"));
        assertTrue(flightOrigin.getText().startsWith("Origin"));


        WebElement dropDownOriginSelect = driver.findElement(By.name("SearchInput$Orig"));
        if (origin.equals("DUB")) {
            WebElement dropDownOriginOption = dropDownOriginSelect.findElement(
                    By.xpath("//.[@name='SearchInput$Orig']//*[contains(text(),'Dublin T1 (DUB)')]"));
            dropDownOriginOption.click();
        }

        if (destination.equals("STN")) {
            WebElement dropDownDestinationSelect = driver.findElement(By.name("SearchInput$Dest"));
            WebElement dropDownDestinationOption = dropDownDestinationSelect.findElement(
                    By.xpath("//.[@name='SearchInput$Dest']//*[contains(text(),'London (Stansted) (STN)')]"));
            dropDownDestinationOption.click();
        }
        WebElement departDateSelect = driver.findElement(By.name("SearchInput$DeptDate"));
        departDateSelect.click();
        String myDepartDateString = "30/06/2015";
        departDateSelect.clear();
        departDateSelect.sendKeys(myDepartDateString);


        WebElement returnDateSelect = driver.findElement(By.name("SearchInput$RetDate"));
        returnDateSelect.click();
        String myReturnDateString = "01/07/2015";
        returnDateSelect.clear();
        returnDateSelect.sendKeys(myReturnDateString);

        WebElement noOfAdults = driver.findElement(
                By.xpath(".//*[@id='SearchInput_PaxTypeADT']//*[.=2]"));
        noOfAdults.click();


        WebElement searchButton = driver.findElement(
                By.name("SearchInput$ButtonSubmit"));
        searchButton.click();


    }

    @When("I select my flights")
    public void flightSelection() throws Throwable {
        new WebDriverWait(driver, 10).until(
                ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='SelectInput_ButtonSubmit']")));

        Assert.assertTrue("Title should start with Select",
                driver.getTitle().startsWith("Select"));

        WebElement contButton = driver.findElement(
                By.xpath(".//*[@id='SelectInput_ButtonSubmit']"));
        contButton.click();

    }

    @When("I go to the Services Section and enter the passenger names")
    public void groupServicePassagerInformation() throws Throwable {

        new WebDriverWait(driver, 10).until(
                ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='GrpServices_ButtonSubmit']")));

        Assert.assertTrue("Title should start with Services",
                driver.getTitle().startsWith("Services"));

        WebElement firstDropDownTitleOption = driver.findElement(By.xpath("//.[@id='title_0']//*[.='Mr']"));
        firstDropDownTitleOption.click();

        WebElement firstPassengerNameTextField = driver.findElement(By.xpath(".//*[@id='firstname_0']"));
        firstPassengerNameTextField.click();
        String firstPassengerName = "Shane";
        firstPassengerNameTextField.clear();
        firstPassengerNameTextField.sendKeys(firstPassengerName);

        WebElement firstPassengerLastNameTextField = driver.findElement(By.xpath(".//*[@id='lastname_0']"));
        firstPassengerLastNameTextField.click();
        String firstPassengerLastName = "McDonnell";
        firstPassengerLastNameTextField.clear();
        firstPassengerLastNameTextField.sendKeys(firstPassengerLastName);

        WebElement secondDropDownTitleOption = driver.findElement(By.xpath("//.[@id='title_1']//*[.='Mrs']"));
        secondDropDownTitleOption.click();

        WebElement secondPassengerNameTextField = driver.findElement(By.xpath(".//*[@id='firstname_1']"));
        secondPassengerNameTextField.click();
        String secondPassengerName = "Mary";
        secondPassengerNameTextField.clear();
        secondPassengerNameTextField.sendKeys(secondPassengerName);

        WebElement secondPassengerlastNameTextField = driver.findElement(By.xpath(".//*[@id='lastname_1']"));
        secondPassengerlastNameTextField.click();
        String secondPassengerLastName = "McDonnell";
        secondPassengerlastNameTextField.clear();
        secondPassengerlastNameTextField.sendKeys(secondPassengerLastName);


    }

    @When("I reserve my seats")
    public void reserveSeats() throws Throwable {
        WebElement selectSeatsButton = driver.findElement(
                By.xpath(".//*[@id='seats']/div/button"));
        selectSeatsButton.click();


        new WebDriverWait(driver, 10).until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector(".Open>a")));

        WebElement seatSelect1 = driver.findElement(
                By.xpath(".//*[@class='aircraft rightpanel ng-scope']//*[@class='Open']//*"));
        seatSelect1.click();
        WebElement seatSelect2 = driver.findElement(
                By.xpath(".//*[@class='aircraft rightpanel ng-scope']//*[@class='Open']//*"));
        seatSelect2.click();


        WebElement secondSeatSelections = driver.findElement(
                By.xpath(".//*[@name='GrpServices$SeatMapInputServices$Seats_1_0']"));
        secondSeatSelections.click();


        WebElement seatSelect3 = driver.findElement(
                By.xpath(".//*[@class='aircraft rightpanel ng-scope']//*[@class='Open']//*"));
        seatSelect3.click();
        WebElement seatSelect4 = driver.findElement(
                By.xpath(".//*[@class='aircraft rightpanel ng-scope']//*[@class='Open']//*"));
        seatSelect4.click();



    }

    @Then("I verify the seat were selected")
    public void verifyAndBrowserClose() throws Throwable {

        WebElement seats = driver.findElement(
                By.xpath(".//*[@id='seats']/div/div[5]/table/tbody/tr[2]/td[1]/input"));

        assertTrue(seats.isDisplayed());

        //closing browser
        driver.quit();
    }

}

