package selenium.Identifiner;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    //Search elements
    public WebElement iconSearch = null;
    public WebElement searchField = null;
    public WebElement removeSearchField = null;
    public WebElement searchSubmit = null;

    //MainMenuElements
    public WebElement mainMenuDropDown;
    public WebElement mainMenuContacts;
    public WebElement mainMenuBlog;
    public WebElement mainMenuShopDropDown;
    public WebElement mainMenuShopDropRuukki;
    public WebElement mainMenuShopDropArcelor;
    public WebElement mainMenuShopDropUSS;
    public WebElement mainMenuShopDropMIP;
    public WebElement mainMenuShopDropChina;
    public WebElement mainMenuAboutCompanyDropDown;
    public WebElement mainMenuOurTeam;
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
//TO DO
    public WebElement getMainMenuDropDown() {
        mainMenuDropDown = driver
                .findElement(By.className("zn_menu_trigger"))
                .findElement(By.xpath("//a[contains(text(),'Menu')]"));
        return mainMenuDropDown;
    }

    public WebElement getMainMenuContacts() {

        mainMenuContacts = driver
                .findElement(By.id("menu-moe-menyu"))
                .findElement(By.id("menu-item-1446"))
                .findElement(By.xpath("//a[contains(text(),'Контакты')]"));
        waitInvisibleElementInMainMenu(mainMenuContacts);
        return mainMenuContacts;
    }

    public WebElement getMainMenuBlog() {
        mainMenuBlog = driver
                .findElement(By.id("menu-moe-menyu"))
                .findElement(By.id("menu-item-1449"))
                .findElement(By.xpath("//a[contains(text(),'Блог')]"));
        waitInvisibleElementInMainMenu(mainMenuBlog);
        return mainMenuBlog;
    }

    public WebElement getMainMenuShopDropDown() {
        mainMenuShopDropDown = driver
                .findElement(By.id("menu-moe-menyu"))
                .findElement(By.id("menu-item-1452"))
                .findElement(By.className("sf-with-ul"));
        waitInvisibleElementInMainMenu(mainMenuShopDropDown);
        return mainMenuShopDropDown;
    }

    public WebElement getMainMenuShopDropRuukki() {
        mainMenuShopDropRuukki = driver
                .findElement(By.id("menu-moe-menyu"))
                .findElement(By.id("menu-item-1452"))
                .findElement(By.className("sub-menu"))
                .findElement(By.id("menu-item-1671"))
                .findElement(By.xpath("//a[contains(text(),'Ruukki')]"));
        waitInvisibleElementsInShopDropDown(mainMenuShopDropRuukki);
        return mainMenuShopDropRuukki;
    }

    public WebElement getMainMenuShopDropArcelor() {
        mainMenuShopDropArcelor = driver
                .findElement(By.id("menu-moe-menyu"))
                .findElement(By.id("menu-item-1452"))
                .findElement(By.className("sub-menu"))
                .findElement(By.id("menu-item-1670"))
                .findElement(By.xpath("//a[contains(text(),'Arcelor')]"));
        waitInvisibleElementsInShopDropDown(mainMenuShopDropArcelor);
        return mainMenuShopDropArcelor;
    }

    public WebElement getMainMenuShopDropUSS() {
        mainMenuShopDropUSS = driver
                .findElement(By.id("menu-moe-menyu"))
                .findElement(By.id("menu-item-1452"))
                .findElement(By.className("sub-menu"))
                .findElement(By.id("menu-item-1702"))
                .findElement(By.xpath("//a[contains(text(),'USS')]"));
        waitInvisibleElementsInShopDropDown(mainMenuShopDropUSS);
        return mainMenuShopDropUSS;
    }

    public WebElement getMainMenuShopDropMIP() {
        mainMenuShopDropMIP = driver
                .findElement(By.id("menu-moe-menyu"))
                .findElement(By.id("menu-item-1452"))
                .findElement(By.className("sub-menu"))
                .findElement(By.id("menu-item-1704"))
                .findElement(By.xpath("//a[contains(text(),'МиП')]"));
        waitInvisibleElementsInShopDropDown(mainMenuShopDropMIP);
        return mainMenuShopDropMIP;
    }

    public WebElement getMainMenuShopDropChina() {
        mainMenuShopDropChina = driver
                .findElement(By.id("menu-moe-menyu"))
                .findElement(By.id("menu-item-1452"))
                .findElement(By.className("sub-menu"))
                .findElement(By.id("menu-item-1703"))
                .findElement(By.xpath("//a[contains(text(),'Китай')]"));
        waitInvisibleElementsInShopDropDown(mainMenuShopDropChina);
        return mainMenuShopDropChina;
    }

    public WebElement getMainMenuAboutCompanyDropDown() {
        mainMenuAboutCompanyDropDown = driver
                .findElement(By.id("menu-moe-menyu"))
                .findElement(By.id("menu-item-1450"))
                .findElement(By.className("sf-with-ul"));
        waitInvisibleElementInMainMenu(mainMenuAboutCompanyDropDown);
        return mainMenuAboutCompanyDropDown;
    }

    public WebElement getMainMenuOurTeam() {
        mainMenuOurTeam = driver
                .findElement(By.id("menu-moe-menyu"))
                .findElement(By.id("menu-item-1450"))
                .findElement(By.className("sub-menu"))
                .findElement(By.id("menu-item-1445"))
                .findElement(By.xpath("//a[contains(text(),'команда')]"));
        if (mainMenuOurTeam.isDisplayed() == false){
            new Actions(driver).moveToElement(getMainMenuAboutCompanyDropDown()).perform();
        }
        return mainMenuOurTeam;
    }

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


// helper
    private void waitInvisibleElementsInShopDropDown(WebElement webElement){
        waitInvisibleElementInMainMenu(getMainMenuShopDropDown());
        if (webElement.isDisplayed() == false){
            new Actions(driver).moveToElement(getMainMenuShopDropDown()).perform();
            new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(webElement));
        }
    }

    private void waitInvisibleElementInMainMenu(WebElement webElement){
        if(webElement.isDisplayed() == false) {
            getMainMenuDropDown().click();
            new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(webElement));
        }
    }

}
