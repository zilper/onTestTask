package pageobjects.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.pages.BasePage;

public class HeaderComponent extends BasePage {

    @FindBy(xpath = "//span[@id='burger-menu-open']")
    WebElement sidebarMenuButton;

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public void clickSidebarMenuButton() {
        sidebarMenuButton.click();
    }
}
