package web.element;

import element.Element;
import org.openqa.selenium.By;

public class CreateCandidate {
    public static String URL="http://testing.cld.iba.by/web/guest/recruiting/candidates";
    public static Element CREATE = new Element("Создать",By.xpath("//*[@id=\"createProfileButton\"]"));
    public static Element S_NAME = new Element("Фамилия",By.xpath("//*[@id=\"surname\"]"));
    public static Element F_NAME = new Element("Имя",By.xpath("//*[@id=\"name\"]"));
    public static Element SEC_NAME = new Element("Отчество",By.xpath("//*[@id=\"secondName\"]"));
    public static Element PHONE =  new Element("Телефон",By.xpath("//*[@id=\"primaryTelephone\"]"));
    public static Element E_MAIL = new Element("Почта",By.xpath("//*[@id=\"primaryEmail\"]"));
    public static Element SKYPE = new Element("Скайп",By.xpath("//*[@id=\"skype\"]"));
    public static Element COUNTRY = new Element("Страна",By.xpath("//*[@id=\"country\"]"));
    public static Element POSITION = new Element("Должность",By.xpath("//*[@id=\"desiredPosition\"]"));
    public static Element ADDITIONAL = new Element("Дополнительно",By.xpath("//*[@id=\"additionalInfo\"]"));
    public static Element SAVE = new Element("Сохранить",By.xpath("//*[@id=\"saveButton\"]"));
    public static String BACK_URL = "http://testing.cld.iba.by/web/guest/recruiting/candidates";
}
