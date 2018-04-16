//package test;
//
//import driver.WebDriverSingleton;
//import io.qameta.allure.*;
//import io.qameta.allure.junit4.DisplayName;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import web.models.UserModel;
//import web.page.DeletePage;
//import web.page.LoginPage;
//import web.services.UserCredential;
//
//public class TestDeleteCandidate {
//    DeletePage dc = new DeletePage();
//    LoginPage lp = new LoginPage();
//
//    @Before
//    public void login() {
//        UserCredential userCredential = new UserCredential();
//        UserModel user = userCredential.getUserCredentialByRole("admin");
//        runLoginPage(user);
//    }
//
//    private void runLoginPage(UserModel user) {
//        lp.enterLoginPage();
//        lp.typeUsername(user.getLogin());
//        lp.typePassword(user.getPassword());
//        lp.clickLoginButton();
//    }
//
//    @Test
//    @DisplayName("Удаление кандидата")
//    @Description("Удаление кандадита за главного рекрутера")
//    @Feature("Подбор и адаптация")
//    @Story("Сценарий 1 – Удаление существующего кандидата")
//    @Severity(SeverityLevel.BLOCKER)
//    public void deleteCandidate(){
//        dc.enterCandidatesPage();
//        dc.typeSearch("Петров");
//        dc.clickButtonSearch();
//        dc.clickCandidate();
//        dc.clickDelete();
//
//    }
//    @After
//    public void closeTest() {
//        WebDriverSingleton.destroyInstance();
//    }
//}
