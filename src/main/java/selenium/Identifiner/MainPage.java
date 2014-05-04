package selenium.Identifiner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    //initial driver
    public WebDriver driver;

    //initial loginForm
    public WebElement loginMainPage;
    public WebElement loginNameField;
    public WebElement passwordField;
    public WebElement loginSubmit;
    public WebElement rememberMe;
    public WebElement logout;

    //initial linkOnMainPage
    public WebElement mainMenuLinkMainPage = null;
    public WebElement logoLinkMainPageFotter = null;
    public WebElement logoLinkMainPageTop = null;

    //MainMenuElements
    public WebElement iconSearch = null;
    public WebElement searchField = null;
    public WebElement removeSearchField = null;
    public WebElement searchSubmit = null;
//    public WebElement ;
//    public WebElement ;
//    public WebElement ;
//    public WebElement ;
//    public WebElement ;
//    public WebElement ;
//    public WebElement ;



    public WebElement iconGooglePlus;
    public WebElement iconFaceBook;
    public WebElement iconTwitter;
    public WebElement iconVkontakte;







// CONSTRUCTOR
    public MainPage(WebDriver webdriver){
        this.driver = webdriver;
    }


// WEBELEMENTS
    //LOGIN FORM
    public WebElement getLoginMainPage(){
        return loginMainPage = driver.findElement(By.id("header")).findElement(By.linkText("LOGIN"));
    }

    public WebElement getLoginNameField(){
        return loginNameField = driver.findElement(By.xpath("html/body/div[5]/div[3]/div/div/div/div[2]/div[2]/div/div/form/input[1]"));
    }

    public WebElement getPasswordField(){
        return passwordField = driver.findElement(By.xpath("html/body/div[5]/div[3]/div/div/div/div[2]/div[2]/div/div/form/input[2]"));
    }

    public WebElement getLoginSubmit(){
        return loginSubmit = driver.findElement(By.xpath("html/body/div[5]/div[3]/div/div/div/div[2]/div[2]/div/div/form"))
                .findElement(By.id("login"));
    }

    public WebElement getRememberMe() {

        return rememberMe = driver.findElement(By
                .xpath("//div[2]/div/div/form/label/input"));
    }

    public WebElement getLogout(){
      return logout = driver
              .findElement(By.xpath("//a[contains(text(),'LOGOUT')]"));
    }




    //MAINPAGE LINK
    public WebElement getMainMenuLinkMainPage() {

        if (mainMenuLinkMainPage == null) {
            driver.manage().window().maximize();
            mainMenuLinkMainPage = driver.findElement(By.xpath("//li[@id='menu-item-1447']/a"));
        }
        return mainMenuLinkMainPage;
    }
    public WebElement getLogoLinkMainPageFotter() {
        if (logoLinkMainPageFotter == null) {
            logoLinkMainPageFotter = driver.findElement(By.xpath("//footer[@id='footer']/div/div[3]/div/div/div/a/img"));
        }
        return logoLinkMainPageFotter;
    }
    public WebElement getLogoLinkMainPageTop() {
        if (logoLinkMainPageTop == null) {
            logoLinkMainPageTop = driver.findElement(By.xpath("//img[@alt='Металлочерепица']"));
        }
        return logoLinkMainPageTop;
    }



    //MAINMENU ELEMENTS

    //Search ELEMENTS
    public WebElement getIconSearch() {
//        if (iconSearch == null){
//            iconSearch = driver.findElement(By.className("searchBtn"));
//        }
        return iconSearch = driver.findElement(By.className("searchBtn"));
    }

    public WebElement getSearchField() {
//        if (searchField == null){
//            searchField = driver.findElement(By.id("searchform")).findElement(By.className("inputbox"));
//        }
//        if(searchField.isDisplayed() == false)iconSearch.click();
        return searchField = driver.findElement(By.id("searchform")).findElement(By.className("inputbox"));
    }

    public WebElement getSearchSubmit() {
//        if (searchSubmit == null) {
//            searchSubmit = driver.findElement(By.id("searchform")).findElement(By.id("searchsubmit"));
//        }
        return searchSubmit = driver.findElement(By.id("searchform")).findElement(By.id("searchsubmit"));
    }

    public WebElement getRemoveSearchField() {
        try {
            if (removeSearchField == null) {
                removeSearchField = driver.findElement(By.className("icon-remove"));
            }
        } catch (NoSuchElementException e){
            getIconSearch().click();
            getRemoveSearchField();
        }



//        if(removeSearchField.isDisplayed() == false)iconSearch.click();
        return removeSearchField;
    }


    //SOCIAL ICONS
    public WebElement getIconGooglePlus() {
        if (iconGooglePlus == null) {
            iconGooglePlus = driver.findElement(By.className("social-gplus"))
                    .findElement(By.xpath("//a[contains(@href, 'https://plus.google.com/+Diy-krovlyaUa')]"));
        }
        return iconGooglePlus;
    }

    public WebElement getIconFaceBook() {
        if (iconFaceBook == null) {
            iconFaceBook = driver.findElement(By.className("social-facebook"))
                    .findElement(By.xpath("//a[contains(@href, 'https://www.facebook.com/metallocherepica.biz')]"));
        }
        return iconFaceBook;
    }

    public WebElement getIconTwitter() {
        if (iconTwitter == null) {
            iconTwitter = driver.findElement(By.className("social-gplus"))
                    .findElement(By.xpath("//a[contains(@href, 'https://twitter.com/vpolishko')]"));
        }
        return iconTwitter;
    }

    public WebElement getIconVkontakte() {
        if (iconVkontakte == null) {
            iconVkontakte = driver
                    .findElement(By.xpath("//a[@href='http://vk.com/metallocherepicabiz']"));
        }
        return iconVkontakte;
    }


}
