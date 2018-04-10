package web.page;

import driver.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import web.element.UploadFife;

import java.nio.file.Path;
import java.nio.file.Paths;

public class UploadPage {

    WebDriver driver = WebDriverSingleton.getInstance();

    public void enterUploadPage() {
        driver.get(UploadFife.URL);
    }

    public void uploadPicture() {
        WebElement Element = driver.findElement(By.xpath("//input[@id='profileImage']"));
        Element.sendKeys(getAbsolutePath("resources/human.png"));
    }
    public void outPicture(){
        WebElement picture = driver.findElement(By.id("currentImage"));
        System.out.println(picture.getAttribute("src"));
    }

    private String getAbsolutePath(String file) {
        Path path = Paths.get(file);
        return path.toAbsolutePath().toString();
    }

}



