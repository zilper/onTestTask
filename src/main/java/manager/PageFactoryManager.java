package manager;

import org.openqa.selenium.WebDriver;
import pageobjects.components.HeaderComponent;
import pageobjects.components.SidebarComponent;
import pageobjects.pages.HomePage;
import pageobjects.pages.SettingsPage;

public class PageFactoryManager {

    private static PageFactoryManager instance;

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public PageFactoryManager() {}

    public static PageFactoryManager getInstance() {

        if(instance==null) {
            instance = new PageFactoryManager();
        }
        return instance;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {return new HomePage(driver);}
    public SettingsPage getSettingsPage() {return new SettingsPage(driver);}
    public HeaderComponent getHeaderComponent() {return new HeaderComponent(driver);}
    public SidebarComponent getSidebarComponent() {return new SidebarComponent(driver);}

}
