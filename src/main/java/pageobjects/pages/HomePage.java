package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//a[@data-testid='3__match-calendar-link']")
    WebElement nextDayEventsButton;
    @FindBy(xpath = "//div[@data-index='0']/div[@class='yo Co' and contains(@id, '0-')]")
    WebElement firstEvent;
    @FindBy(xpath = "//button[@id='simpleCookieBarCloseButton']")
    WebElement cookiesButton;
    @FindBy(xpath = "//span[@id='score-or-time']")
    WebElement eventTime;
    @FindBy(xpath = "//span[@id='SEV__status']")
    WebElement eventDate;

    private static final String URL = "https://www.livescore.com/en/";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage() {
        driver.get(URL);
    }

    public void closeCookiesPopup() {
        cookiesButton.click();
    }

    public void clickNextDayEvents() {
        nextDayEventsButton.click();
    }

    public void clickOnFirstEvent() {
        firstEvent.click();
    }

    public String getEventTime() {
        return eventTime.getText();
    }

    public String getEventDate() {
        return eventDate.getText();
    }

}
