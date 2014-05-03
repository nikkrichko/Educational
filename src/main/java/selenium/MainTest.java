package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.Identifiner.MainPage;

import java.util.concurrent.TimeUnit;

public class MainTest {
@Before
public void beforeTest(){

}

    @Test
    public void testdriver(){
        // create input elemts
//        String siteUrl =

        // expected values

        // create mock values

        // create test class

        // run test

        // validate results

        // other vlidates

    //    WebDriver driver = new FirefoxDriver();
    //    WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://metallocherepica.biz/");
        MainPage mainPage = new MainPage(driver);




    //    WebElement loginMainPage = driver.findElement(By.id("header")).findElement(By.linkText("LOGIN"));
        mainPage.getLoginMainPage().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    //    WebElement loginNameField = driver.findElement(By.xpath("html/body/div[5]/div[3]/div/div/div/div[2]/div[2]/div/div/form/input[1]"));

        mainPage.getLoginNameField().sendKeys("yjrrdk");

    //    WebElement passwordField = driver.findElement(By.xpath("html/body/div[5]/div[3]/div/div/div/div[2]/div[2]/div/div/form/input[2]"));
        mainPage.getPasswordField().sendKeys("yjrrdk");
    //    WebElement loginSubmit = driver.findElement(By.xpath("html/body/div[5]/div[3]/div/div/div/div[2]/div[2]/div/div/form"))
    //            .findElement(By.id("login"));
        mainPage.getLoginSubmit().click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    //    WebElement logout = driver.findElement(By.xpath("//a[@href='http://metallocherepica.biz/wp-login.php?action=logout&redirect_to=http%3A%2F%2Fmetallocherepica.biz&_wpnonce=9946a6ae96']"));
        mainPage.getLogout().click();



    }

    @Test
    public void testElementsOnMainPage(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://metallocherepica.biz/");

//        WebElement googlePlusIcon = driver.findElement(By.xpath("//a[contains(@href, 'https://plus.google.com/+Diy-krovlyaUa')]"));

        WebElement logoLinkMainPageFotter = driver.findElement(By.xpath("//footer[@id='footer']/div/div[3]/div/div/div/a/img"));



        logoLinkMainPageFotter.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement logoLinkMainPageTop = driver.findElement(By.xpath("//img[@alt='Металлочерепица']"));

        logoLinkMainPageTop.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.manage().timeouts().
        WebElement mainMenuLinkMainPage = driver.findElement(By.xpath("//li[@id='menu-item-1447']/a"));
        ExpectedConditions.visibilityOf(mainMenuLinkMainPage);
        mainMenuLinkMainPage.click();

    }

    @Test
    public void testMainMenu(){

        WebDriver driver = new FirefoxDriver();
        WebDriverWait waitDriver = new WebDriverWait(driver, 30);
        driver.get("http://metallocherepica.biz/");

        WebElement mainMenuLinkMainPage = driver.findElement(By.xpath("//li[@id='menu-item-1447']/a"));
        driver.manage().window().maximize();
        waitDriver.until(ExpectedConditions.visibilityOf(mainMenuLinkMainPage));

//        ExpectedConditions.visibilityOf(mainMenuLinkMainPage);
        mainMenuLinkMainPage.click();


    }
}