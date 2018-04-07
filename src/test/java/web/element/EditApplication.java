package web.element;

import element.Element;
import org.openqa.selenium.By;

public class EditApplication {
    public static String URL="http://testing.cld.iba.by/web/guest/recruiting/candidates";
    public static Element CANDIDATE_NAME = new Element ("Кандидат",
            By.xpath("//span[text()='Рогова Светлана Михайловна']\"']"));
    public static Element EDIT = new Element("Редактировать",By.xpath("//*[@id=\"editButton\"]"));
    public static Element COUNTRY = new Element("Страна",By.xpath("//*[@id=\"country\"]"));
    public static Element SAVE = new Element("Сохранить",By.xpath("//*[@id=\"saveButton\"]"));
    public static Element ADD_PHONE = new Element("Добавить телефон",By.xpath("//*[@id=\"addTelephoneButton\"]"));
    public static Element NUMBER_PHONE =new Element("Телефон",By.xpath("//*[@id=\"telephone\"]"));
}
