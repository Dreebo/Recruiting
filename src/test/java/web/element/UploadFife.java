package web.element;

import element.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UploadFife {
        public static String URL = "http://testing.cld.iba.by/web/guest/recruiting/candidates/-/candidates/createProfile";
        public static Element UPLOAD_IMG = new Element("Загрузка", By.xpath("//input[@id='profileImage']"));
        //public static Element PICTURE = new Element("Картинка",By.id("currentImage"));

}


