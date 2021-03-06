package selenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.Identifiner.Functions;
import selenium.Identifiner.MainPage;

import java.util.concurrent.TimeUnit;

public class MainTest {
    static WebDriver driver;
    static String baseURL;
    static MainPage mainPage;
    static Functions functions;
    private String[] elementsForSearch = {"hello world","Ruukki", "RUUKKI", "блог", "о компании",
            "наша команда", "arcelor", "uss", "мип", "китай", "мир"};

    @BeforeClass
public static void beforeTest(){
    driver = new FirefoxDriver();
    baseURL = "http://metallocherepica.biz/";
    mainPage = new MainPage(driver);
    functions = new Functions(driver, mainPage);
    driver.get(baseURL);



}

    @Test
    public void testLogin(){
        // create input elemts
//        String siteUrl =

        // expected values

        // create mock values

        // create test class

        // run test

        // validate results

        // other vlidates



        mainPage.getLoginMainPage().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        mainPage.getLoginNameField().sendKeys("yjrrdk");
        mainPage.getPasswordField().sendKeys("yjrrdk");
        mainPage.getLoginSubmit().click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


    @Test
    public void testLogout(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.getLogout().click();
    }

    @Test
    public void testLoginWithRemember(){
        mainPage.getLoginMainPage().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        mainPage.getLoginNameField().sendKeys("yjrrdk");
        mainPage.getPasswordField().sendKeys("yjrrdk");
        mainPage.getRememberMe().click();
        mainPage.getLoginSubmit().click();
    }

    @Test
    public void testSocialIconGooglePlus(){
        mainPage.getIconGooglePlus().click();
        mainPage.getIconFaceBook().click();
        mainPage.getIconTwitter().click();
        mainPage.getIconVkontakte().click();
    }

    @Test
    public void testSearchIconForm(){

        mainPage.getIconSearch().click();
        mainPage.getRemoveSearchField().click();
    }

    @Test
    public void testSearchElement(){
        for(String i: elementsForSearch) {
            try {
                functions.searchElement(i);
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                driver.findElement(By.className("itemList")).findElement(By.className("itemTitle"));

            } catch (NoSuchElementException e){
                System.out.println("************************************");
                System.out.println();
                System.out.println(i + " " + e.getMessage() );
                System.out.println();
                System.out.println("************************************");
            } catch (ElementNotVisibleException e){
                System.out.println("************************************");
                System.out.println();
                System.out.println(i + " " + e.getMessage() );
                System.out.println();
                System.out.println("************************************");
            }
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }
    }

    @Test
    public void testMainMenuElements(){
        WebDriverWait webDriverWait = new WebDriverWait(driver, 3);

//        Dimension dimension = new org.openqa.selenium.Dimension(1600, 480);
//        driver.manage().window().setSize(dimension);
//        webDriverWait.withTimeout(5, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//        mainPage.getMainMenuDropDown().click();
        mainPage.getMainMenuOurTeam().click();
        mainPage.getMainMenuAboutCompanyDropDown().click();
//        new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Купить металлочерепицу, актуальные цены"));
    }

    @Test
    public void testShopDropDownMenu(){
        new Actions(driver).moveToElement(mainPage.getMainMenuShopDropDown()).perform();
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(mainPage.getMainMenuShopDropDown()));
    }

    @Test
    public void testGoONMenuShop(){
        mainPage.getMainMenuShopDropDown().click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Купить металлочерепицу, актуальные цены"));
    }

    @Test
    public void testForAboutCOmpany(){
        mainPage.getMainMenuOurTeam().click();
        mainPage.getMainMenuAboutCompanyDropDown().click();
    }

    @AfterClass
    public static void afterClass(){
        driver.quit();
    }





}