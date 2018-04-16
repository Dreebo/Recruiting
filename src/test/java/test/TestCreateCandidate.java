//package test;
//
//import driver.WebDriverSingleton;
//import io.qameta.allure.*;
//import io.qameta.allure.junit4.DisplayName;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import web.element.CreateCandidate;
//import web.models.UserModel;
//import web.page.CreateCandidatePage;
//import web.page.LoginPage;
//import web.services.UserCredential;
//
//public class TestCreateCandidate {
//    private WebDriver driver = WebDriverSingleton.getInstance();
//    CreateCandidatePage cc = new CreateCandidatePage();
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
//    @DisplayName("Создание кандидата")
//    @Description("Создание кандидата за главного рекрутера")
//    @Feature("Подбор и адаптация")
//    @Story("Сценарий 1 – Создание Кандидата, заполнение обязательных полей")
//    @Severity(SeverityLevel.CRITICAL)
//    public void createCandidate(){
//        cc.enterCreateCandidate();
//        cc.clickCreate();
//        cc.typeSName("Петров");
//        cc.typeFName("Иван");
//        cc.typeSecName("Федорович");
//        cc.typePhone("12334678");
//        cc.typeMail("pi@re.by");
//        cc.typeSkype("petrov32");
//        cc.typeCountry("Литва");
//        cc.typePosition("Менеджер");
//        cc.typeAdditional("С хорошим чувством юмора");
//        cc.clickSave();
//        cc.enterBackCandidate();
//    }
//
//
//
//    @Test
//    @DisplayName("Создание кандидата")
//    @Description("Негативное создание кандидата")
//    @Feature("Подбор и адаптация")
//    @Story("Сценарий 2 – Создание кандидата без заполнения одного обязательного поля")
//    @Severity(SeverityLevel.CRITICAL)
//    public void saveCandidate(){
//        cc.enterCreateCandidate();
//        cc.clickCreate();
//        cc.typeFName("Николай");
//        cc.typeSecName("");
//        cc.typePhone("1234567");
//        cc.typeMail("rt@tc.by");
//        cc.typeSkype("ron45");
//        cc.typeCountry("Беларусь");
//        cc.clickSave();
//    }
//
//
//    @Test
//    @DisplayName("Создание кандидата")
//    @Description("Негативное создание кандидата")
//    @Feature("Подбор и адаптация")
//    @Story("Сценарий 3 – Создание кандидата без заполнение обязательных полей")
//    @Severity(SeverityLevel.CRITICAL)
//    public void saveNullCandidate(){
//        cc.enterCreateCandidate();
//        cc.clickCreate();
//        cc.clickSave();
//    }
//
//    @Test
//    @DisplayName("Создание кандидата")
//    @Description("Проверка на корректность")
//    @Feature("Подбор и адаптация")
//    @Story("Сценарий 4 – Сздание кандидата с некорректным номером телефона")
//    @Severity(SeverityLevel.TRIVIAL)
//    public void saveNumberCandidate(){
//        cc.enterCreateCandidate();
//        cc.clickCreate();
//        cc.typeSName("Гусев");
//        cc.typeFName("Иван");
//        cc.typeSecName("Федорович");
//        cc.typePhone("123456789012345678901234567890");
//        cc.typeMail("ram@re.by");
//        cc.clickSave();
//
//    }
//    @After
//    public void closeTest() {
//        driver.close();
//        WebDriverSingleton.destroyInstance();
//    }
//}
