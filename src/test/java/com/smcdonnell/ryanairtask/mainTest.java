package com.smcdonnell.ryanairtask;

import com.smcdonnell.ryanairtask.resources.pageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import static com.smcdonnell.ryanairtask.resources.pageObjects.*;
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
        PageFactory.initElements(driver, pageObjects.class);

    }

   // @When("I search for flights")
   @When("^I search for flight \"(.*?)\" to \"(.*?)\"$")
    public void searchForFlight(String origin, String destination) throws Throwable {

       //Check for correct location
        assertTrue(flightOrigin(driver).getText().startsWith("Origin"));

        WebElement dropDownOriginSelect = driver.findElement(By.name("SearchInput$Orig"));
        if (origin.equals("DUB")) {
            //dropDownOriginOption pageObject points to Dublin T1
            dropDownOriginOption(driver).click();
        }

        if (destination.equals("STN")) {
            WebElement dropDownDestinationSelect = driver.findElement(By.name("SearchInput$Dest"));
            //dropDownOriginOption pageObject points to London Stansted
            dropDownDestinationOption(driver).click();
        }
       //  departDateSelect pointing to SearchInput$DeptDate
        departDateSelect(driver).click();
        departDateSelect(driver).clear();
        departDateSelect(driver).sendKeys("30/07/2015");


      //  returnDateSelect pointing to SearchInput$RetDate
        returnDateSelect(driver).click();
        returnDateSelect(driver).clear();
        returnDateSelect(driver).sendKeys("01/08/2015");

     //  noOfAdults pointing to 2
        noOfAdults(driver).click();


      //  searchButton pointing to submit
        searchButton(driver).click();

    }

    @When("I select my flights")
    public void flightSelection() throws Throwable {
        new WebDriverWait(driver, 10).until(
                ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='SelectInput_ButtonSubmit']")));
    //Check on Select Page
        Assert.assertTrue("Title should start with Select",
                driver.getTitle().startsWith("Select"));
        //contButton pointing to ButtonSubmit
        contButton(driver).click();

    }

    @When("I go to the Services Section and enter the passenger names")
    public void groupServicePassagerInformation() throws Throwable {

        new WebDriverWait(driver, 10).until(
                ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='GrpServices_ButtonSubmit']")));
        //Check on the Services age
        Assert.assertTrue("Title should start with Services",
                driver.getTitle().startsWith("Services"));

        //firstDropDownTitleOption = Title Mr
        firstDropDownTitleOption(driver).click();

      //   firstPassengerNameTextField firstname_0
        firstPassengerNameTextField(driver).click();
       // String firstPassengerName = "Shane";
        firstPassengerNameTextField(driver).clear();
        firstPassengerNameTextField(driver).sendKeys("Shane");

      //  firstPassengerLastNameTextField = lastname_0
        firstPassengerLastNameTextField(driver).click();
        firstPassengerLastNameTextField(driver).clear();
        firstPassengerLastNameTextField(driver).sendKeys("McDonnell");

        // secondDropDownTitleOption = Mrs
        secondDropDownTitleOption(driver).click();

        // secondPassengerNameTextField = firstname_1
        secondPassengerNameTextField(driver).click();
        secondPassengerNameTextField(driver).clear();
        secondPassengerNameTextField(driver).sendKeys("Mary");

        // secondPassengerlastNameTextField = lastname_1
        secondPassengerlastNameTextField(driver).click();
        secondPassengerlastNameTextField(driver).clear();
        secondPassengerlastNameTextField(driver).sendKeys("McDonnell");


    }

    @When("I reserve my seats")
    public void reserveSeats() throws Throwable {
       //Open Seat Selection
        WebElement selectSeatsButton = driver.findElement(
                By.xpath(".//*[@id='seats']/div/button"));
        selectSeatsButton.click();

        //Check Seat Selection is Open
        new WebDriverWait(driver, 10).until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector(".Open>a")));


        //depart seatSelect = Open Seat
        seatSelect(driver).click();
        //Select next open seat
        seatSelect(driver).click();

        //Go to Second Seat Map
        WebElement secondSeatSelections = driver.findElement(
                By.xpath(".//*[@name='GrpServices$SeatMapInputServices$Seats_1_0']"));
        secondSeatSelections.click();


        //return seatSelect = Open Seat
        seatSelect(driver).click();
        //Select next open seat
        seatSelect(driver).click();

    }

    @Then("I verify the seat were selected")
    public void verifyAndBrowserClose() throws Throwable {

         //seats = input
        assertTrue(seats(driver) != null);

        //closing browser
        driver.quit();
    }

}

