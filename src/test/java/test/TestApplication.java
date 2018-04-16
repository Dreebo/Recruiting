package test;

import driver.WebDriverSingleton;
import element.Element;
import helper.Helper;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import web.models.UserModel;
import web.page.ApplicationPage;
import web.page.LoginPage;
import web.services.UserCredential;

public class TestApplication {

    private WebDriver driver = WebDriverSingleton.getInstance();
    ApplicationPage ap = new ApplicationPage();
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
    @DisplayName("Создание заявки")
    @Description("Создание заявки с согласованием")
    @Feature("Заявки")
    @Story("Сценарий 1– Создание заявки/выбор кандидата на согласование/согласование")
    @Severity(SeverityLevel.BLOCKER)
    public void createApplication() throws InterruptedException {
        ap.enterApplicationPage();
        ap.clickCreateApplication();
        ap.typePosition("Стажер");
        ap.typeQuantity("2");
        ap.typeCreationReason("Необходимость в сотрудниках");
        ap.typeSalary("600");
        ap.typeBusinessTrip("Отсутствие командировок");
        ap.typeTimeWork("9.00-17.00");
        ap.typeProbation("1 месяц");
        ap.clickCandidateExternal();
        ap.clickCompetence();
        ap.clickCompetence1();
        ap.moveCompetence2();
        ap.clickCompetence2();
        ap.clickOkCompetence();
        ap.clickSaveButton();
        ap.clickAgreement();
        ap.clickPartnerAgreement();
        ap.clickSelectPartner();
        ap.clickPartner();
        ap.clickOkButton();
        ap.clickApproveButton();
        //It is for waiting when overlay disappears.
        //TODO: should be refactor.
        Helper.wait(7);
        ap.clickApprove();
        Element message = new Element("Выполнено!Заявка была согласована", By.xpath("//*[@id=\"successMessage\"]"));
        Assert.assertTrue(message.isElementPresent());

    }


    @Test
    @DisplayName("Создание заявки")
    @Description("Создание заявки ")
    @Feature("Заявки")
    @Story("Сценарий 2– Создание заявки с заполнением всех обязательных полей")
    @Severity(SeverityLevel.BLOCKER)
    public void createApplicationFull(){
        ap.enterApplicationPage();
        ap.clickCreateApplication();
        ap.typePosition("Младший менеджер");
        ap.typeQuantity("2");
        ap.typeCreationReason("Необходимость в сотрудниках");
        ap.typeSalary("600");
        ap.typeBusinessTrip("Отсутствие командировок");
        ap.typeTimeWork("9.00-17.00");
        ap.typeProbation("1 месяц");
        ap.clickCandidateExternal();
        ap.clickCompetence();
        ap.clickCompetence1();
        ap.moveCompetence2();
        ap.clickCompetence2();
        ap.clickOkCompetence();
        ap.clickSaveButton();
        Element message = new Element("Выполнено!Заявка успешно сохранена", By.xpath("//*[@id=\"successMessage\"]"));
        Assert.assertTrue(message.isElementPresent());

    }

    @Test
    @DisplayName("Создание заявки")
    @Description("Создание заявки с согласованием")
    @Feature("Заявки/Вакансии")
    @Story("Сценарий 3 – Создание заявки/выбор кандидата на согласование/согласование/создание вакансии")
    @Severity(SeverityLevel.BLOCKER)
    public void createApplicationVacancy() throws InterruptedException {
        ap.enterApplicationPage();
        Helper.wait(5);
        ap.clickCreateApplication();
        ap.typePosition("Секретарь");
        ap.typeQuantity("2");
        ap.typeCreationReason("Необходимость в сотрудниках");
        ap.typeSalary("600");
        ap.typeBusinessTrip("Отсутствие командировок");
        ap.typeTimeWork("9.00-17.00");
        ap.typeProbation("1 месяц");
        ap.clickCandidateExternal();
        ap.clickCompetence();
        ap.clickCompetence1();
        ap.moveCompetence2();
        ap.clickCompetence2();
        ap.clickOkCompetence();
        ap.clickSaveButton();
        ap.clickAgreement();
        ap.clickPartnerAgreement();
        ap.clickSelectPartner();
        ap.clickPartner();
        ap.clickOkButton();
        ap.clickApproveButton();
        //It is for waiting when overlay disappears.
        //TODO: should be refactor.
        Helper.wait(7);
        ap.clickApprove();
        ap.clickCreateVacancy();
        ap.typeCloseDate("25.06.2018");
        ap.clickSaveVacancy();
        Element pageVacancy = new Element("Страница вакансии", By.xpath("//*[@id=\"p_p_id_TCVacancies_WAR_TCRecruitingAndOnboardingportlet_\"]"));
        Assert.assertTrue(pageVacancy.isElementPresent());

    }
    @After
    public void closeTest (){
        driver.close();
        WebDriverSingleton.destroyInstance();
    }

}
