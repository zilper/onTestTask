package stepdefinitions;

import cache.CacheKey;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.assertj.core.data.Index;
import org.junit.Assert;
import unils.SoftAssertUtil;

import java.util.logging.Logger;

public class HomePageStepDefinitions {

    private static final Logger log = Logger.getLogger(HomePageStepDefinitions.class.getName());
    PageFactoryManager instance = PageFactoryManager.getInstance();
    private static final long TIME = 90;

    @Given("User opens home page")
    public void userOpensHomePage() {
        instance.getHomePage();
        instance.getHomePage().openHomePage();
        log.info("Home Page is opened");
        instance.getHomePage().implicitWait(TIME);
        instance.getHomePage().closeCookiesPopup();
        log.info("Cookies popup was closed");
        instance.getHomePage().implicitWait(TIME);
    }

    @When("User clicks on first not started event")
    public void userClicksOnFirstNotStartedEvent() {
        instance.getHomePage();
        instance.getHomePage().implicitWait(TIME);
        instance.getHomePage().waitForPageLoadComplete(TIME);
        instance.getHomePage().clickNextDayEvents();
        instance.getHomePage().waitForPageLoadComplete(TIME);
        instance.getHomePage().implicitWait(120);
        instance.getHomePage().clickOnFirstEvent();
        log.info("Event Page is opened");
        instance.getHomePage().implicitWait(TIME);
    }

    @Then("User sees start time and date of opened event")
    public void userSeesStartTimeAndDateOfOpenedEvent() {
        instance.getHomePage();
        instance.getHomePage().waitForPageLoadComplete(TIME);
        String time = instance.getHomePage().getEventTime();
        instance.getHomePage().waitForPageLoadComplete(TIME);
        String date = instance.getHomePage().getEventDate();
        CacheKey.putData(CacheKey.EVENT_TIME, time);
        log.info("Time was saved to cache");
        CacheKey.putData(CacheKey.EVENT_DATE, date);
        log.info("Date was saved to cache");
    }

    @Then("User sees start time and date have been changed")
    public void userSeesStartTimeAndDateHaveBeenChanged() {
        instance.getHomePage();
        instance.getHomePage().waitForPageLoadComplete(TIME);
        String actualTime = instance.getHomePage().getEventTime();
        instance.getHomePage().waitForPageLoadComplete(TIME);
        String actualDate = instance.getHomePage().getEventDate();
        Object time = CacheKey.getData(CacheKey.EVENT_TIME);
        Object date = CacheKey.getData(CacheKey.EVENT_DATE);
        SoftAssertUtil.assertNotEquals(actualTime,time,"Time was changed");
        if(Integer.parseInt(actualTime.split(":")[0]) < Integer.parseInt(time.toString().split(":")[0])) {
            SoftAssertUtil.assertNotEquals(actualDate, date, "Date was changed changed");
        }
        SoftAssertUtil.asserAll();
    }
}
