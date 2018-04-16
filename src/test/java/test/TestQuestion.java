package test;

import driver.WebDriverSingleton;
import element.Element;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import web.models.UserModel;
import web.page.LoginPage;
import web.page.QuestionPage;
import web.services.UserCredential;

public class TestQuestion {
    private WebDriver driver = WebDriverSingleton.getInstance();
    QuestionPage qp = new QuestionPage();
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
    @DisplayName("Создание персонального вопроса")
    @Description("Создание вопроса")
    @Feature("Вопросы")
    @Story("Сценарий 1– Заполнение всех обязательных полей")
    @Severity(SeverityLevel.BLOCKER)
    public void addQuestion() {
        qp.enterQuestionPage();
        qp.clickAddQuestion();
        qp.typeQuestion("Какие офисные программы вы знаете?");
        qp.typeCompetence("MS Word");
        qp.clickSave();
        Element message = new Element("Выполнено! Вопрос успешно сохранен", By.xpath("//*[@id=\"successMessage\"]"));
        Assert.assertTrue(message.isElementPresent());
    }

    @Test
    @DisplayName("Создание персонального вопроса")
    @Description("Создание негативного вопроса")
    @Feature("Вопросы")
    @Story("Сценарий 2 – Сохранение вопроса без заполнения обязательных полей")
    @Severity(SeverityLevel.BLOCKER)
    public void addQuestionEmpty() {
        qp.enterQuestionPage();
        qp.clickAddQuestion();
        qp.clickSave();
        Element errorMessage = new Element("Ошибка!Выберите хотя бы одну обязательную компетенцию", By.xpath("//*[@id=\"errorMessage\"]"));
        Assert.assertTrue(errorMessage.isElementPresent());
    }

    @Test
    @DisplayName("Создание персонального вопроса")
    @Description("Создание негативного вопроса")
    @Feature("Вопросы")
    @Story("Сценарий 3 – Сохранение вопроса без компетенции")
    @Severity(SeverityLevel.BLOCKER)
    public void addQuestionNoCompetence() {
        qp.enterQuestionPage();
        qp.clickAddQuestion();
        qp.typeQuestion("Какие офисные программы вы знаете?");
        qp.clickSave();
        Element errorMessage = new Element("Ошибка!Выберите хотя бы одну обязательную компетенцию", By.xpath("//*[@id=\"errorMessage\"]"));
        Assert.assertTrue(errorMessage.isElementPresent());
    }

    @Test
    @DisplayName("Создание персонального вопроса")
    @Description("Создание негативного вопроса")
    @Feature("Вопросы")
    @Story("Сценарий 4 – Сохранение вопроса без заполнения поля 'Вопрос'")
    @Severity(SeverityLevel.BLOCKER)
    public void addQuestionNoQuestion() {
        qp.enterQuestionPage();
        qp.clickAddQuestion();
        qp.typeCompetence("MS Word");
        qp.clickSave();
        Element errorMessage = new Element("Ошибка!Заполните обязательные поля", By.xpath("//*[@id=\"errorMessage\"]"));
        Assert.assertTrue(errorMessage.isElementPresent());
    }
        @After
        public void closeTest (){
            driver.close();
            WebDriverSingleton.destroyInstance();
        }

}