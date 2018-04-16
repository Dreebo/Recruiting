package web.element;

import element.Element;
import org.openqa.selenium.By;

public class Question {
    public static String URL="http://testing.cld.iba.by/web/guest/recruiting/questions";
    public static String URL_PERS="http://testing.cld.iba.by/web/guest/recruiting/questions/-/questions/personal";
    public static Element ADD_QUESTION = new Element("", By.xpath("//*[@id=\"addBtn\"]"));
    public static Element SAVE_QUESTION = new Element("",By.xpath("//*[@id=\"saveQuestionButton\"]"));
    public static Element FIELD_QUESTION = new Element("",By.xpath("//*[@id=\"questionText\"]"));
    public static Element QUESTION_ANSWER = new Element("",By.xpath("//*[@id=\"questionAnswer\"]"));
    public static Element COMPETENCE = new Element("",By.xpath("//input[@class=\"ui-widget-content ui-autocomplete-input\"]"));
    public static Element CANCEL = new Element("",By.xpath("//*[@id=\"cancelQuestionButton\"]"));
    public static Element SEARCH = new Element("",By.xpath("//*[@id=\"searchQuestion\"]"));
}
