package test;
import driver.WebDriverSingleton;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import web.page.CreateCandidatePage;
import web.page.UploadPage;



public class TestUploadFile {
    private WebDriver driver = WebDriverSingleton.getInstance();
    UploadPage up = new UploadPage();
    CreateCandidatePage cc = new CreateCandidatePage();

    @Test
    public void uploadFile(){

        login();
        up.enterUploadPage();
        up.uploadPicture();
        up.outPicture();
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
        private void login(){
            driver.get("http://testing.cld.iba.by/");
            driver.findElement(By.id("_58_login")).sendKeys("kabanov@tc.by");
            driver.findElement(By.id("_58_password")).sendKeys("welcome");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
        }


    @After
    public void shutDown() {
        driver.close();
        WebDriverSingleton.destroyInstance();
    }

    }


