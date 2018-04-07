package web.element;

import element.Element;
import org.openqa.selenium.By;

public class Comment {
    public static String URL="http://testing.cld.iba.by/web/guest/recruiting/candidates";
    public static String URL_2="http://testing.cld.iba.by/web/guest/recruiting/candidates/-/candidates/16";
    public static Element CHECKBOX_NEW = new Element ("Чек бох НОВЫЙ", By.xpath("//*[@id=\"status_New\"]"));
    public static Element CHECKBOX_MOVING = new Element("Возможен переезд",By.xpath("//*[@id=\"relocation_0\"]/label"));
    public static Element CANDIDATE = new Element("Кандидат",By.xpath("//span[text()='Рогова Светлана Михайловна']"));
    public static Element COMMENT = new Element("Комментарий",By.xpath("//a[contains(@href,'#tab-4')]"));

}

//a[text() =»Preferences»][ancestor::*[@id=’header’]]
//a[contains(@href,'command?PFILE=Server_Status')]
//label[contains(text(), 'First Name:*')]/following-sibling::input[@value='james']
