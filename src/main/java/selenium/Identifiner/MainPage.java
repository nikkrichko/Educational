package selenium.Identifiner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    public WebDriver driver;
    public WebElement loginMainPage;
    public WebElement loginNameField;
    public WebElement passwordField;
    public WebElement loginSubmit;
    public WebElement logout;

    public MainPage(WebDriver webdriver){
        this.driver = webdriver;


    }

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

    public WebElement getLogout(){
      return logout = driver.findElement(By.xpath("//a[@href='http://metallocherepica.biz/wp-login.php?action=logout&redirect_to=http%3A%2F%2Fmetallocherepica.biz&_wpnonce=9946a6ae96']"));
    }



}
