package pageobjects.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.pages.BasePage;

public class SidebarComponent extends BasePage {
    @FindBy(xpath = "//a[@id='burger-menu__settings']")
    WebElement settingsButton;

    public SidebarComponent(WebDriver driver) {
        super(driver);
    }

    public void clickSettingsButton() {
        settingsButton.click();
    }
}
