package web.page;

import driver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import web.element.LoginElement;

public class LoginPage {

    WebDriver driver = WebDriverSingleton.getInstance();

    public void enterLoginPage(){
        driver.get(LoginElement.URL);
    }

    public void typeUsername(String username){
        LoginElement.USERNAME.type(username) ;

    }

    public void typePassword(String password){
        LoginElement.PASSWORD.type(password);

    }

    public void clickLoginButton(){
        LoginElement.LOGIN_BUTTON.click();
    }
}
