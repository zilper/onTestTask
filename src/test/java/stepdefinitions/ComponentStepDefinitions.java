package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;

import java.util.logging.Logger;

public class ComponentStepDefinitions {

    private static final Logger log = Logger.getLogger(ComponentStepDefinitions.class.getName());
    PageFactoryManager instance = PageFactoryManager.getInstance();
    private static final long TIME = 90;

    @When("User opens sidebar menu")
    public void userOpensSidebarMenu() {
        instance.getHeaderComponent().waitForPageLoadComplete(TIME);
        instance.getHeaderComponent().clickSidebarMenuButton();
        log.info("Sidebar menu is opened");
    }

    @And("User clicks on 'Settings' button on Sidebar menu")
    public void userClicksOnSettingsButtonOnSidebarMenu() {
        instance.getSidebarComponent().waitForPageLoadComplete(TIME);
        instance.getSidebarComponent().clickSettingsButton();
        log.info("'Settings' button was clicked");
    }

}
