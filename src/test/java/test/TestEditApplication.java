package test;

import driver.WebDriverSingleton;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import web.models.UserModel;
import web.page.EditApplicationPage;
import web.page.LoginPage;
import web.services.UserCredential;

public class TestEditApplication {
       EditApplicationPage ap = new EditApplicationPage();
       LoginPage lp = new LoginPage();

    @Before
    public void login() {
        UserCredential userCredential = new UserCredential();
        UserModel user = userCredential.getUserCredentialByRole("admin");
        runLoginPage(user);
    }

    private void runLoginPage(UserModel user) {
        lp.enterLoginPage();
        lp.typeUsername(user.getLogin());
        lp.typePassword(user.getPassword());
        lp.clickLoginButton();
    }

       @Test
       public void editApplicationTest(){
           ap.enterEditApplicationPage();
           ap.clickCandidate();
           ap.clickEdit();
           ap.moveCountry();
           ap.typeCountry("Россия");
           ap.clickAddPhone();
           ap.typeNumber("375298764534");
           ap.clickSave();
//assert
    }

    @After
    public void closeTest() {
        WebDriverSingleton.destroyInstance();
    }

}
