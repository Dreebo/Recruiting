package test;

import org.junit.Before;
import org.junit.Test;
import web.models.UserModel;
import web.page.CommentPage;
import web.page.LoginPage;
import web.services.UserCredential;

public class TestComment {
    LoginPage lp = new LoginPage();
    CommentPage cp = new CommentPage();


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
    public void delete(){
      cp.enterCandidatesPage();
      cp.clickCheckboxNew();
      cp.clickCheckboxMoving();
      cp.enterCandidates();
      cp.clickComment();
    }
}
