//package test;
//
//import driver.WebDriverSingleton;
//import element.Element;
//import io.qameta.allure.*;
//import io.qameta.allure.junit4.DisplayName;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import web.models.UserModel;
//import web.page.CommentPage;
//import web.page.LoginPage;
//import web.services.UserCredential;
//
//public class TestComment {
//    LoginPage lp = new LoginPage();
//    CommentPage cp = new CommentPage();
//
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
//    @DisplayName("Комментарии")
//    @Description("Создание комментария")
//    @Feature("Кандидат")
//    @Story("Сценарий 1 – Создание комментария у имеющегося кандидата")
//    @Severity(SeverityLevel.TRIVIAL)
//    public void delete(){
//      cp.enterCandidatesPage();
//      cp.clickCheckboxNew();
//      cp.clickCheckboxMoving();
//      cp.enterCandidates();
//      cp.clickComment();
//      cp.typeComment("Коммуникабельный человек");
//      cp.clickSave();
//      cp.clickDelete();
//
//
//    }
//
//
//}
//
