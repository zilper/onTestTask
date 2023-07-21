package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;

import java.util.logging.Logger;

public class SettingsPageStepDefinition {

    private static final Logger log = Logger.getLogger(SettingsPageStepDefinition.class.getName());
    PageFactoryManager instance = PageFactoryManager.getInstance();
    private static final long TIME = 90;

    @When("User opens timezone dropdown menu")
    public void userOpensTimezoneDropdownMenu() {
        instance.getSettingsPage().waitForPageLoadComplete(TIME);
        instance.getSettingsPage().clickTimezoneDropdownButton();
        log.info("Timezone dropdown is opened");
        instance.getSettingsPage().implicitWait(TIME);
    }

    @And("User clicks 'Apply' timezone preference")
    public void userClicksApplyTimezonePreference() {
        instance.getSettingsPage().waitForPageLoadComplete(TIME);
        instance.getSettingsPage().clickApplyTimezoneSettingsButton();
        log.info("'Apply' button was clicked");
    }

    @And("User selects timezone from dropdown")
    public void userSelectsTimezoneFromDropdown() {
        instance.getSettingsPage().waitForPageLoadComplete(TIME);
        instance.getSettingsPage().clickTimezoneFromList();
        log.info("Timezone was selected");
    }
}
