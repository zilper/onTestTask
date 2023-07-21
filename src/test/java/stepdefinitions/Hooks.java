package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class Hooks {

    WebDriver driver;

    PageFactoryManager pageFactoryManager;

    @Before
    public void testSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = PageFactoryManager.getInstance();
        pageFactoryManager.setDriver(driver);
    }

    @After
    public void tearDown() {driver.close();driver.quit();}

}
