package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends BasePage {

    @FindBy(xpath = "//label[@for='TZ_SELECT-checkbox']")
    WebElement timezoneDropdownButton;

    @FindBy(xpath = "//div[contains(text(),'+09:00')]")
    WebElement timezoneDropdownTemplate;

    @FindBy(xpath = "//button[@data-testid='settings-form_apply-button']")
    WebElement applyTimezoneSettingsButton;

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    public void clickTimezoneDropdownButton() {
        timezoneDropdownButton.click();
    }

    public void clickTimezoneFromList() {
        timezoneDropdownTemplate.click();
    }

    public void clickApplyTimezoneSettingsButton() {
        applyTimezoneSettingsButton.click();
    }
}
