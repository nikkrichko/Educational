package selenium.Identifiner;

import org.openqa.selenium.WebDriver;

public class Functions {
    public static WebDriver driver;
    public static MainPage mainPage;

    public Functions(WebDriver driver, MainPage mainPage) {
        this.mainPage = mainPage;
        this.driver = driver;
    }

    public static void searchElement(String element){

        mainPage.getIconSearch().click();
        mainPage.getSearchField().sendKeys(element);
        mainPage.getSearchSubmit().click();
    }
}
