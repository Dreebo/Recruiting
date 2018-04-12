package test;

import driver.WebDriverSingleton;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
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
       @DisplayName("Редактирование кандидата")
       @Description("Редактирование кандидата за главного рекрутера")
       @Feature("Кандидат")
       @Story("Сценарий 1 – Изменение полей существующего кандидата")
       @Severity(SeverityLevel.BLOCKER)
       public void editApplicationTest(){
           ap.enterEditApplicationPage();
           ap.Candidate();
           ap.clickEdit();
           ap.moveCountry();
           ap.typeCountry("Россия");
           ap.clickAddPhone();
           ap.typeNumber("375298764534");
           ap.clickSave();

    }

    @Test
    @DisplayName("Редактирование кандидата")
    @Description("Редактирование кандидата за главного рекрутера")
    @Feature("Кандидат")
    @Story("Сценарий 2 – Изменение года рождения на неккоректное значение")
    @Severity(SeverityLevel.TRIVIAL)
    public void editBirthdayTest(){
        ap.enterEditApplicationPage();
        ap.Candidate();
        ap.clickEdit();
        ap.moveCountry();
        ap.typeCountry("Россия");
        ap.clickAddPhone();
        ap.typeNumber("375298764534");
        ap.typeBirthday("1800");
        ap.clickSave();

    }

    @After
    public void closeTest() {
        WebDriverSingleton.destroyInstance();
    }

}
