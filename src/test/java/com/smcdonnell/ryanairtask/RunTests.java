package com.smcdonnell.ryanairtask; /**
 * Created by ShaneMcD on 07/06/2015.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/com/smcdonnell/ryanairtask"},
       format={"pretty", "html:target/cucumber"})
public class RunTests {
}
