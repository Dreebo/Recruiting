package test;

import driver.WebDriverSingleton;
import org.junit.Before;
import org.junit.Test;
import web.element.CreateCandidate;
import web.models.UserModel;
import web.page.CreateCandidatePage;
import web.page.LoginPage;
import web.services.UserCredential;

public class TestCreateCandidate {
    CreateCandidatePage cc = new CreateCandidatePage();
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
    public void createCandidate(){
        cc.enterCreateCandidate();
        cc.clickCreate();
        cc.typeSName("Петров");
        cc.typeFName("Иван");
        cc.typeSecName("Федорович");
        cc.typePhone("12334678");
        cc.typeMail("pi@re.by");
        cc.typeSkype("petrov32");
        cc.typeCountry("Литва");
        cc.typePosition("Менеджер");
        cc.typeAdditional("С хорошим чувством юмора");
        cc.clickSave();
        cc.enterBackCandidate();
    }


}
