package web.element;

import element.Element;
import org.openqa.selenium.By;

public class DeleteCandidate {
    public static String URL="http://testing.cld.iba.by/web/guest/recruiting/candidates";
    public static Element SEARCH = new Element("Искать", By.xpath("//*[@id=\"searchInput\"]"));
    public static Element BUTTON_SEARCH = new Element ("Кнопка искать",By.xpath("//*[@id=\"createProfileButton\"]"));
    public static Element CANDIDATE = new Element("Кандидат", By.xpath("//span[text()='Петров Иван Федорович']"));
    public static Element DELETE = new Element("Удалить",By.xpath("//*[@id=\"removeButton\"]"));
}

